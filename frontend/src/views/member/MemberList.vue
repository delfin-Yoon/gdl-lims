<template>
  <div>
    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">
        회원 목록
        <!-- test s -->
        <!-- <a href="http://192.168.0.7/">link test</a> -->
        <!-- test e -->
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
        style="cursor: pointer"
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
      typeList: ['전체'],

      // 페이징
      page: 1,

      // 검색
      search: '',

      // Grid 설정
      headers: [
        // { text: 'No.', value: 'index', width: 10, align: 'center', sortable: false, class: 'grey lighten-2' },
        {
          text: '회원ID',
          value: 'memberId',
          width: 50,
          align: 'left',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '회원명',
          value: 'korName',
          width: 30,
          align: 'left',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '회원명(영문)',
          value: 'engName',
          width: 30,
          align: 'left',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '휴대폰번호',
          value: 'mobileNo',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: 'email',
          value: 'email',
          width: 30,
          align: 'left',
          sortable: false,
          class: 'grey lighten-2',
        },
      ],
      list: [],
    };
  },
  created() {
    this.getList();
  },
  mounted() {},
  methods: {
    getList() {
      this.$axios.get(`/api/members`).then(response => {
        console.log('response::', response);
        this.list = response.data.list;
      });
    },
    memberClick(member) {
      console.log('memberClick value: ', member);
      console.log('memberClick memberId:', member.memberId);
      this.$router.push({
        name: 'MemberDetail',
        // path: './memberDetail',
        params: { memberId: member.memberId },
      });
    },
  },
};
</script>

<style scoped>
/* .v-data-table tbody  tr {
  cursor: pointer;
} */
</style>
