package controller;

import java.util.ArrayList;

import model.Donativo;

public class GereDonativo {
	private ArrayList<Donativo> arDonativo;
	
	public GereDonativo(){
		this.arDonativo = new ArrayList<Donativo>();
	}

	public ArrayList<Donativo> getArDonativo() {
		return arDonativo;
	}

	public void setArDonativo(ArrayList<Donativo> arDonativo) {
		this.arDonativo = arDonativo;
	}
	
	public void addDonativo(int qnt_donativo, String nomeSocio){
		Donativo dv = new Donativo(qnt_donativo, nomeSocio);
		int novoID = arDonativo.size();
		dv.setId(novoID);
		arDonativo.add(dv);
	}
	public void addDonativo(Donativo dv){
		int novoID = arDonativo.size();
		dv.setId(novoID);
		arDonativo.add(dv);
	}
	
}
