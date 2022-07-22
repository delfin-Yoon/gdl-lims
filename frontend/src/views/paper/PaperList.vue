<template>
  <div>
    <!-- 검색조건 영역 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-row class="mb-n10">
        <!-- 날짜 -->
        <v-col cols="12" sm="6" md="2">
          <v-menu
            v-model="menu1"
            :close-on-content-click="false"
            :nudge-right="40"
            transition="scale-transition"
            offset-y
            min-width="auto"
          >
            <template v-slot:activator="{ on, attrs }">
              <v-text-field
                v-model="startDate"
                label="Start Date"
                prepend-icon="mdi-calendar"
                readonly
                v-bind="attrs"
                v-on="on"
              />
            </template>
            <v-date-picker v-model="startDate" @input="menu1 = false" />
          </v-menu>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <v-menu
            v-model="menu2"
            :close-on-content-click="false"
            :nudge-right="40"
            transition="scale-transition"
            offset-y
            min-width="auto"
          >
            <template v-slot:activator="{ on, attrs }">
              <v-text-field
                v-model="endDate"
                label="End Date"
                prepend-icon="mdi-calendar"
                readonly
                v-bind="attrs"
                v-on="on"
              />
            </template>
            <v-date-picker v-model="endDate" @input="menu2 = false" />
          </v-menu>
        </v-col>

        <!-- 항목 -->
        <v-col class="d-flex" cols="12" sm="6" md="2">
          <v-select :items="typeList" label="항목" outlined />
        </v-col>
      </v-row>

      <v-row class="mb-n10">
        <!-- 제목 -->
        <v-col cols="12" sm="6" md="4">
          <v-text-field label="제목" outlined />
        </v-col>

        <!-- 저자명 -->
        <v-col cols="12" sm="6" md="4">
          <v-text-field label="저자명" outlined />
        </v-col>
        <v-col align="end" align-self="center">
          <v-btn elevation="2" @click="true"> search </v-btn>
        </v-col>
      </v-row>

      <!-- <v-row>
        <v-col
          align="end"
        >
          <v-btn
            elevation="2"
          >search</v-btn>
        </v-col>
      </v-row> -->
    </v-card>
    <!-- 검색조건 영역 E -->

    <!-- 목록 S -->
    <v-card class="pa-3 my-5 mx-16" elevation="1" outlined>
      <v-card-title class="my-n2">
        논문 목록
        <v-spacer />
      </v-card-title>
      <v-divider class="mx-4 mb-10" />
      <v-data-table
        :headers="headers"
        :items="list"
        :items-per-page="5"
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
      typeList: ['전체', '논문', '특허', '저작권', '학회'],

      // 페이징
      page: 1,

      // Grid 설정
      headers: [
        {
          text: 'No.',
          value: 'index',
          width: 10,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '날짜',
          value: 'date',
          width: 50,
          align: 'center',
          sortable: true,
          class: 'grey lighten-2',
        },
        {
          text: '항목 (논문/특허/저작권/학회)',
          value: 'type',
          width: 80,
          align: 'center',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '제목',
          value: 'title',
          width: 150,
          align: 'start',
          sortable: false,
          class: 'grey lighten-2',
        },
        {
          text: '저자명',
          value: 'author',
          width: 200,
          align: 'start',
          sortable: false,
          class: 'grey lighten-2',
        },
      ],
      list: [
        {
          index: 1,
          date: '2006-03-32',
          type: '논문',
          title:
            'p19ras Interacts with and Activates p73 by Involving the MDM2 Protein*',
          author:
            'Mi-Hee Jeong‡1, Jeehyeon Bae§1, Won-Ho Kim¶, Sang-Mi Yoo‡, Jung-Woong Kim‡, Peter I. Song, Kyung-Hee Choi‡2',
        },
        {
          index: 2,
          date: '2006-06-30',
          type: '논문',
          title:
            'Functional cross-talk between p73β and NF-jB mediated by p300',
          author:
            'Sang-Mi Ryou a,1, Kyung-Hwa Kang a,1, Mi-Hee Jeong a, Jung-Woong Kim a, Joo-Hee An a, So-Youn Lee a, Sangmin Jang a, Peter I. Song b, Kyung-Hee Choi a,*',
        },
        {
          index: 3,
          date: '2008-07-18',
          type: '논문',
          title:
            'TIP60 Represses Transcriptional Activity of p73β via an MDM2-bridged Ternary Complex',
          author:
            'Jung-Woong Kim‡1, Peter I. Song§1,Mi-Hee Jeong‡, Joo-Hee An‡, So-Youn Lee‡, Sang-Min Jang‡, Ki-Hyun Song‡, Cheryl A. Armstrong§, and Kyung-Hee Choi‡2 ',
        },
        {
          index: 4,
          date: '2008-08-15',
          type: '논문',
          title:
            'p19ras amplifies p73β-induced apoptosis through mitochondrial pathway',
          author:
            'Jung-Woong Kim a,1, Won-Ho Kim b,1, Mi-Hee Jeong a, Sang-Min Jang a, Ki-Hyun Song a, Sang-Ick Park b, Peter I. Song c, Kyung-Hwa Kang d, Kyung-Hee Choi a,*',
        },
        {
          index: 5,
          date: '2008-08-20',
          type: '논문',
          title:
            'Microtubule-associated Protein 1B Light Chain (MAP1B-LC1) negatively regulates the activity of tumor suppressor p53 in neuroblastoma cells',
          author:
            'So-Youn Lee1, Jung-Woong Kim1, Mi-Hee Jeong, Joo-Hee An, Sang-Min Jang, Ki-Hyun Song, Kyung-Hee Choi*',
        },
        {
          index: 6,
          date: '2009-12-30',
          type: '논문',
          title:
            'p19ras Accelerates p73β-mediated Apoptosis through a Caspase-3 Dependent Pathway',
          author: 'Sang-Min Jang†, Jung-Woong Kim†, and Kyung-Hee Choi*',
        },
        {
          index: 7,
          date: '2010-03-01',
          type: '논문',
          title:
            'p19ras Represses proliferation of non-small cell lung cancer possibly through interaction with Neuron-Specific Enolase (NSE)',
          author:
            'Sang-Min Jang 1, Jung-Woong Kim 1, Chul-Hong Kim, Daehwan Kim, Sangmyung Rhee, Kyung-Hee Choi *',
        },
        {
          index: 8,
          date: '2010-10-01',
          type: '논문',
          title:
            'Control of transferrin expression by b-amyloid through the CP2 transcription factor',
          author:
            'Sang-Min Jang1,*, Jung-Woong Kim1,*, Chul-Hong Kim1, Joo-Hee An1, Eun-Jin Kang1, Chul Geun Kim2, Hyun-Jung Kim3 and Kyung-Hee Choi1',
        },
        {
          index: 9,
          date: '2010-12-15',
          type: '논문',
          title:
            'Neural retina leucine-zipper regulates the expression of Ppp2r5c, the regulatory subunit of protein phosphatase 2A, in photoreceptor development',
          author:
            'Jung-Woong Kim, Sang-Min Jang, Chul-Hong Kim, Joo-Hee An, Eun-Jin Kang and Kyung-Hee Choi',
        },
        {
          index: 10,
          date: '2011-08-19',
          type: '논문',
          title:
            'Gelsolin negatively regulates the activity of tumor suppressor p53 through their physical interaction in hepatocarcinoma HepG2 cells',
          author:
            'Joo-Hee An 1, Jung-Woong Kim 1, Sang-Min Jang, Chul-Hong Kim, Eun-Jin Kang, Kyung-Hee Choi ',
        },
        {
          index: 11,
          date: '2011-11-01',
          type: '논문',
          title:
            'Tip60 regulates myoblast differentiation by enhancing the transcriptional activity of MyoD via their physical interactions',
          author:
            'Jung-Woong Kim*, Sang-Min Jang*, Chul-Hong Kim, Joo-Hee An, Eun-Jin Kang and Kyung-Hee Choi',
        },
        {
          index: 12,
          date: '2012-03-02',
          type: '논문',
          title:
            'New Molecular Bridge between RelA/p65 and NF-κB Target Genes via Histone Acetyltransferase TIP60 Cofactor*',
          author:
            'Jung-Woong Kim, Sang-Min Jang, Chul-Hong Kim, Joo-Hee An, Eun-Jin Kang, and Kyung-Hee Choi1',
        },
        {
          index: 13,
          date: '2012-05-01',
          type: '논문',
          title:
            'Transcriptional Activity of Neural Retina Leucine Zipper (Nrl) Is Regulated by c-Jun N-Terminal Kinase and Tip60 during Retina Development ',
          author:
            'Jung-Woong Kim, Sang-Min Jang, Chul-Hong Kim, Joo-Hee An, and Kyung-Hee Choi',
        },
        {
          index: 14,
          date: '2012-08-03',
          type: '논문',
          title:
            'Transcriptional activity of paired homeobox Pax6 is enhanced by histone acetyltransferase Tip60 during mouse retina development',
          author:
            'Chul-Hong Kim 1, Jung-Woong Kim 1, Sang-Min Jang, Joo-Hee An, Ki-Hyun Song, Kyung-Hee Choi',
        },
        {
          index: 15,
          date: '2013-08-23',
          type: '논문',
          title:
            'Transcription factor Sox4 is required for PUMA-mediated apoptosis induced by histone deacetylase inhibitor, TSA',
          author:
            'Sang-Min Jang 2, Eun-Jin Kang 2, Jung-Woong Kim 1, Chul-Hong Kim, Joo-Hee An, Kyung-Hee Choi ',
        },
      ],
    };
  },
  created: function () {},
  mounted: function () {},
  methods: {},
};
</script>
