package com.example.adinu.mymusicapp;
// A class to allow the app to learn an Miwok word and display it's english translation.
public class Word {

    // English Translation of the word
    private String mArtistName;

    // Miwok translation of the word
    private String mSongName;

    private int mImageResourceId;

    public Word(String artistName, String songName, int imageResourceId) {
        mArtistName = artistName;
        mSongName = songName;
        mImageResourceId = imageResourceId;
    }

    // Get the Artist Name for the song
    public String getArtistName() {
        return mArtistName;
    }

    // Get the Song Name
    public String getSongName() {
        return mSongName;
    }

    // Get the icon
    public int getImageResourceID() {
        return mImageResourceId;
    }
}
