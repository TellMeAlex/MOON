package trabajadores;

import java.util.ArrayList;

import empresa.Tecnologia;



@SuppressWarnings("serial")
public abstract  class Tecnico extends Trabajador implements Comparable<Trabajador> {

	final double sueldoBase = 300;
	
	ArrayList <Tecnologia> tecnologias;
	public Tecnico(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro,
			ArrayList <Tecnologia> tecnologias) {
		super(nombre, apellido1, apellido2, dni, centro);
		
	}
	
	public Tecnico() {
		super(null);
	}
	
}
