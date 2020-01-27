package com.example.odev1;

import android.os.Parcel;
import android.os.Parcelable;

public class Urun implements Parcelable {
    String adi;
    int fiyati;
    int adet;
    int toplamFiyati;

    public Urun(String adi, int fiyati, int adet, int toplamFiyati) {
        this.adi = adi;
        this.fiyati = fiyati;
        this.adet = adet;
        this.toplamFiyati = toplamFiyati;
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getFiyati() {
        return fiyati;
    }

    public void setFiyati(int fiyati) {
        this.fiyati = fiyati;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getToplamFiyati() {
        return toplamFiyati;
    }

    public void setToplamFiyati(int toplamFiyati) {
        this.toplamFiyati = toplamFiyati;
    }
    public static final Creator<Urun> CREATOR = new Creator<Urun>() {
        @Override
        public Urun createFromParcel(Parcel in) {
            return new Urun(in);
        }

        @Override
        public Urun[] newArray(int size) {
            return new Urun[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    protected Urun(Parcel in) {
        adi = in.readString();
        fiyati = in.readInt();
        adet=in.readInt();
        toplamFiyati=in.readInt();
    }


}
