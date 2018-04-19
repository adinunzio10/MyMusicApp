package com.example.adinu.mymusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // Create Custom Constructor used to populate list with data

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    // Create internal storage for array adapter.
    private WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word mArtist = getItem(position);
        TextView artistView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistView.setText(mArtist.getArtistName());

        Word mSong = getItem(position);
        TextView songView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songView.setText(mSong.getSongName());

        return listItemView;
    }
}
