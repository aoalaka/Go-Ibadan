package com.example.android.goibaban;

import android.os.Parcel;
import android.os.Parcelable;

public class Ibadan implements Parcelable {
    private int mItemPicture;
    private String mItem;
    private String mItemAddress;
    private String mItemWebsite;
    private String mItemDetails;


    public Ibadan(Parcel in) {
        mItemPicture = in.readInt();
        mItem = in.readString();
        mItemAddress = in.readString();
        mItemWebsite = in.readString();
        mItemDetails = in.readString();
    }


    // This is to de-serialize the object
    public static final Parcelable.Creator<Ibadan> CREATOR = new Parcelable.Creator<Ibadan>() {
        public Ibadan createFromParcel(Parcel in) {
            return new Ibadan(in);
        }

        public Ibadan[] newArray(int size) {
            return new Ibadan[size];
        }
    };

    public Ibadan(int mItemPicture, String mItem, String mItemAddress, String mItemWebsite, String mItemDetails) {
        this.mItemPicture = mItemPicture;
        this.mItem = mItem;
        this.mItemAddress = mItemAddress;
        this.mItemWebsite = mItemWebsite;
        this.mItemDetails = mItemDetails;
    }

    public String getItem() {
        return mItem;
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

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mItemPicture);
        parcel.writeString(mItem);
        parcel.writeString(mItemAddress);
        parcel.writeString(mItemWebsite);
        parcel.writeString(mItemDetails);
    }

}
