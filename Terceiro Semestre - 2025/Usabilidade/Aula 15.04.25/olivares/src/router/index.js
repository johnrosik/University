import { createRouter, createWebHistory } from 'vue-router'
import HomePage from "../pages/HomePage.vue"
import SobrePage from "../pages/SobrePage.vue"


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage,
    },
    {
      path: '/sobre',
      name: 'sobre',
      component: SobrePage,
    },
  ],
})

export default router
