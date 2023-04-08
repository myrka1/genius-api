package com.stuff.GeniusApi.Controller;

import com.stuff.GeniusApi.Model.Song;
import com.stuff.GeniusApi.Services.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AppController {
    @Autowired
    SongsService songsService;

    //postman: localhost:8080/songs?artistName=
    @RequestMapping(path="/songs", method= RequestMethod.GET)
    public List<Song> getHitSongs(@RequestParam String artistName) {
        return songsService.getHitSongs(artistName);
    }
    
    /*@RequestMapping(path="/songs/{artistName}", method= RequestMethod.GET)
    public List<Song> getATweet(@PathVariable String artistName) {
        return songsService.getHitSongs(artistName);
    } */


}
