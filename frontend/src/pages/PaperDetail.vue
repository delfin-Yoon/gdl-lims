<template>
  <div>
    <v-card
      class="pa-3 my-5 mx-16"
      elevation="1"
      outlined
    >
      <v-card-title class="my-n2">
        논문 상세
        <v-spacer />
      </v-card-title>
      <v-divider class="mx-4 mb-10" />
      <v-row class="my-n5">
        <!-- 날짜 -->
        <v-col
          cols="12"
          sm="3"
        >
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
                v-model="paperDetail.date"
                label="Date"
                prepend-icon="mdi-calendar"
                readonly
                v-bind="attrs"
                v-on="on"
              />
            </template>
            <v-date-picker
              v-model="paperDetail.date"
              readonly
              @input="menu1 = false"
            />
          </v-menu>
        </v-col>
      </v-row>

      <v-row class="my-n5">
        <v-col
          cols="12"
          sm="3"
        >
          <v-select
            v-model="paperDetail.type"
            :items="typeList"
            label="항목"
            outlined
            readonly
          />
        </v-col>
      </v-row>

      <v-row class="my-n5">
        <v-col>
          <v-text-field
            v-model="paperDetail.title"
            label="제목"
            outlined
            readonly
          />
        </v-col>
      </v-row>

      <v-row class="my-n5">
        <v-col>
          <v-text-field
            v-model="paperDetail.author"
            label="저자명"
            outlined
            readonly
          />
        </v-col>
      </v-row>

      <v-row class="my-n5">
        <v-col>
          <v-textarea
            v-model="paperDetail.contents"
            outlined
            name="input-7-4"
            label="과제 사사"
            no-resize
            readonly
          />
        </v-col>
      </v-row>

      <v-row class="my-n5">
        <v-col>
          <v-textarea
            v-model="paperDetail.note"
            outlined
            name="input-7-4"
            label="비고"
            no-resize
            readonly
          />
        </v-col>
      </v-row>

      <v-row>
        <v-col
          align="end"
        >
          <v-btn
            elevation="2"
          >
            modify
          </v-btn>
        </v-col>
      </v-row>
    </v-card>
  </div>
</template>

<script>
export default {
  data () {
    return {
      date: (new Date(Date.now() - (new Date()).getTimezoneOffset() * 60000)).toISOString().substr(0, 10),
      modal: false,
      menu1: false,
      menu2: false,
      typeList: ['논문', '특허', '저작권', '학회'],
      paperDetail: {
        date: '2010-03-01',
        type: '논문',
        title: 'p19ras Represses proliferation of non-small cell lung cancer possibly through interaction with Neuron-Specific Enolase (NSE)',
        author: 'Sang-Min Jang 1, Jung-Woong Kim 1, Chul-Hong Kim, Daehwan Kim, Sangmyung Rhee, Kyung-Hee Choi *',
        contents: 'This work was supported by the Seoul R & BD program and the second stage of BK21 (Brain Korea 21) Project. This research was supported by the Chung-Ang University Research Grants in 2008. We thank Prof. Jae-Yong Park (Kyung-Sang Univ., Korea) for providing the expression plasmid of AChE-R and Prof. Sang-Beom Seo (Chung-Ang Univ., Korea) for generous providing of Enolase a expressing plasmid.',
        note: ''
      }
    }
  }
}
</script>
