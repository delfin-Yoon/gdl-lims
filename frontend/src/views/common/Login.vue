<template>
  <v-app id="inspire">
    <v-main>
      <v-container fluid fill-height>
        <v-layout align-center justify-center>
          <v-flex xs12 sm8 md4>
            <v-card class="elevation-12">
              <v-toolbar dark color="primary">
                <v-toolbar-title>Login</v-toolbar-title>
              </v-toolbar>
              <v-card-text>
                <v-form>
                  <!-- prepend-icon="person" -->
                  <v-text-field
                    name="id"
                    label="Id"
                    type="text"
                    v-model.trim="memberId"
                    @keyup.enter="login"
                  />
                  <!-- :rules="[rules.required]" -->
                  <!-- prepend-icon="lock" -->
                  <v-text-field
                    id="password"
                    name="password"
                    label="Password"
                    type="password"
                    v-model="memberPwd"
                    @keyup.enter="login"
                  />
                </v-form>
              </v-card-text>
              <v-card-actions>
                <v-spacer />
                <v-btn color="primary" @click="login"> Login </v-btn>
              </v-card-actions>
            </v-card>
          </v-flex>
        </v-layout>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
// import VueCookies from 'vue-cookies';

export default {
  name: 'Login',
  data() {
    return {
      memberId: '',
      memberPwd: '',
      rules: {
        required: value => !!value || 'Required.',
      },
    };
  },
  methods: {
    login() {
      if (this.memberId === '' || this.memberPwd === '') {
        return;
      }

      const userInfo = {
        memberId: this.memberId,
        memberPwd: this.memberPwd,
      };
      this.$axios
        .post('/api/member/login', userInfo)
        .then(response => {
          // console.log('response.data', response.data);
          if (response.data) {
            this.$store.state.loginUser = response.data.member.memberId;
            this.$router.push('/memberList');
            this.$cookies.set('loginUser', this.$store.state.loginUser);
          } else {
            alert('아이디와 비밀번호를 확인해주세요.');
          }
        })
        .catch(error => console.log(error));
    },
  },
};
</script>

<style></style>
