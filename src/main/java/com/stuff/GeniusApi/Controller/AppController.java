package com.stuff.GeniusApi.Controller;

import com.stuff.GeniusApi.Model.Song;
import com.stuff.GeniusApi.Services.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    SongsService songsService;

    @RequestMapping(path="/songs", method= RequestMethod.GET)
    public List<Song> getATweet(@RequestParam String artistName) {
        return songsService.getHitSongs(artistName);
    }

}
