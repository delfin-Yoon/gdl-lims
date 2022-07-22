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
                    v-model="memberId"
                  />
                  <!-- prepend-icon="lock" -->
                  <v-text-field
                    id="password"
                    name="password"
                    label="Password"
                    type="password"
                    v-model="memberPwd"
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
export default {
  name: 'Login',
  data() {
    return {
      memberId: '',
      memberPwd: '',
    };
  },
  methods: {
    login() {
      const userInfo = {
        memberId: this.memberId,
        memberPwd: this.memberPwd,
      };
      this.$axios
        .post('/api/member/login', userInfo)
        .then(response => {
          this.$store.state.loginUser = response.data.memberId;
          this.$router.push('/memberList');
        })
        .catch(error => console.log(error));
    },
  },
};
</script>

<style></style>
