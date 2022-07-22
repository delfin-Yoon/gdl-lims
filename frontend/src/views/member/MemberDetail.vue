<template>
  <div>
    <v-layout justify-center>
      <v-card class="pa-3 my-5 mx-16" elevation="1" outlined width="1000">
        <v-card-title class="my-n2">
          회원 상세
          <v-spacer />
        </v-card-title>
        <v-divider class="mx-4 mb-10" />

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.memberId"
              label="ID"
              outlined
              readonly
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field v-model="member.korName" label="회원명" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.engName"
              label="회원명(영문)"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field label="그룹코드" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.affiliation"
              label="소속기관명"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.researcherId"
              label="연구자 등록번호"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.mobileNo"
              label="휴대폰번호"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.resRegisterId"
              label="주민등록번호"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.position"
              label="직위/직급"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field v-model="member.email" label="email" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field v-model="member.eduLvl" label="최종학력" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field v-model="member.bank" label="은행" outlined />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field v-model="member.account" label="계좌번호" outlined />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.guardianMobile"
              label="보호자 연락처"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="3">
            <v-text-field
              v-model="member.guardianRelation"
              label="보호자 관계"
              outlined
            />
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field
              v-model="member.nasLink"
              label="개인파일하이퍼링크"
              outlined
            />
          </v-col>
        </v-row>

        <v-row>
          <v-col class="btn-area" align="end">
            <v-btn class="btn" elevation="2" @click="goToList"> 목록 </v-btn>
            <v-btn class="btn" elevation="2" @click="updateMember">
              수정
            </v-btn>
            <v-btn class="btn" elevation="2" @click="deleteMember">
              삭제
            </v-btn>
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
      originMember: {},
      // 회원정보
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
      },
    };
  },
  computed: {
    // 회원 데이터 변경여부 체크
    isChanged() {
      return JSON.stringify(this.member) !== JSON.stringify(this.originMember);
    },
  },
  created() {
    if (this.$route.params.memberId) {
      this.getMember();
    }
  },
  mounted() {},
  methods: {
    /* 회원정보조회 API 호출 */
    getMember() {
      const url = '/api/member';
      const params = {
        memberId: this.$route.params.memberId,
      };

      this.$axios.get(url, { params }).then(response => {
        this.member = response.data;
        this.originMember = Object.assign({}, this.member);
      });
    },
    /* 목록 버튼 클릭 */
    goToList() {
      // 변경사항 체크
      if (this.isChanged) {
        if (!confirm('변경사항을 저장하지않고 목록으로 이동하시겠습니까?')) {
          return;
        }
      }

      this.$router.push({ name: 'MemberList' });
    },
    /* 수정 버튼 클릭 */
    updateMember() {
      // 변경사항 체크
      if (this.isChanged) {
        if (!confirm('저장하시겠습니까?')) {
          return;
        }
      } else {
        alert('변경된 내용이 없습니다.');
        return;
      }

      // 회원정보수정 api 호출 후 목록으로 이동
      this.$axios.put('/api/member', this.member).then(response => {
        alert('수정되었습니다.');
        this.$router.push({ name: 'MemberList' });
      });
    },
    deleteMember() {
      if (!confirm('삭제하시겠습니까?')) {
        return;
      }

      // 회원정보수정 api 호출 후 목록으로 이동
      this.$axios
        .delete(`/api/member/${this.member.memberId}`)
        .then(response => {
          alert('삭제되었습니다.');
          this.$router.push({ name: 'MemberList' });
        });
    },
  },
};
</script>

<style scoped>
.btn-area > .btn {
  margin-left: 12px;
}
</style>
