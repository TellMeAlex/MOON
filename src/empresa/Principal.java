package empresa;

import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args)  {
		Scanner lector = new Scanner(System.in);
		boolean salir=false;
		
		
		int selectorMenu;
		Empresa E =new Empresa();
		Centro C=new Centro("Instituto", "Jaen", "Jaen", 01, "953202020");
		//Tecnico T=new Tecnico ();
//-----------------------------------------------------------------------------------------------
		/*
		 * Metodo utulizado para decidir si se carga un objeto empresa o se inicializa uno nuevo
		 */
		
		selectorMenu= Utilidades.primerMenu(); 
		switch (selectorMenu) {
		case 1:
			try {
				E=E.LeerEmpresa();
			} catch (FileNotFoundException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
			break;
		case 2:
			salir=true;
			break;
		default: System.out.println("No ha seleccionado una opcion valido");
			break;
		}
		
		/*
		 * Iniciamos el menu
		 */
		if(salir) {
			do {
				selectorMenu=Utilidades.gestion();
				do {switch (selectorMenu) {
				case 1:
					selectorMenu=Utilidades.gestionCentro();
					
					
					break;
				case 2:

				default:
					break;
				}
					
				} while (salir);
				salir=true;
			} while (salir=!true);
				
		}
		
		
		
		
		
		
		
		
		
		}
	}


