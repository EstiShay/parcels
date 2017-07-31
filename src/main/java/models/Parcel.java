package models;

/**
 * Created by Guest on 7/31/17.
 */
public class Parcel {
     public int parcelHeight;
     public int parcelLength;
     public int parcelWidth;
     public int parcelWeight;
     public int parcelVolume;
     public float parcelCost;
     public boolean parcelWrap;

    public Parcel(int parcelHeight, int parcelLength, int parcelWidth, int parcelWeight) {

        this.parcelHeight = parcelHeight;
        this.parcelLength = parcelLength;
        this.parcelWidth = parcelWidth;
        this.parcelWeight = parcelWeight;
        this.parcelVolume = 0;
        this.parcelCost = 0;
        this.parcelWrap = false;
    }

    public int volume(){
        return (parcelWidth * parcelLength * parcelHeight);
    }

}
