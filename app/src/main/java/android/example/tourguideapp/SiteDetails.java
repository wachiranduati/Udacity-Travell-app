package android.example.tourguideapp;

public class SiteDetails {
    private String mSiteLocation;
    private int mSiteImage;
    private String mSiteContact;

    //constructor method doubling up as the setter method too
    public SiteDetails(String siteLocation, int siteImage, String siteContact){
        mSiteLocation = siteLocation;
        mSiteImage = siteImage;
        mSiteContact = siteContact;
    }

    public String getmSiteLocation(){
        return mSiteLocation;
    }

    public int getmSiteImage(){
        return  mSiteImage;
    }

    public String getmSiteContact(){
        return  mSiteContact;
    }

    public String toString(){
        return "SiteLocation "+mSiteLocation+"\n Site Image "+mSiteImage+"\n Site Contact "+mSiteContact;
    }
}
