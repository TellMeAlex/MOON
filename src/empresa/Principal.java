package empresa;

import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args)  {
		//Scanner lector = new Scanner(System.in);
		boolean salir=false;
		
		
		int selectorMenu;
		Empresa E =new Empresa();
		Centro C=new Centro("Instituto", "Jaen", "Jaen", "01", "953202020");
		E.añadirCentro(C);
		//Tecnico T=new Tecnico ();
		try {
			E.GrabaEmpresa(E);
		} catch (IOException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		}
		
		
		
		
//-----------------------------------------------------------------------------------------------
		/*
		 * Metodo utulizado para decidir si se carga un objeto empresa o se inicializa uno nuevo
		 */
		
		selectorMenu= Utilidades.primerMenu(); 
		switch (selectorMenu) {
		case 1:
			//Cargamos la empresa guardada en el documento empresa.txt
			
			try {
				E=E.LeerEmpresa();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// Cambiamos el valor de salir para entrar al menu. 
			salir=true;
			break;
		case 2:
			//Puesto que Empresa ya esta creada no hace falta hacer nada.
			
			salir=true;
			break;
		default: 
			/*
			 * Mensaje de error 
			 */
			System.out.println("No ha seleccionado una opcion valido");
			break;
		}
		
		/*
		 * Iniciamos el menu.
		 */
		if(salir) {
			do {
				//Preguntamos opciones del menu principal
				selectorMenu=Utilidades.menuGestion();
				
				do {
					switch (selectorMenu) {
					
				case 1:  //Salimos de la Aplicacion
					
					salir=true;
					break;
				
				case 2:
					selectorMenu=Utilidades.menuGestionCentro();
						while (Utilidades.gestionCentro(selectorMenu, E));
					
				default:
					break;
				}
					System.out.println("1");
				} while (salir=!true);
				
				Utilidades.limpiar();
			} while (salir=!true);
			System.out.println("2");
		}
		
		
		
		
		
		
		
		
		
		}
	}


