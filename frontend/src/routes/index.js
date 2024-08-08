import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const route = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/views/common/MainPage.vue'),
  },
  // Expression Data (Transcript, Gene)
  {
    path: '/rnaExp',
    name: 'rnaExpTransGene',
    component: () => import('@/views/rnaExp/RnaExpTransGene.vue'),
  },

];

export default new VueRouter({
  mode: 'history',
  routes: route,
});
