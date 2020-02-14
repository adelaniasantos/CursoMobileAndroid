package com.digitalhouse.comunicacaofragmentos.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Cores implements Parcelable {
    public String nomeCor;
    public int hexaCor;

    public Cores(String nomeCor, int hexaCor) {
        this.nomeCor = nomeCor;
        this.hexaCor = hexaCor;
    }

    protected Cores(Parcel in) {
        nomeCor = in.readString();
        hexaCor = in.readInt();
    }

    public static final Creator<Cores> CREATOR = new Creator<Cores>() {
        @Override
        public Cores createFromParcel(Parcel in) {
            return new Cores(in);
        }

        @Override
        public Cores[] newArray(int size) {
            return new Cores[size];
        }
    };

    public String getNomeCor() {
        return nomeCor;
    }

    public void setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
    }

    public int getHexaCor() {
        return hexaCor;
    }

    public void setHexaCor(int hexaCor) {
        this.hexaCor = hexaCor;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nomeCor);
        dest.writeInt(hexaCor);
    }
}
