package com.example.quiz10perguntas;


public class Jogador implements Parcelable {

	private final String nome;
	private final int acertos;
	
	
    public Customer(String nome, int acertos) {
        this.nome    = nome;
		this.acertos = acertos;
    }
	
	public String getNome() {
		this.nome;
	}
	public int getAcertos() {
		this.acertos;
	}
	public int setAcertos(int acertos) {
		this.acertos += acertos;
	}
	
	
	/* 
		Metodos do Parcelable
	*/
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public LeadData createFromParcel(Parcel in ) {
            return new Customer( in );
        }

        public Customer[] newArray(int size) {
            return new Customer[size];
        }
    };


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeInt(acertos);
    }

    private void readFromParcel(Parcel in ) {
        nome    = in .readString();
        acertos = in .readInt();
    }
	
}
