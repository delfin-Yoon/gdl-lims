import Vue from 'vue';
import VueRouter from 'vue-router';

// import HomeComponent from '../pages/HomeComponent';
import HomeComponent from '../pages/common/Login';
import Menu1 from '../pages/Menu1';
import Menu2 from '../pages/Menu2';
import Login from '../pages/common/Login';

import PaperList from '../pages/paper/PaperList';
import PaperCreate from '../pages/paper/PaperCreate';
import PaperCreate2 from '../pages/paper/PaperCreate2';
import PaperDetail from '../pages/paper/PaperDetail';

import PaymentList from '../pages/PaymentList';

import MemberList from '../pages/member/MemberList';
import MemberCreate from '../pages/member/MemberCreate';
import MemberDetail from '../pages/member/MemberDetail';

import BudgetList from '../pages/budget/BudgetList';
import BudgetCreate from '../pages/budget/BudgetCreate';
import BudgetResult from '../pages/budget/BudgetResult';

Vue.use(VueRouter);

const route = [
  {
    path: '/',
    name: 'HomeComponent',
    component: HomeComponent
  },
  {
    path: '/menu1',
    name: 'Menu1',
    component: Menu1
  },
  {
    path: '/menu2',
    name: 'Menu2',
    component: Menu2
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  // 논문
  {
    path: '/paperList',
    name: 'PaperList',
    component: PaperList
  },
  {
    path: '/paperCreate',
    name: 'PaperCreate',
    component: PaperCreate
  },
  {
    path: '/paperCreate2',
    name: 'PaperCreate2',
    component: PaperCreate2
  },
  {
    path: '/paperDetail',
    name: 'PaperDetail',
    component: PaperDetail
  },
  {
    path: '/paymentList',
    name: 'PaymentList',
    component: PaymentList
  },
  // 회원
  {
    path: '/memberList',
    name: 'MemberList',
    component: MemberList
  },
  {
    path: '/memberCreate',
    name: 'MemberCreate',
    component: MemberCreate
  },
  {
    path: '/memberDetail/:memberId',
    name: 'MemberDetail',
    component: MemberDetail
  },
  // 예산
  {
    path: '/budgetList',
    name: 'BudgetList',
    component: BudgetList
  },
  {
    path: '/budgetResult',
    name: 'BudgetResult',
    component: BudgetResult
  },
];

const router = new VueRouter({
  mode: 'history',
  routes: route
});

export default router;
