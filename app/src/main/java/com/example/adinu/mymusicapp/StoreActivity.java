package com.example.adinu.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("The Devil Wears Prada","Gauntlet of Solitude", R.drawable.ic_store_black_24dp));
        words.add(new Word("The Devil Wears Prada","Dogs Can Grow Beards All Over", R.drawable.ic_store_black_24dp));
        words.add(new Word("The Devil Wears Prada","Texas Is South", R.drawable.ic_store_black_24dp));
        words.add(new Word("The Devil Wears Prada","Sassafras", R.drawable.ic_store_black_24dp));
        words.add(new Word("The Devil Wears Prada","I Hate Buffering", R.drawable.ic_store_black_24dp));
        words.add(new Word("Chiodos","All Nereids Beware", R.drawable.ic_store_black_24dp));
        words.add(new Word("Chiodos","One Day Women WIll All Become Monsters", R.drawable.ic_store_black_24dp));
        words.add(new Word("Chiodos","Baby You Wouldn't Last A Minute On The Creek", R.drawable.ic_store_black_24dp));
        words.add(new Word("Chiodos","No Hardcore Dancing In The Living Room", R.drawable.ic_store_black_24dp));
        words.add(new Word("Chiodos","We're Gonna HAve Us a Champagne Jam", R.drawable.ic_store_black_24dp));
        words.add(new Word("Protest The Hero","Bloodmeat", R.drawable.ic_store_black_24dp));
        words.add(new Word("Protest The Hero","The Dissentience", R.drawable.ic_store_black_24dp));
        words.add(new Word("Protest The Hero","Bone Marrow", R.drawable.ic_store_black_24dp));
        words.add(new Word("Protest The Hero","Palms Read", R.drawable.ic_store_black_24dp));
        words.add(new Word("Protest The Hero","Spoils", R.drawable.ic_store_black_24dp));
        words.add(new Word("Avenged Sevenfold","Chapter Four", R.drawable.ic_store_black_24dp));
        words.add(new Word("Avenged Sevenfold","Eternal Rest", R.drawable.ic_store_black_24dp));
        words.add(new Word("Avenged Sevenfold","Clairvoyant Disease", R.drawable.ic_store_black_24dp));
        words.add(new Word("Avenged Sevenfold","Trashed And Scattered", R.drawable.ic_store_black_24dp));
        words.add(new Word("Avenged Sevenfold","Seize the Day", R.drawable.ic_store_black_24dp));

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