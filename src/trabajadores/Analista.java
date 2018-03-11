package trabajadores;

import empresa.Utilidades;

@SuppressWarnings("serial")
public class Analista extends Trabajador {

	public Analista(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro) {
		super(nombre, apellido1, apellido2, dni, centro);
		// TODO Apéndice de constructor generado automáticamente
	}

	public int compareTo(Analista o) {
		
		return this.compareTo(o);}

	@Override
	public double nomina(int mes) {
		double nomina=(Utilidades.dias(mes)*30)+200;
		return (nomina*0.10)+nomina;
	}
	
}
