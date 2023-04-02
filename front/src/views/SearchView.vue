<template>
    <div class="container">
      <aside>
        <div class="search">
          <h1>Artist Search</h1>
          <form @submit.prevent="submitForm">
            <label for="artist">Artist Name: </label> 
            <input type="text" id="artist" v-model="artist"/> <br>
            <button type="submit">Submit</button>
          </form>
        </div>
        <div>
          <div v-for="song in stuff"
               v-bind:key="song.Title"
               class="info"
            >
            <img :src="song.imageURL" class="photo" />
            <p>
              <strong>{{ song.songTitle }}</strong> <br>
              <strong>{{ song.artistName }}</strong> <br>
              <strong>{{ song.dateReleased }}</strong> <br>
              <strong>{{ song.imageURL }}</strong> <br>
              <strong>{{ song.artistId }}</strong> <br>
              <strong>{{ song.songId }}</strong>
            </p>
          </div>
       </div>
      
      </aside>
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

<style scoped>
.photo {
  height: 100px;
  width: 100px;
}
</style>
  