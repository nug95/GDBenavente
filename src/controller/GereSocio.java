package controller;

import java.util.ArrayList;

import model.Socio;

public class GereSocio {
	private ArrayList<Socio> arSocio;
	
	public GereSocio(){
		this.arSocio = new ArrayList<Socio>();
	}
	
	public void addSocio(String nome, String localidade, String contacto){
		Socio s = new Socio(nome, localidade, contacto);
		
		int novoID = arSocio.size();
		s.setID(novoID);
		arSocio.add(s);
	}
	public void addSocio(Socio s){
		
		int novoID = arSocio.size();
		s.setID(novoID);
		arSocio.add(s);
	}

	public ArrayList<Socio> getArSocio() {
		return arSocio;
	}

	public void setArSocio(ArrayList<Socio> arSocio) {
		this.arSocio = arSocio;
	}
	
	public Socio getSocio(String ns){
		for(Socio s: arSocio){
			if(s.getNome() == ns){
				return s;
			}
		}
		return null;
	}
	
	
}
