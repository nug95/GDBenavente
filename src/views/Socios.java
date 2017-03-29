package views;

import java.util.Scanner;

import controller.GereSocio;
import model.Socio;

public class Socios {
	
	GereSocio gs = new GereSocio();
	
	public Socios(){}
	
	public void SocioAdd(){
		System.out.println("Nome do Socio: ");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("Localidade do Socio: ");
		String localidade = new Scanner(System.in).nextLine();
		System.out.println("Contacto do Socio: ");
		String contacto = new Scanner(System.in).nextLine();
		
		Socio s = new Socio(nome, localidade, contacto);
		gs.addSocio(s);
		
		System.out.printf("\n\tSocio bem Inserido!\n");
	}
	
	public void showAllSocios(){
		for(int i=0; i<gs.getArSocio().size(); i++){
			System.out.printf("\nID: %d \nNome: %s \nLocalidade: %s \nContacto: %s \n",
					gs.getArSocio().get(i).getID(), 
					gs.getArSocio().get(i).getNome(),
					gs.getArSocio().get(i).getLocalidade(),
					gs.getArSocio().get(i).getContacto()
			);
		}
		
		System.out.printf("\n");
	}
}
