
package com.jatin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    @GetMapping("/playlists")
    public List<String> getPlaylists() {

        List<String> playlists = Arrays.asList(
                "Chill Vibes",
                "Top Hits",
                "Workout Mix"
        );

        return playlists;
    }

   @PostMapping("/playlists")
   public String addPlaylist(@RequestBody String name) {
    return "Playlist created successfully: " + name;
 }

}
