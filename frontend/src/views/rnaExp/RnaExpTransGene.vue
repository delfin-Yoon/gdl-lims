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
              item-text="name"
              item-value="id"
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
              v-model="cellList"
              label="* Cell Line"
              required
              dense
              multiple
            />
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
              :items="searchTypeList.filter(obj => obj.type == expType)"
              item-text="text"
              item-value="value"
              dense
              multiple
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
          0/10
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
export default {
  data() {
    return {
      // 검색조건
      sampleList: [
        // test data
        {id: 'S240000001', name: 'AC',	cell: 'H1299'},
        {id: 'S240000002', name: 'BAP',	cell: 'H1299'},
        {id: 'S240000003', name: 'BPA',	cell: 'H1299'},
        {id: 'S240000004', name: 'BPF',	cell: 'H1299'},
        {id: 'S240000005', name: 'BPS',	cell: 'H1299'},
        {id: 'S240000006', name: 'Benzene',	cell: 'H1299'},
        {id: 'S240000007', name: 'Cdcl2',	cell: 'H1299'},
        {id: 'S240000008', name: 'Ch',	cell: 'H1299'},
        {id: 'S240000009', name: 'Cotinine',	cell: 'H1299'},
        {id: 'S240000010', name: 'DEHP',	cell: 'H1299'},
      ],
      cellList: [
        // test data
      ],

      selectedSampleList: [],
      selecgtedCellList: [],

      expType: 'G',
      searchType: '',
      expTypeList: [
        {text: 'Gene', value: 'G'},
        {text: 'Transcript', value: 'T'},
      ],
      searchTypeList: [
        {text: 'Transcript Ensembl', value: 'TE', type: 'T'},
        {text: 'Transcript Symbol', value: 'TS', type: 'T'},
        {text: 'Gene Ensembl', value: 'GE', type: 'G'},
        {text: 'Gene Symbol', value: 'GS', type: 'G'},
      ],
      searchText: '',

      // 페이징
      page: 1,

      // Grid 설정
      headers: [],
      list: [],
    };
  },
  computed: {
    selectAllSample () {
      console.log(this.selectedSampleList.length === this.sampleList.length);
      return this.selectedSampleList.length === this.sampleList.length
    },
    selectSomeSample () {
      console.log(this.selectedSampleList.length);
      console.log(this.selectedSampleList, !this.selectedSampleList);
      return this.selectedSampleList.length > 0 && !this.selectAllSample
    },
    iconSample () {
      if (this.selectAllSample) return 'mdi-close-box'
      if (this.selectSomeSample) return 'mdi-minus-box'
      return 'mdi-checkbox-blank-outline'
    },

    selectAllCell () {
      console.log(this.selectedCellList.length === this.CellList.length);
      return this.selectedCellList.length === this.CellList.length
    },
    selectSomeCell () {
      console.log(this.selectedCellList.length);
      console.log(this.selectedCellList, !this.selectedCellList);
      return this.selectedCellList.length > 0 && !this.selectAllCell
    },
    iconCell () {
      if (this.selectAllCell) return 'mdi-close-box'
      if (this.selectSomeCell) return 'mdi-minus-box'
      return 'mdi-checkbox-blank-outline'
    },
  },
  mounted() {
    // 기본 검색조건 코드 조회 로직 추가 (sampleList, cellList)

    this.$axios.get(`/api/conditionList`).then(response => {
        console.log('response::', response);
      });

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
      // api 호출 후 changeHeaders(); 호출
      console.log('getList()');

      this.$axios.get(`/api/members`).then(response => {
        console.log('response::', response);
        this.list = response.data.list;
      });
    },
    // Search 버튼 클릭
    searchClick() {
      this.getList();

      // TEST
      this.changeHeaders();
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
      if(this.expType == 'Gene') {
        // Gene
        this.headers = [
          { text: 'No.',        value: 'index',       width: 10, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chemical',   value: 'sample_name', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Cell Line',  value: 'cell_name',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Gene Symbol', value: 'gene_name',  width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'FPKM',       value: 'fpkm',        width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'TPM',        value: 'tpm',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Ensembl ID', value: 'gene_id',     width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chromosome', value: 'chromosome',  width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Start',      value: 'start',       width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'End',        value: 'end',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'BioType',    value: 'biotype_g',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        ];

      } else {
        // Transcript
        this.headers = [
          { text: 'No.',          value: 'index',       width: 10, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chemical',     value: 'sample_name', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Cell Line',    value: 'cell_name',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Transcript Symbol', value: 'trans_name', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'FPKM',         value: 'fpkm',        width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'TPM',          value: 'tpm',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Ensembl ID',   value: 'trans_id',    width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Chromosome',   value: 'chromosome',  width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Start',        value: 'start',       width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'End',          value: 'end',         width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'BioType',      value: 'biotype_t',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Gene Symbol',  value: 'gene_name',   width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
          { text: 'Ensembl ID',   value: 'gene_id',     width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
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
