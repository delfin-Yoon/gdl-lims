import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    loginUser: '',
  },
  // getters: {
  //   isLogin(state) {
  //     return state.loginUser !== '';
  //   },
  // },
});
