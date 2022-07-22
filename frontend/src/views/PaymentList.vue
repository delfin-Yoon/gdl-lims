<template>
  <div>
    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">
        결제 내역 목록
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
        :headers="headers"
        :items="list"
        :items-per-page="10"
        :search="search"
        class="elevation-1"
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
      // startDate: (new Date(Date.now() - (new Date()).getTimezoneOffset() * 60000)).toISOString().substr(0, 10),
      // endDate: (new Date(Date.now() - (new Date()).getTimezoneOffset() * 60000)).toISOString().substr(0, 10),
      startDate: '',
      endDate: '',
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
        {
          text: '세목',
          value: 'title',
          width: 100,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '사용목적',
          value: 'purpose',
          width: 100,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '결제 일자',
          value: 'date',
          width: 30,
          align: 'center',
          sortable: true,
          class: 'grey lighten-2',
        },
        {
          text: '결제 금액',
          value: 'price',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '사업자명',
          value: 'businessName',
          width: 100,
          align: 'start',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '과제명',
          value: 'projectTitle',
          width: 80,
          align: 'start',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '과제번호',
          value: 'projectNo',
          width: 30,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        // { text: '카드번호', value: 'cardNo', width: 80, align: 'start', sortable: false, class: 'grey lighten-2' },
        // { text: '비고', value: 'note', width: 80, align: 'center', sortable: false, class: 'grey lighten-2' },
      ],
      list: [
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-07-02',
          price: '13,500',
          businessName: '이태원샐러드',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-07-01',
          price: '30,000',
          businessName: '육쌈냉면',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-30',
          price: '35,700',
          businessName: '백소정 중앙대점',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-29',
          price: '25,900',
          businessName: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '연구재료 구입',
          date: '2021-06-25',
          price: '1,045,350',
          businessName: '(주)비엠에스',
          projectTitle: '연구재단-BRL 후속 3차',
          projectNo: '202102',
          cardNo: '5525-7641-9874-148',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '세이플러스 핸드타올[5000매/BOX] 외 11건',
          date: '2021-06-25',
          price: '2,845,700',
          businessName: '미노스',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '중대약대 이성훈 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '연구재료 구입',
          date: '2021-06-24',
          price: '2,734,600',
          businessName: '와이바이오텍',
          projectTitle: '연구재단-BRL 후속 3차',
          projectNo: '202102',
          cardNo: '5525-7641-9874-148',
          note: '',
        },
        {
          title: '시약.재료 및 전산처리.관리',
          purpose: 'MinElute Gel Extraction Kit (250)',
          date: '2021-06-24',
          price: '2,475,000',
          businessName: '와이바이오텍',
          projectTitle: '연구재단-창의-김미진 2차',
          projectNo: '20210',
          cardNo: '5525-7641-9967-647',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-24',
          price: '21,000',
          businessName: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'LIVE/DEAD™ Viability/Cytotoxicity Kit 외 1건',
          date: '2021-06-24',
          price: '2,809,400',
          businessName: '라이브셀시스',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'NF-k B p65 (D14E12) XP® Rabbit mAb 외 8건',
          date: '2021-06-24',
          price: '2,991,560',
          businessName: '주）넥서스테크놀로지스',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '202100',
          cardNo: '5525-7641-9934-8166',
          note: '중대약대 이성훈 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '300 eXTEND-c18, 2.1 x 150 MM, 3.5um 외 2건',
          date: '2021-06-24',
          price: '2,991,780',
          businessName: '주식회사 디엘텍',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-797',
          note: '아산병원 유현주 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose:
            'Power SYBR™ Green PCR Master Mix, 1 x 5 mL [Ca no. 4367659] 외 3건',
          date: '2021-06-23',
          price: '2,983,200',
          businessName: '주식회사 새론바이오',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-23',
          price: '30,000',
          businessName: '강여사의부엌',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210095',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'FBS패키지 PK004-07',
          date: '2021-06-22',
          price: '1,243,000',
          businessName: '주식회사 웰진',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '202100',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-22',
          price: '22,000',
          businessName: '(주)케이지모빌리언스-컴집',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '2021009',
          cardNo: '5525-7641-9934-8166',
          note: '',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: 'SPHINGANINE (D18:0) 외 8건',
          date: '2021-06-22',
          price: '2,798,400',
          businessName: '펠릭스바이오메드',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '2021009',
          cardNo: '5525-7641-9934-797',
          note: '아산병원 유현주 교수님',
        },
        {
          title: '시약.재료 구입비 및 전산 처리.관리비',
          purpose: '연구재료 구입',
          date: '2021-06-21',
          price: '2,695,000',
          businessName: '라온바이오(주)',
          projectTitle: '연구재단-BRL 후속 3차',
          projectNo: '20210264',
          cardNo: '5525-7641-9874-148',
          note: '',
        },
        {
          title: '연구과제 운영비',
          purpose: '과제 참여연구원 야근 식대',
          date: '2021-06-17',
          price: '24,900',
          businessName: '나이스페이먼츠 주식회사',
          projectTitle: '환경부-익스포좀 5차',
          projectNo: '20210',
          cardNo: '5525-7641-9934-8166',
          note: ' ',
        },
      ],
    };
  },
  created() {},
  mounted() {},
  methods: {
    test() {
      console.log('test');
    },
  },
};
</script>
