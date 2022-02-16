import Vue from 'vue';
import VueRouter from 'vue-router';
// import HomeComponent from '../pages/HomeComponent';
import HomeComponent from '../pages/Login';
import Menu1 from '../pages/Menu1';
import Menu2 from '../pages/Menu2';
import PaperList from '../pages/PaperList';
import PaperCreate from '../pages/PaperCreate';
import PaperCreate2 from '../pages/PaperCreate2';
import PaperDetail from '../pages/PaperDetail';
import PaymentList from '../pages/PaymentList';
import BudgetList from '../pages/BudgetList';

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
  {
    path: '/budgetList',
    name: 'BudgetList',
    component: BudgetList
  },

];

const router = new VueRouter({
  mode: 'history',
  routes: route
});

export default router;
