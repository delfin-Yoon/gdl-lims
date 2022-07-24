<template>
  <div>
    <v-layout justify-center>
      <v-card class="pa-3 my-5 mx-16" elevation="1" outlined width="1000">
        <v-card-title class="my-n2">
          예산 등록
          <v-spacer />
        </v-card-title>
        <v-divider class="mx-4 mb-10" />

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="budget.transCateId"
              label="집행구분"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="budget.projectNo"
              label="과제번호"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field v-model="budget.cate_lvl1_cd" label="비목" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field v-model="budget.cate_lvl2_cd" label="세목" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="budget.cate_lvl3_cd"
              label="세세목"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field v-model="budget.cate_lvl4_cd" label="구분" outlined />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field v-model="budget.purpose" label="사용목적" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="budget.corporate"
              label="사업자명"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="budget.paymentAmount"
              label="결제금액"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field v-model="budget.cardNo" label="카드번호" outlined />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="12">
            <v-text-field v-model="budget.remark" label="비고" outlined />
          </v-col>
        </v-row>

        <v-row>
          <v-col align="end">
            <v-btn elevation="2" @click="submit"> submit </v-btn>
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
      // date: (new Date(Date.now() - (new Date()).getTimezoneOffset() * 60000)).toISOString().substr(0, 10),
      // modal: false,
      // menu1: false,
      // menu2: false,
      // typeList: ['논문', '특허', '저작권', '학회'],
      budget: {
        transId: '',
        transCateCd: '',
        projectNo: '',
        purpose: '',
        corporate: '',
        paymentAmount: '',
        paymentDate: '',
        paymentTime: '',
        cardNo: '',
        remark: '',
      },
    };
  },
  methods: {
    submit: function () {
      alert('기능 구현 중입니다.');
      return;

      this.$axios.post(`/api/member`, this.member).then(response => {
        console.log('response::', response);
        this.$router.push({ path: './memberList' });
      });
    },
  },
};
</script>
