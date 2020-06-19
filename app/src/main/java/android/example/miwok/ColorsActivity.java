package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        /** Using the data structure array which has fixed size
         * String[] words = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};*/

        /**Using ArrayList which can have variable size*/
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));

        /** Using linear layout of text views which would be suitable for fixed smaller number of items in a list
         * LinearLayout rootView = (LinearLayout)  findViewById(R.id.rootView);
         *byte i = 0;
         *while(i<words.size()) {
         *    TextView textView = new TextView(this);
         *    textView.setText(words.get(i));
         *    rootView.addView(textView);
         *    i++;
         }*/

        /** Using ListView with array adapter will allow view
         * recycling for large number of views preventing memory
         * leak issues*/
        /**ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);*/

        /**Using custom defined word adapter to handle the cases
         * where we need to fill in multiple views within each
         *list item
         */
        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

}