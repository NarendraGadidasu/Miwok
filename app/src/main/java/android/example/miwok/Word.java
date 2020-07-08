package android.example.miwok;

/**Word class can be used to create objects which could be
 * used to populate the contents of the items of ListView*/
public class Word {

    /**private variables for Miwok and Default translation
     * languages*/
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;
    public int mAudioResourceId;

    /**constructor method for creating objects of word class*/
    public Word(String et, String mt, int aud){
        mDefaultTranslation = et;
        mMiwokTranslation = mt;
        mAudioResourceId = aud;
    }

    public Word(String et, String mt, int img, int aud){
        mDefaultTranslation = et;
        mMiwokTranslation = mt;
        mImageResourceId = img;
        mAudioResourceId = aud;
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

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
