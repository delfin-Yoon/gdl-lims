<template>
  <div>
    <v-layout justify-center>
      <v-card class="pa-3 my-5 mx-16" elevation="1" outlined width="1000">
        <v-card-title class="my-n2">
          논문 등록
          <v-spacer />
        </v-card-title>
        <v-divider class="mx-4 mb-10" />
        <v-row class="my-n5">
          <!-- 날짜 -->
          <v-col cols="12" sm="3">
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
                  v-model="date"
                  label="Date"
                  prepend-icon="mdi-calendar"
                  readonly
                  v-bind="attrs"
                  v-on="on"
                />
              </template>
              <v-date-picker v-model="date" @input="menu1 = false" />
            </v-menu>
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-select :items="typeList" label="항목" outlined />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col>
            <v-text-field label="제목" outlined />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col>
            <v-text-field label="저자명" outlined />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col>
            <v-textarea
              outlined
              name="input-7-4"
              label="과제 사사"
              value=""
              no-resize
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col>
            <v-textarea
              outlined
              name="input-7-4"
              label="비고"
              value=""
              no-resize
            />
          </v-col>
        </v-row>

        <v-row>
          <v-col align="end">
            <v-btn elevation="2"> submit </v-btn>
          </v-col>
        </v-row>
      </v-card>
    </v-layout>
  </div>
</template>

<script>
export default {
  data() {
    return {
      date: new Date(Date.now() - new Date().getTimezoneOffset() * 60000)
        .toISOString()
        .substr(0, 10),
      modal: false,
      menu1: false,
      menu2: false,
      typeList: ['논문', '특허', '저작권', '학회'],
    };
  },
};
</script>
