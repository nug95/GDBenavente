package model;

public class Socio {
	
	private int 	ID;
	private String 	nome,
					localidade,
					Contacto;
	
	
	public Socio(String nome, String localidade, String contacto) {
		super();
		this.nome = nome;
		this.localidade = localidade;
		Contacto = contacto;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	public String getContacto() {
		return Contacto;
	}


	public void setContacto(String contacto) {
		Contacto = contacto;
	}
	
	
}
