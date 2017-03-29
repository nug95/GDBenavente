package application;

import java.util.Scanner;

import controller.GereDonativo;
import views.Donativos;
import views.Socios;

public class App {

	boolean sair = true;
	int opc = 0;
	boolean esco = true;
	
	Socios socios = new Socios();
	Donativos donativos = new Donativos();
	
	public App(){
		
		do{
			switch(opc){
				case 1: //Adicionar Socio
					socios.SocioAdd();
					opc = 0;
					break;
				case 2: //Listar Socios
					socios.showAllSocios();
					opc = 0;
					break;
				case 3://Gerir Donativos
					donativos.GereDonativo();
					opc = 0;
					break;
				case 4:
					sair = false;
					System.out.printf("\n\n\t Programa terminado com Sucesso!\n\n");
					break;
				default:
					System.out.println("Menu: ");
					System.out.printf("\t 1 - Adicionar Socio\n");
					System.out.printf("\t 2 - Listar Socios\n");
					System.out.printf("\t 3 - Gerir Donativos \n");
					System.out.printf("\t 4 - Terminar Programa\n");
					System.out.printf("-> ");
					opc = new Scanner(System.in).nextInt();
			}
		}while(sair);
	}
	
	public static void main(String[] args) {
		//MData.FillData();
		//MData.ListData();
		new App();
	}

}
