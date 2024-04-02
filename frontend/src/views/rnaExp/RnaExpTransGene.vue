<template>
  <div>
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">Search</v-card-title>
      <v-container class="pt-2" fluid>
        <v-row dense>
          <v-col cols="3">
            <v-autocomplete 
              v-model="sampleName"
              label="* Sample Name"
              required
            />
          </v-col>
          <v-col cols="3">
            <v-autocomplete
              v-model="cellName"
              label="* Cell Name"
              required
            />
          </v-col>
          <v-col cols="3">
            <v-select
              v-model="type"
              label="* Type"
              :items="typeList"
              required
            />
          </v-col>
          <v-col cols="3">
            <v-autocomplete 
              label="Condition 4"
            />
          </v-col>
          <v-col cols="3">
            <v-autocomplete 
              label="Condition 5"
            />
          </v-col>
          <v-col cols="3">
            <v-autocomplete 
              label="Condition 6"
            />
          </v-col>
          <v-col cols="3">
            <v-autocomplete 
              label="Condition 7"
            />
          </v-col>
          <v-col cols="3">
            <v-autocomplete 
              label="Condition 8"
            />
          </v-col>
        </v-row>
        <v-row justify="end" dense>
          <v-btn class="mx-2" color="primary" @click="searchClick">search</v-btn>
          <v-btn class="ml-2" @click="resetClick">reset</v-btn>
        </v-row>
      </v-container>
    </v-card>
    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined >
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
      </v-card-title>
      <!-- <v-divider class="mx-4 mb-10" /> -->
        <!-- :search="search" -->
      <v-data-table
        class="elevation-1 ma-2"
        :headers="headers"
        :items="list"
        :items-per-page="50"
        @click:row="memberClick"
        
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
      sampleName: '',
      cellName: '',
      type: '',
      typeList: ['Gene', 'Transcript'],

      // 페이징
      page: 1,

      // Grid 설정
      headers: [
        { text: 'No.',
         value: 'index',
         width: 10,
         align: 'center',
         sortable: false,
         class: 'grey lighten-2',
        },
        // {
        //   text: '',
        //   value: '',
        //   width: 30,
        //   align: 'left',
        //   sortable: false,
        //   class: 'grey lighten-2',
        // },
        {
          text: 'ID',
          value: '',
          width: 30,
          align: 'left',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: 'Sample Name',
          value: '',
          width: 50,
          align: 'left',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: 'FPKM',
          value: '',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: 'TPM',
          value: '',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: 'Start',
          value: '',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: 'End',
          value: '',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
      ],
      list: [],
    };
  },
  mounted() {},
  methods: {
    searchClick() {
      console.log('searchClick methods()');
    }, 
    resetClick() {
      this.sampleName = '';
      this.cellName = '';
      this.type = '';
    }
  },
};
</script>

<style scoped>
/* .v-data-table tbody  tr {
  cursor: pointer;
} */
</style>
