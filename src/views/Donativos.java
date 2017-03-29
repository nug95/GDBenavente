package views;

import java.util.Scanner;

import controller.GereDonativo;
import controller.GereSocio;
import model.Donativo;

public class Donativos {
	
	boolean sair = true;
	int opc = 0;
	
	GereSocio gs = new GereSocio();
	GereDonativo gd = new GereDonativo();
	
	public Donativos(){}
	
	public void GereDonativo(){
		do{
			
			switch(opc){
				case 1: //Adicionar Donativo
					ViewAddDonativo();
					opc = 0;
					break;
				case 2: //Obter Total de Donativos
					opc = 0;
					break;
				case 3://Obter o Socio que mais Doou
					opc = 0;
					break;
				case 4:
					sair = false;
					System.out.printf("\n\n\t Programa terminado com Sucesso!\n\n");
					break;
				default:
					System.out.println("Menu: ");
					System.out.printf("\t 1 - Adicionar Donativo\n");
					System.out.printf("\t 2 - Obter total de Donativos\n");
					System.out.printf("\t 3 - Obter o Socio que mais Doou \n");
					System.out.printf("\t 4 - Voltar ao menu anterior\n");
					System.out.printf("-> ");
					opc = new Scanner(System.in).nextInt();
			}
			
		}while(sair);
	}

	public void ViewAddDonativo(){
		System.out.printf("Qual o nome do Socio que quer doar?");
		String nome = new Scanner(System.in).nextLine();
		System.out.printf("Qual e a quantia que o Socio quer doar?");
		float quantia = new Scanner(System.in).nextFloat();
		
		if(nome.compareTo(gs.getSocio(nome).getNome()) == 0){
			Donativo donat = new Donativo(quantia, nome);
			gd.addDonativo(donat);
		}else{
			System.out.printf("O nome introduzido nao corresponde a nenhum Socio");
		}
	}
}
