package android.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

/**Creating a custom class WordAdapter as a sub-class of
 * the class ArrayAdapter<Word>
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    /**Defining the constructor to use the constructor of
     * the super class ArrayAdapter<Word>
     * @param context
     * @param words Array list of Word objects
     * @param color Background color for the text views
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int color){
        super(context, 0, words);
        mColorResourceId = color;
    }

    /**Overriding the behavior of getView function defined in the
     * ArrayAdapter<Word> class
     * *
     * @param position The position from which the data needs to be fetched from the array list words
     * @param convertView The view which needs to be populated with the data
     * @param parent
     * @return The populated view
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null){
            listItemView =  LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView mTextView = (TextView) listItemView.findViewById(R.id.list_item_text_1);

        mTextView.setText(currentWord.getMiwokTranslation());

        TextView dTextView = (TextView) listItemView.findViewById(R.id.list_item_text_2);

        dTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_image);

        if (currentWord.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getmImageResourceId());}
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_item_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
