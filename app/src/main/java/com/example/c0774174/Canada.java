package com.example.c0774174;

import android.os.Parcel;
import android.os.Parcelable;

public class Canada implements Parcelable
{
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Canada createFromParcel(Parcel in) {
            return new Canada(in);
        }

        public Canada[] newArray(int size) {
            return new Canada[size];
        }
    };

        private int placeId;
        private String placeName;
        private String desc;
        private int placeImage;

        public Canada(int placeId,
                       String placeName, String desc, int placeImage) {
            this.placeId = placeId;
            this.placeName = placeName;
            this.desc = desc;
            this.placeImage = placeImage;
        }

    public int getPlaceId() {
        return placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }

        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }


    public Canada()
    {

    }
    // Parcelling part
    public Canada(Parcel in){
        this.placeName = in.readString();
        this.desc = in.readString();
        this.placeId =  in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.placeName);
        dest.writeString(this.desc);
        dest.writeInt(this.placeId);

    }
    @Override
    public String toString() {
        return "Place Name='" + placeName + '\n' +
                "Place Id='" + placeId + '\n' +
                "Description ='" + desc + '\n'
                ;
    }
}


