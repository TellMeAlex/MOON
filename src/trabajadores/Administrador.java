package trabajadores;

import empresa.Utilidades;

@SuppressWarnings("serial")
public class Administrador extends Trabajador{

	public Administrador(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro) {
		super(nombre, apellido1, apellido2, dni, centro);
		
	}

	@Override
	public double nomina(int mes) {
		
		return ((Utilidades.Mes(mes)*10.70)+200);
	}

	
}
