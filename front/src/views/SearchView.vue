<template>
    <div class="search">
      <h1>Artist Search</h1>

      <form @submit.prevent="submitForm">
        <label for="artist">Artist Name: </label> 
        <input type="text" id="artist" v-model="artist"/> <br>
        <button type="submit">Submit</button>
      </form>
      
    </div>
</template>
  
<script>
  export default {
    data() {
      return {
        artist: "",
      };
    },
    methods: {
      submitForm() {
        console.log("Artist: ", this.artist)
      },
    },
  };

</script>
  