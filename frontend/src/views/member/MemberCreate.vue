<template>
  <div>
    <v-layout justify-center>
      <v-card class="pa-3 my-5 mx-16" elevation="1" outlined width="700">
        <v-card-title class="my-n2">
          회원 등록
          <v-spacer />
        </v-card-title>
        <v-divider class="mx-4 mb-10" />

        <v-row class="my-n5">
          <v-col cols="12" sm="6">
            <v-text-field v-model="member.memberId" label="ID" outlined />
          </v-col>
          <v-col cols="12" sm="6">
            <v-select
              v-model="member.roles"
              :items="items.roles"
              label="권한"
              outlined
            ></v-select>
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col cols="12" sm="6">
            <v-text-field v-model="member.korName" label="회원명" outlined />
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field
              v-model="member.engName"
              label="회원명(영문)"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col>
            <v-text-field
              v-model="member.mobileNo"
              label="휴대폰번호"
              outlined
            />
          </v-col>
        </v-row>

        <v-row class="my-n5">
          <v-col>
            <v-text-field v-model="member.email" label="email" outlined />
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
      member: {
        memberId: '',
        memberPwd: '',
        korName: '',
        engName: '',
        mobileNo: '',
        email: '',
      },
      items: {
        roles: ['USER', 'ADMIN', 'MANAGER'],
      },
    };
  },
  created() {
    console.log('router value: ', this.$router);
  },
  methods: {
    submit() {
      if (!this.member.memberId) {
        alert('회원ID를 입력해주세요.');
        return;
      }

      if (!confirm('저장하시겠습니까?')) {
        return;
      }

      this.$axios
        .post(`/api/member`, this.member)
        .then(response => {
          alert('저장되었습니다.');
          this.$router.push({ name: 'MemberList' });
        })
        .catch(e => {
          console.log(e);
        });
    },
  },
};
</script>
