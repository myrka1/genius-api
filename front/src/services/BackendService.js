import axios from "axios";

const http = axios.create({
    baseURL: "http://localhost:8080"
}); 

export default {
    hitSongs(artist) {
        const encodedArtist = encodeURIComponent(artist);
        return http.get(`/songs?artistName=${encodedArtist}`);
    },
}