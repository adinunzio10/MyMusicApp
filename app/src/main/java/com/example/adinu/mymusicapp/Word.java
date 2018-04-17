package com.example.adinu.mymusicapp;
// A class to allow the app to learn an Miwok word and display it's english translation.
public class Word {

    // English Translation of the word
    private String mArtistName;

    // Miwok translation of the word
    private String mSongName;

    public Word(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    // Get the English Translation of the word
    public String getArtistName() {
        return mArtistName;
    }

    // Get the Miwok translation of the word
    public String getSongName() {
        return mSongName;
    }
}
