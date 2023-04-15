<template>
  <div id="app">
    <nav>
      <router-link to="/">Home</router-link> 
      <router-link to="/search">Search Page</router-link> 
      <router-link to="/about">About</router-link> 
    </nav>
    <router-view/>
  </div>
</template>

<script>
export default {

}
</script>

<!--
  color scheme
  #FF7B54    //bright orange salmon
  #FFB26B    //light orange salmon
  #FFD56B    //dead yellow
  #676c4b    //sage green
-->

<style>
#app {
  background-color: #FFB26B;
  min-height: 100vh;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #676c4b;
}

body {
  margin: 0;
  padding: 0;
}

nav {
  padding: 30px;
  display: flex;
  justify-content: center;
}

nav a {
  font-weight: bold;
  color: #FFD56B;
  font-size: 22px;
  border: 1px solid #676c4b;
  flex-basis: 20%;
  margin: 5px;
  border-radius: 5px;
  text-decoration: none;
}

nav a.router-link-exact-active {
  color: #FF7B54;
}
</style>
