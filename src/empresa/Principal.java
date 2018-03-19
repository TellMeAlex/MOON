package empresa;

import java.io.*;

public class Principal {

	
	public static void main(String[] args)  {
		//Scanner lector = new Scanner(System.in);
		boolean salir=false;
				
		int selectorMenu;
		Empresa E =new Empresa();
		Centro C=new Centro("Instituto", "Jaen", "Jaen", "01", "953202020");
		E.añadirCentro(C);
		String []dato= {"nobrecentro","Jaen","JAen","00","123456789"};
		Centro p=new Centro (dato);
		E.añadirCentro(p);
		//Tecnico T=new Tecnico ();
		try {
			E.GrabaEmpresa(E);
		} catch (IOException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		}
		
//------------------------------Metodo que he considerado necesario utilizar aqui------------------------	
		
		
		
//-------------------------------------------------------------------------------------------------------
		/*
		 * Metodo utulizado para decidir si se carga un objeto empresa o se inicializa uno nuevo
		 */
		
		selectorMenu= menus.Utilidades.primerMenu(); 
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
				selectorMenu=menus.Utilidades.menuGestion();
				do {
					switch (selectorMenu) {
					
				case 1:  //Salimos de la Aplicacion
					
					salir=false;
					break;
				
				case 2:
					int eleccion=menus.Utilidades.menuGestionCentro();
						while (menus.Utilidades.gestionCentro(eleccion, E));
						salir=true;
						break;
				case 3:
					eleccion=(menus.Utilidades.menuGestionTecnologias());
						while (menus.Utilidades.gestionTecnologia(eleccion, E));
						salir=true;
						break;
				case 4:
					selectorMenu=menus.Utilidades.menuGestionEmpleados();
						while (menus.Utilidades.gestionEmpleado(selectorMenu, E));
						salir=true;
						break;
				case 5:
					selectorMenu=menus.Utilidades.menuListar();
						while (menus.Utilidades.gestionListas(selectorMenu, E));
						salir=true;
						break;
						
				case 6:
					selectorMenu=menus.Utilidades.menuBuscarEmpleados();
						while (menus.Utilidades.gestionBusqueda(selectorMenu, E));
						salir=true;
						break;
				default:
					System.out.println("No ha elegido una opcion valida");
				}
				
				} while (salir);
				
				menus.Utilidades.limpiar();
			} while (salir=true);
			System.out.println("2");
		}
		
		
		
		
		
		
		
		
		
		}
	}