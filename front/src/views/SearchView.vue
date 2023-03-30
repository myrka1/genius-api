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
  import service from '../services/BackendService.js';


  export default {
    data() {
      return {
        artist: "",
        stuff: [],
      };
    },
    methods: {
      submitForm() {
        try {
          service.hitSongs(this.artist).then((response) => {
            this.stuff = response.data;
            this.artist = "";
            console.log("Stuff: ", response);
          }); 
        }
        catch (error) {
          //console.error(error);
          //console.log("Artist: ", this.artist)
        }
      }
    },
  }


</script>
  