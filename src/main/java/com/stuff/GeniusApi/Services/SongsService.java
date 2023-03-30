package com.stuff.GeniusApi.Services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stuff.GeniusApi.Model.Song;
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
    //token stuff here

    private RestTemplate restTemplate = new RestTemplate();

    public List<Song> getHitSongs(String artist_name) {
        //postman: localhost:8080/songs?artistName=
        System.out.println("Artist name input: " + artist_name);

        ArrayList<Song> songList = new ArrayList<Song>();
        Song song1 = new Song("Blank Space", "Taylor Swift");
        Song song2 = new Song("Style", "Taylor Swift");
        songList.add(song1);
        songList.add(song2);
        /*
        HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.setBearerAuth(token here);
        HttpEntity<String> request = new HttpEntity<>(httpHeaders);

        String url = "api.genius.com/search?q=" + artist_name;
        //example: api.genius.com/search?q=Taylor%20Swift
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
                String songName = current.path("full_title").asText();
                String artistName = current.path("primary_artist").path("name").asText();
                song = new Song(songName, artistName);
                songList.add(song);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */
        System.out.println(songList);
        return songList;
    }

}
