package model;

public class Donativo {
	private int id;
	private float qnt_donativo;
	private String nomeSocio;
	
	public Donativo(float qnt_donativo, String nomeSocio) {
		super();
		this.qnt_donativo = qnt_donativo;
		this.nomeSocio = nomeSocio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getQnt_donativo() {
		return qnt_donativo;
	}

	public void setQnt_donativo(float qnt_donativo) {
		this.qnt_donativo = qnt_donativo;
	}

	public String getNomeSocio() {
		return nomeSocio;
	}

	public void setNomeSocio(String nomeSocio) {
		this.nomeSocio = nomeSocio;
	}
	
}
