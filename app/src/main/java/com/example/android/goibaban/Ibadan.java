package com.example.android.goibaban;

public class Ibadan {
    private int mCategoryImage;
    private String mCategory;
    private String mItem;
    private String mItemAddress;
    private int mItemPicture;
    private String mItemDetails;
    private String mItemWebsite;


    public Ibadan(int mCategoryImage, String mCategory) {
        this.mCategoryImage = mCategoryImage;
        this.mCategory = mCategory;

    }

    public Ibadan(int mCategoryImage, String mItem, String mItemAddress) {

        this.mItem = mItem;
        this.mItemAddress = mItemAddress;
        this.mCategoryImage = mCategoryImage;
    }

    public Ibadan(int mItemPicture, String mItem, String mItemAddress, String mItemWebsite, String mItemDetails) {
        this.mItem = mItem;
        this.mItemAddress = mItemAddress;
        this.mItemPicture = mItemPicture;
        this.mItemDetails = mItemDetails;
        this.mItemWebsite = mItemWebsite;
    }

    public int getCategoryImage() {
        return mCategoryImage;
    }

    public String getItem() {
        return mItem;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getItemAddress() {
        return mItemAddress;
    }

    public int getItemPicture() {
        return mItemPicture;
    }

    public String getItemDetails() {
        return mItemDetails;
    }

    public String getItemWebsite() {
        return mItemWebsite;
    }
}
