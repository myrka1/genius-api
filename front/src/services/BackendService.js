import axios from "axios";

const http = axios.create({
    baseURL: "http://localhost:8080"
}); 

export default {
    hitSongs(artist) {
        return http.get(`/songs?artistName=${artist}`);
    },
}