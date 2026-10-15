
package com.jatin.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    Map<Integer, String> playlists = new HashMap<>();

 
    @GetMapping("/playlists")
    public List<String> getPlaylists() {

        List<String> list = Arrays.asList(
                "Chill Vibes",
                "Top Hits",
                "Workout Mix"
        );

        return list;
    }

   
    @PostMapping("/playlists")
    public String addPlaylist(@RequestBody String name) {

        return "Playlist created successfully: " + name;
    }


    @PutMapping("/playlists/{id}")
    public Map<String, Object> updatePlaylist(
            @PathVariable int id,
            @RequestBody String name) {

        playlists.put(id, name);

        Map<String, Object> response = new HashMap<>();

        response.put("id", id);
        response.put("name", name);

        return response;
    }


  @DeleteMapping("/playlists/{id}")
  public String deletePlaylist(@PathVariable int id) {

    playlists.remove(id);

    return "Playlist deleted successfully with ID: " + id;
  }

}
