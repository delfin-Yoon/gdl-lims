<template>
  <div>
    <!-- 목록 S -->
    <v-card
      class="pa-3 my-5 mx-16"
      elevation="1"
      outlined
    >
      <v-card-title class="my-n2">
        예산 목록
        <v-spacer />
        <v-text-field
          v-model="search"
          append-icon="mdi-magnify"
          label="Search"
          single-line
          hide-details
        />
      </v-card-title>
      <v-divider class="mx-4 mb-10" />
      <v-data-table
        class="elevation-1"
        :headers="headers"
        :items="list"
        :items-per-page="10"
        :search="search"
        @click:row="budgetClick"
        style="cursor: pointer;"
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
  data () {
    return {
      typeList: ['전체'],

      // 페이징
      page: 1,

      // 검색
      search: '',

      // Grid 설정
      headers: [
        { text: '집행구분', value: 'transCateCd', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '과제번호', value: 'projectNo', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '과제명', value: 'projectTitle', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '사용목적', value: 'purpose', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '사업자명', value: 'corporate', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '결제금액', value: 'paymentAmount', width: 70, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '결제일자', value: 'paymentDate', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '결제시간', value: 'paymentTime', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '카드번호', value: 'cardNo', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
      ],
      list: []
    }
  },
  created: function() {
  },
  mounted: function() {
    // this.getList();
  },
  methods: {
    getList: function() {
      this.$axios.get(`/api/budgets`).then(response => {
        console.log("response::", response);
        this.list = response.data;
      });
    },
    budgetClick: function(budget) {
      this.$router.push({
        name: 'budgetDetail',
        params: { transId: budget.transId },
      });
    }
  }
}
</script>

<style scoped>
/* .v-data-table tbody  tr {
  cursor: pointer;
} */
</style>
