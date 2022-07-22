import Vue from 'vue';
import App from './App.vue';
import vuetify from '@/plugins/vuetify';
import router from '@/routes/index';
import store from '@/store/index';
import axios from 'axios';

Vue.prototype.$axios = axios;
Vue.config.productionTip = false;

new Vue({
  render: h => h(App),
  vuetify,
  router,
  store,
}).$mount('#app');
