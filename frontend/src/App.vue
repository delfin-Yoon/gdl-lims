<template>
  <v-app>
    <v-app-bar app color="primary" dark>
      <!-- 메뉴 버튼 -->
      <v-app-bar-nav-icon
        v-if="isUserLogin"
        @click="isDrawMenu = !isDrawMenu"
      />
      <v-img
        alt="Vuetify Logo"
        class="shrink mr-2"
        contain
        src="../public/cau_logo_white.png"
        transition="scale-transition"
        width="120"
        @click="goHome()"
      />
      <!-- 현재화면 -->
      <!-- <v-toolbar-title>{{ pageTitle }}</v-toolbar-title> -->
      <v-spacer></v-spacer>
      <v-toolbar-title v-if="isUserLogin">
        {{ this.$store.state.loginUser }}
      </v-toolbar-title>

      <v-menu left bottom v-if="isUserLogin">
        <template v-slot:activator="{ on, attrs }">
          <v-btn icon v-bind="attrs" v-on="on">
            <v-icon>mdi-dots-vertical</v-icon>
          </v-btn>
        </template>
        <v-list>
          <v-list-item
            v-for="(item, index) in optionList"
            :key="index"
            @click="item.func"
          >
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item>
        </v-list>
      </v-menu>
      <!-- <v-spacer /> -->
    </v-app-bar>

    <!-- 메뉴 영역 S -->
    <v-navigation-drawer v-if="isUserLogin" v-model="isDrawMenu" dark app>
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title class="text-h6"> CAU </v-list-item-title>
          <v-list-item-subtitle> LIMS </v-list-item-subtitle>
        </v-list-item-content>
      </v-list-item>

      <v-divider />

      <v-list dense nav>
        <!-- 1 depth original menu s -->
        <!-- <v-list-item
          v-for="item in menuItems"
          :key="item.title"
          link
          :to="item.to"
          @click="menuClick"
        >
          <v-list-item-icon>
            <v-icon>{{ item.icon }}</v-icon>
          </v-list-item-icon>

          <v-list-item-content>
            <v-list-item-title>{{ item.title }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item> -->
        <!-- 1 depth original menu s -->

        <!-- 2depth menu s -->
        <v-list-group
          v-for="item in menuItems"
          :key="item.title"
          v-model="item.active"
          no-action
        >
          <!-- :prepend-icon="item.action" -->
          <template v-slot:activator>
            <v-list-item-content>
              <v-list-item-title v-text="item.title"></v-list-item-title>
            </v-list-item-content>
          </template>

          <v-list-item
            v-for="child in item.items"
            :key="child.title"
            link
            :to="child.to"
            @click="menuClick"
          >
            <v-list-item-content>
              <v-list-item-title v-text="child.title"></v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-list-group>
        <!-- 2depth menu e -->
      </v-list>
    </v-navigation-drawer>
    <!-- 메뉴 영역 E -->

    <!-- 메인 컨텐츠 영역 S -->
    <v-main>
      <!-- <HelloWorld/> -->
      <!-- <v-container justify-center> -->
      <!-- <v-layout justify-center> -->
      <router-view />
      <!-- </v-layout> -->
      <!-- </v-container> -->
    </v-main>
    <!-- 메인 컨텐츠 영역 E -->
  </v-app>
</template>

<script>
// import HelloWorld from './components/HelloWorld';

export default {
  name: 'App',

  components: {
    // HelloWorld,
  },
  data() {
    return {
      menuItems: [
        // { title: 'Main', to: '/'},
        {
          title: 'Paper',
          items: [
            { title: 'PaperList', to: '/paperList' },
            { title: 'PaperCreate', to: '/paperCreate' },
            { title: 'PaperCreate2', to: '/paperCreate2' },
            // { title: 'PaperDetail', to: '/paperDetail' },
          ],
        },
        {
          title: 'Member',
          items: [
            { title: 'MemberList', to: '/memberList' },
            { title: 'MemberCreate', to: '/memberCreate' },
            // { title: 'MemberDetail', to: '/memberDetail' },
          ],
        },
        {
          title: 'Budget',
          items: [
            { title: 'BudgetResult', to: '/budgetResult' },
            { title: 'BudgetList', to: '/budgetList' },
            { title: 'BudgetCreate', to: '/budgetCreate' },
            // { title: 'BudgetDetail', to: '/budgetDetail' },
          ],
        },

        // { title: "Main", icon: "mdi-view-dashboard", to: "/" },
        // { title: "PaperList", icon: "mdi-help-box", to: "/paperList" },
        // { title: "PaperCreate", icon: "mdi-help-box", to: "/paperCreate" },
        // { title: "PaperCreate(wide)", icon: "mdi-help-box", to: "/paperCreate2" },
        // { title: "PaperDetail", icon: "mdi-help-box", to: "/paperDetail" },
        // { title: "PaymentList", icon: "mdi-help-box", to: "/paymentList" },
        // { title: "MemberList", icon: "mdi-help-box", to: "/memberList" },
        // { title: "MemberCreate", icon: "mdi-help-box", to: "/memberCreate" },
        // { title: "MemberCreate(narrow)", icon: "mdi-help-box", to: "/memberCreate2" },
        // { title: "BudgetList", icon: "mdi-help-box", to: "/budgetList" },
      ],
      optionList: [
        {
          title: 'logout',
          func: () => {
            this.$store.state.loginUser = '';
            this.$router.push('/');
          },
        },
      ],
      isDrawMenu: false,
      right: null,
      pageTitle: '',
    };
  },
  computed: {
    isUserLogin() {
      return this.$store.getters.isLogin;
    },
  },
  created() {},
  mounted() {
    this.pageTitle = this.$route.name;
  },
  methods: {
    menuClick() {
      this.pageTitle = this.$route.name;
    },
    goHome() {
      if (this.isUserLogin) return;
      this.$router.push('/');
    },
  },
};
</script>
