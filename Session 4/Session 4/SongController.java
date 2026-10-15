
package com.jatin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import jakarta.validation.Valid;

@RestController
public class SongController {

    @PostMapping("/addSong")
    public String addSong(@Valid @RequestBody SongRequest song) {
        return "Song added successfully!";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleError() {
        return "Error: Please enter valid song details!";
    }
}