
package com.jatin;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, int> {

    List<Song> findByArtist(String artist);

}
