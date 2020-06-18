package android.example.miwok;

/**Word class can be used to create objects which could be
 * used to populate the contents of the items of ListView*/
public class Word {

    /**private variables for Miwok and Default translation
     * languages*/
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    /**constructor method for creating objects of word class*/
    public Word(String et, String mt){
        mDefaultTranslation = et;
        mMiwokTranslation = mt;
    }

    /**method to access the Miwok translation*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**method to access the Default translation*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
