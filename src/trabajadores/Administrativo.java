package trabajadores;

import menus.Utilidades;

@SuppressWarnings("serial")
public class Administrativo extends Trabajador{

	
	
	
	public Administrativo(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro) {
		super(nombre, apellido1, apellido2, dni, centro);
		
	}
	

	public Administrativo() {
		
	}


	/**
	 * Devuelve la nomina del Administrativo
	 * 
	 */
	public double nomina(int mes) {
		return super.sueldoBase + menus.Utilidades.Mes(mes)*10.70;
	}


	
}
