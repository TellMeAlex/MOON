package empresa;
import java.util.*;

import trabajadores.Trabajador;

/**
 * Conjunto de mis utilidades
 * @author Alejandro
 *
 */

public class Utilidades {
	static String [] primerMenu = {"Cargar empresa.","Crear una nueva empresa","Salir"};
	static String [] gestion= {"Salir","Gestión Centro de Trabajo.","Gestion de Tecnologia","Gestión de Empleado","Listar","Buscar empleado"};
	static String [] gestionCentro= {"Salir","Añadir Centro de Trabajo","Borrar Centro de Trabjo"};
	static String [] datosCentro= {"Salir","Codigio","Nombre","Provincia","Localidad","Telefono"};
	static String [] gestionTecnologias= {"Salir","Añadir Tecnologia","Borrar Tecnologia"};
	static String [] datosTecnologia= {"Salir","Nombre","Descripcion"};
	static String [] gestionEmpleados= {"Salir","Añadir Empleado","Borrar Empleado"};
	static String [] buscarEmpleados= {"Salir","Por nombre","Por DNI","Por Apellido",};
	static String [] Empleados= {"Salir","Tecnico","Administrativo"};
	static String [] Tecnicos= {"Salir","Programador","Analista","Becario"};
	public static int Mes=1;
	static Scanner lector = new Scanner(System.in);
	
	
	public static void setMes(int mes) {
		Mes=mes;
	}
	
	
	/**
	 * @param Nº de repeticiones
	 * @param Caracter a repetir
	 * @return 
	 */
	public static String Pintalinea(int repeticiones, String caracter) {
		String resultado = "";
		for (int i = 0; i < repeticiones ; i++) {
			System.out.print(resultado + caracter);			
		}
		
		return resultado;
		
	}
	/**
	 * @param Array con las opciones (sin numerar) y caracter con el que delimitar los bordes 
	 * @return Menu en pantalla
	 */
	public static void Menu(String [] opciones,String caracter){
		
		int masGrande=MasGrande(opciones) ;
		
		
		System.out.println(bordes(masGrande, caracter));
		for (int i = 0; i < opciones.length; i++) {
			int lienapeque=masGrande-opciones[i].length();
			System.out.printf(caracter+(i+1)+"-"+opciones[i]);
			System.out.println(Pintalinea(lienapeque," ")+caracter);
		}
		System.out.println(bordes(masGrande, caracter));
		
	}
	
	/**
	 * @param Array con las opciones (sin numerar) y caracter con el que delimitar los bordes 
	 *  1º caratacter laterales, 2º Linea superior e inferior 
	 * @return Menu en pantalla
	 */
	public static void Menu(String [] opciones,String caracter,String superior){
		
		int masGrande=MasGrande(opciones) ;
		
		
		System.out.println(bordes(masGrande, superior));
		for (int i = 0; i < opciones.length; i++) {
			int lienapeque=masGrande-opciones[i].length();
			System.out.printf(caracter+(i+1)+"-"+opciones[i]);
			System.out.println(Pintalinea(lienapeque," ")+caracter);
		}
		System.out.println(bordes(masGrande, superior));
		
	}

	/**
	 * @param Vector de String
	 * @return El tamaño(int) del String mas grande
	 */
	
	public static int MasGrande(String[] vector ) {
		int valor_mas_alto=0;
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].length()>valor_mas_alto) {
				valor_mas_alto=vector[i].length();
			}
		}
		return valor_mas_alto;
	}
	

	public static String bordes(int repeticiones, String caracter) {
		return Pintalinea(repeticiones+4, caracter);
	}

	public void listar(Collection<Trabajador> a,String menu) {
		System.out.println(menu);
		for (Trabajador t : a) {
			System.out.println(t);
		}
		
	}

	/**
	 * Limpia la consola 
	 */
	
	public static void limpiar(){
		for (int i=0; i < 25; i++)
		{System.out.println();}
		}
	
	/**
	 * Imprime en pantalla el menu de cargar o la empresa.
	 */
	public static int primerMenu() {		
		Menu(primerMenu, "|",".");
		return lector.nextInt();
	}
	/**
	 * Imprime en pantalla el menu de cargar o la empresa.
	 */
	public static int menuGestion() {
		Menu(gestion, "|",".");
		return lector.nextInt();
	}
	/**
	 * Imprime en pantalla el menu de Gestion Centro.
	 */
	public static int menuGestionCentro() {
		Menu(gestionCentro, "|",".");
		return lector.nextInt();
	}
	/**
	 * Imprime en pantalla el menu de Gestiones de Tecnologias.
	 */
	public static int menuGestionTecnologias() {
		Menu(gestionTecnologias, "|",".");
		return lector.nextInt();
	}
	/**
	 * Imprime en pantalla el menu Gestion Empleados
	 */
	public static int menuGestionEmpleados() {
		Menu(gestionEmpleados, "|",".");
		return lector.nextInt();
	}
	/**
	 * Imprime en pantalla el menu BuscarEmpleados
	 */
	public static int menuBuscarEmpleados() {
		Menu(buscarEmpleados, "|",".");
		return lector.nextInt();
	}

	/**
	 * Gestion del centro de trabajao
	 * @param E
	 */
	public static boolean gestionCentro(int selector,Empresa Emp) {
		boolean salir=true;
		String datos;
		switch (selector) {
		case 1:
			salir=false;
			break;
		case 2:
			//creamos un nuevo centro preguntando los datos
			Centro cache=new Centro(Utilidades.PreguntaCentro());
			
			//Y lo agregamos al treemap de centros
			Emp.añadirCentro(cache);
			
			break;
		case 3:
			
			Emp.listarCentros();
			//reguntamos cual es el codigo del centro
			lector.nextLine();
			System.out.println("¿Cual es el codigo del centro a eliminar?");
			datos=lector.nextLine();
			Emp.borraCentro(datos);
			System.out.println("Borrado.");
			lector.nextLine();
			Utilidades.limpiar();
			break;
		default:
			System.out.println("No es una opción valida. Pruebe otra vez.");
			break;
		}
		return salir;
	}
		
		/**
		 * Metodo (chapucero) para obtener los dias que tiene cada mes
		 * @param Nº de mes
		 * @return dias que tiene
		 */
		
	public static double Mes(int mes) {
		double dia=0;
		if (mes==1) { dia=31;};
		if (mes==2) { dia=28;};
		if (mes==3) { dia=31;};
		if (mes==4) { dia=30;};
		if (mes==5) { dia=31;};
		if (mes==6) { dia=30;};
		if (mes==7) { dia=31;};
		if (mes==8) { dia=31;};
		if (mes==9) { dia=30;};
		if (mes==10) { dia=31;};
		if (mes==11) { dia=30;};
		if (mes==12) { dia=31;};
		return dia;
		
	}
	
	/**
	 * Metodo para generar un vector para recoger los datos del centro
	 * @return String[]
	 */
	
	public static String[] PreguntaCentro() {
		String datos[]=new String[5];
		lector.nextLine();
		System.out.println("Nombre del centro");
		datos[0]=lector.nextLine();
		
		System.out.println("Nombre de la localidad");
		datos[1]=lector.nextLine();
		
		System.out.println("Nombre de la provincia");
		datos[2]=lector.nextLine();
		
		System.out.println("Codigo");
		datos[3]=lector.nextLine();
	
		System.out.println("Telefono");
		datos[4]=lector.nextLine();
	
		return datos;
		
	}
	
}
	