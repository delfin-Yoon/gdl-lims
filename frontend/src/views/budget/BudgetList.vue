<template>
  <div>
    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
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
        @click:row="rowClick"
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
        {
          text: '집행구분',
          value: 'transCateCd',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '과제번호',
          value: 'projectNo',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '과제명',
          value: 'projectTitle',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '사용목적',
          value: 'purpose',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '사업자명',
          value: 'corporate',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '결제금액',
          value: 'paymentAmount',
          width: 70,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '결제일자',
          value: 'paymentDate',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '결제시간',
          value: 'paymentTime',
          width: 50,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '카드번호',
          value: 'cardNo',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
      ],
      list: [
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-07-02',
          paymentTime: '12:00:00',
          paymentAmount: '13,500',
          corporate: '이태원샐러드',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-07-01',
          paymentTime: '12:00:00',
          paymentAmount: '30,000',
          corporate: '육쌈냉면',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-06-30',
          paymentTime: '12:00:00',
          paymentAmount: '35,700',
          corporate: '백소정 중앙대점',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-06-29',
          paymentTime: '12:00:00',
          paymentAmount: '25,900',
          corporate: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '연구재료 구입',
          paymentDate: '2021-06-25',
          paymentTime: '1,012:00:00',
          paymentAmount: '1,045,350',
          corporate: '(주)비엠에스',
          projectTitle: '연구재단-BRL 후속 3차',
          projectNo: '202102',
          cardNo: '5525-7641-9874-148',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '세이플러스 핸드타올[5000매/BOX] 외 11건',
          paymentDate: '2021-06-25',
          paymentTime: '2,812:00:00',
          paymentAmount: '2,845,700',
          corporate: '미노스',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '중대약대 이성훈 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '연구재료 구입',
          paymentDate: '2021-06-24',
          paymentTime: '2,712:00:00',
          paymentAmount: '2,734,600',
          corporate: '와이바이오텍',
          projectTitle: '연구재단-BRL 후속 3차',
          projectNo: '202102',
          cardNo: '5525-7641-9874-148',
          note: '',
        },
        {
          title: '시약.재료 및 전산처리.관리',
          purpose: 'MinElute Gel Extraction Kit (250)',
          paymentDate: '2021-06-24',
          paymentTime: '2,412:00:00',
          paymentAmount: '2,475,000',
          corporate: '와이바이오텍',
          projectTitle: '연구재단-창의-김미진 2차',
          projectNo: '20210',
          cardNo: '5525-7641-9967-647',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-06-24',
          paymentTime: '12:00:00',
          paymentAmount: '21,000',
          corporate: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'LIVE/DEAD™ Viability/Cytotoxicity Kit 외 1건',
          paymentDate: '2021-06-24',
          paymentTime: '2,812:00:00',
          paymentAmount: '2,809,400',
          corporate: '라이브셀시스',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'NF-k B p65 (D14E12) XP® Rabbit mAb 외 8건',
          paymentDate: '2021-06-24',
          paymentTime: '2,912:00:00',
          paymentAmount: '2,991,560',
          corporate: '주）넥서스테크놀로지스',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '202100',
          cardNo: '5525-7641-9934-8166',
          note: '중대약대 이성훈 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '300 eXTEND-c18, 2.1 x 150 MM, 3.5um 외 2건',
          paymentDate: '2021-06-24',
          paymentTime: '2,912:00:00',
          paymentAmount: '2,991,780',
          corporate: '주식회사 디엘텍',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-797',
          note: '아산병원 유현주 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose:
            'Power SYBR™ Green PCR Master Mix, 1 x 5 mL [Ca no. 4367659] 외 3건',
          paymentDate: '2021-06-23',
          paymentTime: '2,912:00:00',
          paymentAmount: '2,983,200',
          corporate: '주식회사 새론바이오',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-06-23',
          paymentTime: '12:00:00',
          paymentAmount: '30,000',
          corporate: '강여사의부엌',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'FBS패키지 PK004-07',
          paymentDate: '2021-06-22',
          paymentTime: '1,212:00:00',
          paymentAmount: '1,243,000',
          corporate: '주식회사 웰진',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '202100',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-06-22',
          paymentTime: '12:00:00',
          paymentAmount: '22,000',
          corporate: '(주)케이지모빌리언스-컴집',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '2021009',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'SPHINGANINE (D18:0) 외 8건',
          paymentDate: '2021-06-22',
          paymentTime: '2,712:00:00',
          paymentAmount: '2,798,400',
          corporate: '펠릭스바이오메드',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '2021009',
          cardNo: '5525-7641-9934-797',
          note: '아산병원 유현주 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '연구재료 구입',
          paymentDate: '2021-06-21',
          paymentTime: '2,612:00:00',
          paymentAmount: '2,695,000',
          corporate: '라온바이오(주)',
          projectTitle: '연구재단-BRL 후속 3차',
          projectNo: '20210264',
          cardNo: '5525-7641-9874-148',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          paymentDate: '2021-06-17',
          paymentTime: '12:00:00',
          paymentAmount: '24,900',
          corporate: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: ' ',
        },
      ],
    };
  },
  created() {
    this.getList();
  },
  mounted() {},
  methods: {
    getList() {
      this.$axios.get(`/api/budgets`).then(response => {
        console.log('response::', response);
        if (response.data) {
          this.list = response.data;
        }
      });
    },
    rowClick(row) {
      this.$router.push({
        name: 'budgetDetail',
        params: { transId: row.transId },
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
