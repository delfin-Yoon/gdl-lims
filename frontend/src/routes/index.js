import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const route = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/views/common/MainPage.vue'),
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('@/views/common/Login.vue'),
  },

  // 회원 (관리자만 접근 가능)
  {
    path: '/memberList',
    name: 'MemberList',
    component: () => import('@/views/member/MemberList.vue'),
  },
  {
    path: '/memberCreate',
    name: 'MemberCreate',
    component: () => import('@/views/member/MemberCreate.vue'),
  },
  {
    path: '/memberDetail/:memberId',
    name: 'MemberDetail',
    component: () => import('@/views/member/MemberDetail.vue'),
  },
];

export default new VueRouter({
  mode: 'history',
  routes: route,
});
