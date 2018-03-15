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
	static String [] gestion= {"Gestión Centro de Trabajo.","Gestion de Tecnologia","Gestión de Empleado","Listar","Buscar empleado","Salir"};
	static String [] gestionCentro= {"Añadir Centro de Trabajo","Borrar Centro de Trabjo","Salir"};
	static String [] datosCentro= {"Codigio","Nombre","Provincia","Localidad","Telefono","Salir"};
	static String [] gestionTecnologias= {"Añadir Tecnologia","Borrar Tecnologia","Salir"};
	static String [] datosTecnologia= {"Nombre","Descripcion","Salir"};
	static String [] gestionEmpleados= {"Añadir Empleado","Borrar Empleado","Salir"};
	static String [] buscarEmpleados= {"Por nombre","Por DNI","Por Apellido","Salir"};
	static String [] Empleados= {"Tecnico","Administrativo","Salir"};
	static String [] Tecnicos= {"Programador","Analista","Becario","Salir"};
	static Scanner lector = new Scanner(System.in);
	
	
	
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
	 * 
	 * @param vector de String
	 * @return El tamaño del String mas grande
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
	
	public void listar(Collection<Trabajador> a) {
		for (Trabajador t : a) {
			System.out.println(t);
		}
	}
	
	
	/*
	 * Impriem en pantalal el menu obligatorio.
	 */
	public static int primerMenu() {
		
		Menu(primerMenu, "|",".");
		return lector.nextInt();
	}
	public static int gestion() {
		Menu(gestion, "|",".");
		return lector.nextInt();
	}
	public static int gestionCentro() {
		Menu(gestionCentro, "|",".");
		return lector.nextInt();
	}
	public static int gestionTecnologias() {
		Menu(gestionTecnologias, "|",".");
		return lector.nextInt();
	}
	public static int gestionEmpleados() {
		Menu(gestionEmpleados, "|",".");
		return lector.nextInt();
	}
	public static int buscarEmpleados() {
		Menu(buscarEmpleados, "|",".");
		return lector.nextInt();
	}

	
	public static boolean gestionCentro(int selector,Empresa E) {
		boolean salir=false;
		if (selector==1) {
			 
			
			
		}
		return (Boolean) null;
	}
	public static double dias(int mes) {
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
	/*
	 * Ordenar por Nombre los trabajadores
	 *@param Plantilla de trabjadores.
	 */
	public static void ordenarNombre(ArrayList<Trabajador> plantilla) {
		Collections.sort(plantilla,new Comparator<Trabajador>() {
                  public int compare( Trabajador t1, Trabajador t2) {
                      int someIntVal = t1.compareTo(t2);
                      return someIntVal;
                      }
                  }
		);
		
	}
}
	