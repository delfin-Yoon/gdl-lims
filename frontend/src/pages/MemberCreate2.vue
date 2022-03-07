<template>
  <div>
    <v-layout
      justify-center
    >
      <v-card
        class="pa-3 my-5 mx-16"
        elevation="1"
        outlined
        width="1000"
      >
        <v-card-title class="my-n2">
          회원 등록
          <v-spacer />
        </v-card-title>
        <v-divider class="mx-4 mb-10" />

        <v-row class="my-n5">
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.memberId"
              label="ID"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.korName"
              label="회원명"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.engName"
              label="회원명(영문)"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              label="그룹코드"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.affiliation"
              label="소속기관명"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.researcherId"
              label="연구자 등록번호"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.mobileNo"
              label="휴대폰번호"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.resRegisterId"
              label="주민등록번호"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.position"
              label="직위/직급"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.email"
              label="email"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.eduLvl"
              label="최종학력"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.bank"
              label="은행"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.account"
              label="계좌번호"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.guardianMobile"
              label="보호자 연락처"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="3"
          >
            <v-text-field
              v-model="member.guardianRelation"
              label="보호자 관계"
              outlined
            />
          </v-col>
          <v-col
            cols="12"
            sm="6"
          >
            <v-text-field
              v-model="member.nasLink"
              label="개인파일하이퍼링크"
              outlined
            />
          </v-col>
        </v-row>

        <v-row>
          <v-col
            align="end"
          >
            <v-btn
              elevation="2"
              @click="submit"
            >
              submit
            </v-btn>
          </v-col>
        </v-row>
      </v-card>
    </v-layout>
  </div>
</template>

<script>
export default {
  data () {
    return {
      // date: (new Date(Date.now() - (new Date()).getTimezoneOffset() * 60000)).toISOString().substr(0, 10),
      // modal: false,
      // menu1: false,
      // menu2: false,
      // typeList: ['논문', '특허', '저작권', '학회'],
      member: {
        memberId: '',
        memberPwd: '',
        korName: '',
        engName: '',
        groupCode: '',
        affiliation: '',
        researcherId: '',
        mobileNo: '',
        resRegisterId: '',
        position: '',
        email: '',
        bank: '',
        account: '',
        eduLvl: '',
        guardianMobile: '',
        guardianRelation: '',
        nasLink: '',
        remark: '',
      }
    }
  },
  methods: {
    submit: function() {
      this.$axios.post(`/member`, this.member).then(response => {
        console.log("response::", response);
        this.$router.push({path:'./memberList'});
      });
    }
  }
}
</script>
