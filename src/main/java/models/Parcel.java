package models;

/**
 * Created by Guest on 7/31/17.
 */
public class Parcel {
     public Float parcelHeight;
     public Float parcelLength;
     public Float parcelWidth;
     public Float parcelWeight;
//     public boolean parcelWrap;

    public Parcel(Float parcelHeight, Float parcelLength, Float parcelWidth, Float parcelWeight) {

        this.parcelHeight = parcelHeight;
        this.parcelLength = parcelLength;
        this.parcelWidth = parcelWidth;
        this.parcelWeight = parcelWeight;

    }

    public Float volume(){
        return (parcelWidth * parcelLength * parcelHeight);
    }

    public double costToShip(Float distance) {
       return ((this.parcelWeight * 0.1) + ((this.volume()) * 0.1) + (distance * 0.1) + 10);
    }

}
