
package com.jatin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
public class SongController {

    @PostMapping("/addSong")
    public String addSong(@Valid @RequestBody SongRequest song) {

        return "Song added successfully!";
    }
}