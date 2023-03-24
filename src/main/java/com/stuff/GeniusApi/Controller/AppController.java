package com.stuff.GeniusApi.Controller;

import com.stuff.GeniusApi.Services.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    SongsService songsService;


}
