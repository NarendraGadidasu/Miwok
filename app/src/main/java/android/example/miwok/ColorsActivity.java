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

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'acha"));

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