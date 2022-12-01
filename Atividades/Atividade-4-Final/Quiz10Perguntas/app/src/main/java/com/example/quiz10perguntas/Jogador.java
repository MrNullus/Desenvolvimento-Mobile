package com.example.quiz10perguntas;


import android.os.Parcel;
import android.os.Parcelable;

public class Jogador implements Parcelable {

    private final String nome;
    private int acertos;


    public Jogador(String nome, int acertos) {
        this.nome = nome;
        this.acertos = acertos;
    }

    protected Jogador(Parcel in) {
        nome = in.readString();
        acertos = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeInt(acertos);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Jogador> CREATOR = new Creator<Jogador>() {
        @Override
        public Jogador createFromParcel(Parcel in) {
            return new Jogador(in);
        }

        @Override
        public Jogador[] newArray(int size) {
            return new Jogador[size];
        }
    };

    public String getNome() {
        return this.nome;
    }

    public int getAcertos() {
        return this.acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

}
