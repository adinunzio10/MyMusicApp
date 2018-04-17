package com.example.adinu.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.adinu.mymusicapp.R;
import com.example.adinu.mymusicapp.Word;
import com.example.adinu.mymusicapp.WordAdapter;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("The Devil Wears Prada","HTML Rulez DOOd"));
        words.add(new Word("The Devil Wears Prada","Reptar, King Of The Ozone"));
        words.add(new Word("Avenged Sevenfold","Unholy Confessions"));
        words.add(new Word("Avenged Sevenfold","Bat Country"));
        words.add(new Word("Protest The Hero","Divinity Within"));
        words.add(new Word("Protest The Hero","Sequoia Throne"));
        words.add(new Word("Chiodos","There's No Penguins in Alaska"));
        words.add(new Word("Chiodos","The Words 'Best Friend' Become Redefined"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}