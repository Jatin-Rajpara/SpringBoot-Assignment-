
package com.jatin;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;

public class SongRequest {

    @NotNull
    private String title;

    @NotNull
    private String artist;

    @Min(30)
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