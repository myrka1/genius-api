package com.stuff.GeniusApi.Services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stuff.GeniusApi.Model.Song;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public class SongsService {

    @Value("${genius.token}")
    private String token;

    private RestTemplate restTemplate = new RestTemplate();

    public List<Song> getHitSongs(String artist_name) {

        ArrayList<Song> songList = new ArrayList<Song>();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth(this.token);
        HttpEntity<String> request = new HttpEntity<>(httpHeaders);

        String url = "https://api.genius.com/search?q=" + artist_name;

        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                String.class
        );

        try {
            Song song = null;
            ObjectMapper oM = new ObjectMapper();
            JsonNode jsonNode = oM.readTree(response.getBody());
            JsonNode hits = jsonNode.path("response").path("hits");

            for(JsonNode current : hits) {
                String songName = current.path("result").path("full_title").asText();
                String artistName = current.path("result").path("primary_artist").path("name").asText();
                String dateReleased = current.path("result").path("release_date_for_display").asText();
                String imageURL = current.path("result").path("song_art_image_url").asText();
                String artistId = current.path("result").path("primary_artist").path("id").asText();
                String songId = current.path("result").path("id").asText();
                song = new Song(songName, artistName, dateReleased, imageURL, artistId, songId);
                songList.add(song);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return songList;
    }
}
