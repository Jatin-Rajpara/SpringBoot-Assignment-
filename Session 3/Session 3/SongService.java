
package com.jatin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    SongRepository rs;


    public Song addSong(Song song) {
        return rs.save(song);
    }


    public List<Song> getAllSongs() {
        return rs.findAll();
    }

  
    public void deleteSong(Long id) {
        rs.deleteById(id);
    }
}
