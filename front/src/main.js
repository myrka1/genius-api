import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'

Vue.config.productionTip = false

axios.default.baseURL = process.env.VUE_APP_REMOTE_API;

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
