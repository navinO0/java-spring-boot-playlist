// Write your code here

package com.example.song;

import com.example.song.Song;

import java.util.*;



public interface SongRepository{
    ArrayList<Song> getSongs();

    Song getSongById(int songId);

    Song addSong(Song Song);

    Song updateSong(int songId, Song Song);

    void deleteSong(int songId);
}