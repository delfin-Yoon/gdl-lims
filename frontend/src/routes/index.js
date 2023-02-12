import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const route = [
  {
    path: '/',
    name: 'Main',
    redirect: '/login',
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('@/views/common/Login.vue'),
  },
  // 논문
  {
    path: '/paperList',
    name: 'PaperList',
    component: () => import('@/views/paper/PaperList.vue'),
  },
  {
    path: '/paperCreate',
    name: 'PaperCreate',
    component: () => import('@/views/paper/PaperCreate.vue'),
  },
  {
    path: '/paperCreate2',
    name: 'PaperCreate2',
    component: () => import('@/views/paper/PaperCreate2.vue'),
  },
  {
    path: '/paperDetail',
    name: 'PaperDetail',
    component: () => import('@/views/paper/PaperDetail.vue'),
  },
  // 회원
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
