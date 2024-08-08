<template>
  <div>
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">Search</v-card-title>
      <v-container class="pt-2" fluid>
        <v-row dense>
          <v-col cols="3">
            <v-autocomplete 
              v-model="selectedSampleList"
              label="* Chemical"
              :items="sampleList"
              required
              dense
              multiple
            >
              <template v-slot:prepend-item>
                <v-list-item
                  ripple
                  @mousedown.prevent
                  @click="toggleSample"
                >
                  <v-list-item-action>
                    <v-icon :color="selectedSampleList.length > 0 ? 'indigo darken-4' : ''">
                      {{ iconSample }}
                    </v-icon>
                  </v-list-item-action>
                  <v-list-item-content>
                    <v-list-item-title>
                      Select All
                    </v-list-item-title>
                  </v-list-item-content>
                </v-list-item>
                <v-divider class="mt-2"></v-divider>
              </template>
            </v-autocomplete>
          </v-col>
          <v-col cols="3">
            <v-autocomplete
              v-model="selectedCellList"
              label="* Cell Line"
              :items="cellList"
              required
              dense
              multiple
            >
              <!-- <template v-slot:prepend-item>
                <v-list-item
                  ripple
                  @mousedown.prevent
                  @click="toggleCell"
                >
                  <v-list-item-action>
                    <v-icon :color="selectedCellList.length > 0 ? 'indigo darken-4' : ''">
                      {{ iconCell }}
                    </v-icon>
                  </v-list-item-action>
                  <v-list-item-content>
                    <v-list-item-title>
                      Select All
                    </v-list-item-title>
                  </v-list-item-content>
                </v-list-item>
                <v-divider class="mt-2"></v-divider>
              </template> -->
            </v-autocomplete>
          </v-col>
          <v-col cols="3">
            <v-select
              v-model="expType"
              label="* Expression Type"
              :items="expTypeList"
              item-text="text"
              item-value="value"
              required
              dense
            />
          </v-col>
          <v-col cols="3">
            <v-select 
              v-model="searchType"
              label="* Searching Type"
              :items="searchTypeList"
              item-text="text"
              item-value="value"
              dense
            />
              <!-- :label="type == 'Gene' ? '' : ''" -->
          </v-col>
          <v-col>
            <v-textarea 
              v-model="searchText"
              label="Search Text"
              rows="3"
              row-height="25"
              no-resize
              outlined
            />
          </v-col>
        </v-row>
        <v-row justify="end" dense>
          <v-btn class="mx-1" width="80" color="primary" @click="searchClick">Search</v-btn>
          <v-btn class="mx-1 white--text" width="80" color="blue-grey" @click="csvClick">CSV</v-btn>
          <v-btn class="mx-1 white--text" width="80" color="blue-grey" @click="graphClick">Graph</v-btn>
          <v-btn class="ml-1" width="80" @click="resetClick">Reset</v-btn>
        </v-row>
      </v-container>
    </v-card>
    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">
        RNA Expression List
        <!-- <v-spacer /> -->
        <!-- <v-text-field
          v-model="search"
          append-icon="mdi-magnify"
          label="Search"
          single-line
          hide-details
        /> -->
        <v-card-subtitle>
          {{ currentCnt }} / {{ totalCnt }}
        </v-card-subtitle>
      </v-card-title>
      <!-- <v-divider class="mx-4 mb-10" /> -->
        <!-- :search="search" -->
      <v-data-table
        class="elevation-1 ma-2"
        :headers="headers"
        :items="list"
        :items-per-page="50"
      />
      <!-- <v-pagination
        v-model="page"
        :length="6"
      ></v-pagination> -->
    </v-card>
    <!-- 목록 E -->
  </div>
</template>

<script>
import { log } from 'vue-plotly';
import * as qs from 'qs';

export default {
  data() {
    return {
      // 검색조건
      sampleList: [],
      cellList: [],

      selectedSampleList: [],
      selectedCellList: [],

      expType: 'G',
      searchType: '',
      
      expTypeList: [
        {text: 'Gene', value: 'G'},
        {text: 'Transcript', value: 'T'},
      ],
      searchTypeList: [
        {text: 'Ensembl', type: 'E'},
        {text: 'Symbol', type: 'S'},
      ],
      searchText: '',

      // 페이징
      page: 1,

      // Grid 설정
      headers: [],
      list: [],

      currentCnt: 0,
      totalCnt: 0,
    };
  },
  computed: {
    selectAllSample () {
      return this.selectedSampleList.length == this.sampleList.length
    },
    selectSomeSample () {
      return this.selectedSampleList.length > 0 && !this.selectAllSample
    },
    iconSample () {
      if (this.selectAllSample) return 'mdi-close-box'
      if (this.selectSomeSample) return 'mdi-minus-box'
      return 'mdi-checkbox-blank-outline'
    },
    selectAllCell () {
      return this.selectedCellList.length == this.cellList.length
    },
    selectSomeCell () {
      return this.selectedCellList.length > 0 && !this.selectAllCell
    },
    iconCell () {
      if (this.selectAllCell) return 'mdi-close-box'
      if (this.selectSomeCell) return 'mdi-minus-box'
      return 'mdi-checkbox-blank-outline'
    },
  },
  created() {
    // 검색조건 목록 조회 (SampleName, CellName)
    this.$axios.get(`/api/conditionList`).then(response => {
      // console.log('response::', response);
      this.sampleList = response.data.sampleNameList;
      this.cellList = response.data.cellNameList;
      
    });
  },

  mounted() {
    this.changeHeaders();
  },
  methods: {
    // 초기화
    init() {
      this.sampleList = [];
      this.cellList = [];
      this.selectedSampleList = [];
      this.selectedCellList = [];
      this.expType = 'G';
      this.list = [];

      this.changeHeaders();
    },
    // ExpressionList API
    getList() {
      let url = '';

      console.log(this.expType);
      if(this.expType === 'G') {
        url = '/api/geneExp';
      } else if (this.expType === 'T') {
        url = '/api/transExp';
      }

      this.$axios.get(url + '?' + qs.stringify({
          sampleList: this.selectedSampleList.join(','),
          cellList: this.selectedCellList.join(','),
          expType: this.expType,
          searchType: this.searchType,
          searchText: this.searchText
        })
      ).then(response => {
        console.log('response::', response);
        this.list = response.data.list;
        this.changeHeaders();
        
        this.totalCnt = response.data.totalCnt;
      });
    },
    // Search 버튼 클릭
    searchClick() {
      console.log('search clicked..');
      this.getList();
    }, 
    // Reset 버튼 클릭
    resetClick() {
      this.init();
    },
    csvClick() {
      console.log('csv download');
    },
    graphClick() {
      console.log('graph download');
    },
    // Table 헤더 변경
    changeHeaders() {
      if(this.expType === 'G') {
        // Gene
        this.headers = [
          { text: 'No.',        value: 'index',       width: 10, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chemical',   value: 'sampleName', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Cell Line',  value: 'cellName',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Gene Symbol', value: 'geneName',  width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'FPKM',       value: 'fpkm',        width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'TPM',        value: 'tpm',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Ensembl ID', value: 'geneId',     width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chromosome', value: 'chromosome',  width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Start',      value: 'start',       width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'End',        value: 'end',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'BioType',    value: 'biotype',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        ];

      } else {
        // Transcript
        this.headers = [
          { text: 'No.',          value: 'index',       width: 10, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chemical',     value: 'sampleName', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Cell Line',    value: 'cellName',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Transcript Symbol', value: 'transName', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'FPKM',         value: 'fpkm',        width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'TPM',          value: 'tpm',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Ensembl ID',   value: 'transId',    width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chromosome',   value: 'chromosome',  width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Start',        value: 'start',       width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'End',          value: 'end',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'BioType',      value: 'biotype',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Gene Symbol',  value: 'geneName',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Ensembl ID',   value: 'geneId',     width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        ];
      }
    },
    toggleSample() {
      this.$nextTick(() => {
        if (this.selectAllSample) {
          this.selectedSampleList = []
        } else {
          this.selectedSampleList = this.sampleList.slice()
        }
      })
    },
    toggleCell() {
      this.$nextTick(() => {
        if (this.selectAllCell) {
          this.selectedCellList = []
        } else {
          this.selectedCellList = this.cellList.slice()
        }
      })
    }
  },
};
</script>

<style scoped>
/* .v-data-table tbody  tr {
  cursor: pointer;
} */
.v-btn {
  text-transform: unset !important;
}
</style>
