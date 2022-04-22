<template>
  <div>
    <!-- 목록 S -->
    <v-card
      class="pa-3 my-5 mx-16"
      elevation="1"
      outlined
    >
      <v-card-title class="my-n2">
        회원 목록
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
        @click:row="memberClick"
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
      menu1: false,
      menu2: false,
      typeList: ['전체'],

      // 페이징
      page: 1,

      // 검색
      search: '',

      // Grid 설정
      headers: [
        // { text: 'No.', value: 'index', width: 10, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '회원ID', value: 'memberId', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '회원명', value: 'korName', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '회원명(영문)', value: 'engName', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '소속기관명', value: 'affiliation', width: 70, align: 'center', sortable: true, class: 'grey lighten-2' },
        { text: '연구자등록번호', value: 'researcherId', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '휴대폰번호', value: 'mobileNo', width: 50, align: 'center', sortable: false, class: 'grey lighten-2' },
        // { text: '주민등록번호', value: '', width: 50, align: 'start', sortable: false, class: 'grey lighten-2' },
        { text: '직위/직급', value: 'position', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: 'email', value: 'email', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
      ],
      list: [
        {memberId: 'test1', korName: '김정웅', engName: 'Jung Woong Kim', affiliation: '중앙대학교', researcherId: '10156549', mobileNo: '01085140093', position: '부교수', email: 'jungkim@cau.ac.kr'},
        {memberId: 'test2', korName: '김진호', engName: 'Jinho Kim', affiliation: '중앙대학교', researcherId: '11310565', mobileNo: '01091370369', position: '연구원', email: 'jinhokim07@cau.ac.kr'},
        {memberId: 'test3', korName: '차민지', engName: 'Min Ji Cha', affiliation: '중앙대학교', researcherId: '11786009', mobileNo: '01035379874', position: '연구원', email: 'ttl7863@gmail.com'},
      ]
    }
  },
  created: function() {
  },
  mounted: function() {
    this.getList();
  },
  methods: {
    getList: function() {
      this.$axios.get(`/api/members`).then(response => {
        console.log("response::", response);
        this.list = response.data;
      });
    },
    memberClick: function(member) {
      console.log('memberClick value: ', member);
      this.$router.push({
        // path: './memberDetail',
        path: './memberCreate',
        params: { memberId: member.memberId }
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
