
package com.jatin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    @PostMapping("/addPlaylist")
    public String addPlaylist() {
        return "Playlist added successfully!";
    }
}