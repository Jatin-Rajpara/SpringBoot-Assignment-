
package com.jatin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @Autowired
    SongService service;

   
    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return service.addSong(song);
    }

    
    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return service.getAllSongs();
    }

    
    @DeleteMapping("/songs/{id}")
    public String deleteSong(@PathVariable int id) {
        service.deleteSong(id);
        return "Song deleted successfully";
    }
}
