
package com.jatin;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;

public class SongRequest {

    @NotNull(message = "Title cannot be null")
    private String title;

    @NotNull(message = "Artist cannot be null")
    private String artist;

    @Min(value = 30, message = "Duration must be at least 30 seconds")
    private int duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}