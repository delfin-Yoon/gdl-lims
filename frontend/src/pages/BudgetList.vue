<template>
  <div>
    <!-- 목록 S -->
    <v-card
      class="pa-3 my-5 mx-16"
      elevation="1"
      outlined
    >
      <v-card-title class="my-n2">
        결제 내역 목록
        <v-spacer />
        <!-- <v-text-field
          v-model="search"
          append-icon="mdi-magnify"
          label="Search"
          single-line
          hide-details
        /> -->
      </v-card-title>
      <v-divider class="mx-4 mb-10" />

      <v-data-table
        :headers="headers"
        :items="list"
        class="elevation-1"
        hide-default-footer
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
      startDate: '',
      endDate: '',
      menu1: false,
      menu2: false,
      typeList: ['전체'],

      // Grid 설정
      headers: [
        { text: '세목', value: 'title', width: 100, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '사용목적', value: 'purpose', width: 100, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '결제 일자', value: 'date', width: 30, align: 'center', sortable: true, class: 'grey lighten-2' },
        { text: '결제 금액', value: 'price', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
        { text: '사업자명', value: 'businessName', width: 100, align: 'start', sortable: false, class: 'grey lighten-2' },
        { text: '과제명', value: 'projectTitle', width: 80, align: 'start', sortable: false, class: 'grey lighten-2' },
        { text: '과제번호', value: 'projectNo', width: 30, align: 'center', sortable: false, class: 'grey lighten-2' },
      ],
      list: [
        { title: '연구과제 운영비', purpose: '과제 참여연구원 야근 식대', date: '2021-07-02', price: '13,500', businessName: '이태원샐러드', projectTitle: '환경부-익스포좀 5차', projectNo: '20210095', cardNo: '5525-7641-9934-8166', note: '' },
        {  purpose: '과제 참여연구원 야근 식대', date: '2021-07-01', price: '30,000', businessName: '육쌈냉면', projectTitle: '환경부-익스포좀 5차', projectNo: '20210095', cardNo: '5525-7641-9934-8166', note: '' },
        { title: '연구과제 운영비', purpose: '과제 참여연구원 야근 식대', date: '2021-06-30', price: '35,700', businessName: '백소정 중앙대점', projectTitle: '환경부-익스포좀 5차', projectNo: '20210', cardNo: '5525-7641-9934-8166', note: '' },
        { title: '연구과제 운영비', purpose: '과제 참여연구원 야근 식대', date: '2021-06-29', price: '25,900', businessName: '나이스페이먼츠 주식회사', projectTitle: '환경부-익스포좀 5차', projectNo: '20210', cardNo: '5525-7641-9934-8166', note: '' },
      ]
    }
  },
  created: function() {
   },
  mounted: function() {
  },
  methods: {
    test: function() {
      console.log('test');
    }
  }
}
</script>
