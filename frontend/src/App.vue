<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <!-- 메뉴 버튼 -->
      <v-app-bar-nav-icon @click="isDrawMenu = !isDrawMenu" />
      <v-img
        alt="Vuetify Logo"
        class="shrink mr-2"
        contain
        src="../public/cau_logo_white.png"
        transition="scale-transition"
        width="120"
      />
      <label>{{ pageTitle }}</label>
      <v-spacer />
    </v-app-bar>

    <!-- 메뉴 영역 S -->
    <v-navigation-drawer
      v-model="isDrawMenu"
      dark
      app
    >
      <v-list-item>
        <v-list-item-content>
          <v-list-item-title class="text-h6">
            CAU
          </v-list-item-title>
          <v-list-item-subtitle>
            LIMS
          </v-list-item-subtitle>
        </v-list-item-content>
      </v-list-item>

      <v-divider />

      <v-list
        dense
        nav
      >
        <v-list-item
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
        </v-list-item>
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

  data: () => ({
    menuItems: [
      { title: 'Main', icon: 'mdi-view-dashboard', to: '/' },
      // { title: 'MenuTest1', icon: 'mdi-image', to: '/menu1'},
      // { title: 'MenuTest2', icon: 'mdi-help-box', to: '/menu2'},
      { title: 'PaperList', icon: 'mdi-help-box', to: '/paperList'},
      { title: 'PaperCreate', icon: 'mdi-help-box', to: '/paperCreate'},
      { title: 'PaperCreate(wide)', icon: 'mdi-help-box', to: '/paperCreate2'},
      { title: 'PaperDetail', icon: 'mdi-help-box', to: '/paperDetail'},
      { title: 'PaymentList', icon: 'mdi-help-box', to: '/paymentList'},
      { title: 'BudgetList', icon: 'mdi-help-box', to: '/budgetList'},
    ],
    isDrawMenu: true,
    right: null,
    pageTitle: ''
  }),
  created: function() {
    this.pageTitle = this.$route.name;
  },
  mounted: function() {
  },
  methods: {
    menuClick: function() {
      this.pageTitle = this.$route.name;
    }
  }
};
</script>
