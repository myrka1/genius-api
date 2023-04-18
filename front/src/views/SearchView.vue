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
        <div class="songs-list">
          <div v-for="song in stuff"
               v-bind:key="song.Title"
               class="song"
            >
            <img :src="song.imageURL" class="photo" /> 
            <p class="song-info">
              <strong>Song Title: </strong>{{ song.songTitle }} <br>
              <strong>Artist: </strong>{{ song.artistName }} <br>
              <strong>Date Released: </strong>{{ song.dateReleased }} <br>
              <strong>Song Id: </strong>{{ song.songId }}
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
  margin: 5px;
}

.container {
  border: 1px solid #FFD56B;
  margin-left: 10px;
  margin-right: 10px;
  border-radius: 5px;
  margin-bottom: 100px;

}

button {
  background-color: #FF7B54;
  height: 35px;
  width: 60x;
  border-radius: 5px;
  border: none;
  margin-top: 2px;
  margin-bottom: 4px;
  color: #FFD56B;
}

.songs-list {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 5px;
}
.song {
  width: calc(20% - 10px);
  padding: 2px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  border: 1px solid #FF7B54;
  border-radius: 5px;
  margin-bottom: 5px;
} 

.song-info {
  text-align: center;
}

</style>
  