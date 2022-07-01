<template>
  <v-app id="inspire">
    <v-content>
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
                  <v-text-field name="id" label="Id" type="text" />
                  <!-- prepend-icon="lock" -->
                  <v-text-field
                    id="password"
                    name="password"
                    label="Password"
                    type="password"
                  />
                </v-form>
              </v-card-text>
              <v-card-actions>
                <v-spacer />
                <v-btn color="primary" @click="login">
                  Login
                </v-btn>
              </v-card-actions>
            </v-card>
          </v-flex>
        </v-layout>
      </v-container>
    </v-content>
  </v-app>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      id: null,
      password: null,
      allUsers: [
        { id: 1, name: "kim", email: "kim@gmail.com", password: "1234" },
        { id: 2, name: "yoon", email: "yoon@gmail.com", password: "1234" },
      ],
    }
  },
  methods: {
    login() {
      let selectedUser = null;
      this.allUsers.forEach(user => {
        if(user.email === this.email) selectedUser = user;
      });
      if(selectedUser === null) alert("입력하신 아이디가 없습니다.");
      else {
        selectedUser.password !== this.password
          ? alert("이메일과 비밀번호가 일치하지 않습니다.")
          : alert("로그인이 완료되었습니다.");
      }
    }
  }
};
</script>

<style></style>
