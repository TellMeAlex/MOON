package trabajadores;

import java.io.Serializable;

import empresa.Centro;


@SuppressWarnings("serial")
public abstract class Trabajador implements Comparable<Trabajador>, Serializable{
	
	final double sueldoBase = 200;
	
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String Dni;
	private Centro Centro;
	
	public Trabajador(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro) {
		Nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
		Dni = dni;
		Centro = centro;
	}
	public Trabajador() {
		
	}
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return el apellido1
	 */
	public String getApellido1() {
		return Apellido1;
	}

	/**
	 * @param apellido1 el apellido1 a establecer
	 */
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	/**
	 * @return el apellido2
	 */
	public String getApellido2() {
		return Apellido2;
	}

	/**
	 * @param apellido2 el apellido2 a establecer
	 */
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	/**
	 * @return el dni
	 */
	public String getDni() {
		return Dni;
	}

	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(String dni) {
		Dni = dni;
	}

	/**
	 * @return el centro
	 */
	public Centro getCentro() {
		return Centro;
	}

	/**
	 * @param centro el centro a establecer
	 */
	public void setCentro(Centro centro) {
		Centro = centro;
	}
	
	public String nombreCompleto() {
		return getApellido1()+" "+getApellido2()+" "+getNombre();
		
	}

	
	@Override
	public int compareTo(Trabajador o) {
		return this.nombreCompleto().compareTo(nombreCompleto());
	}
	
	public String toString(Object o) {
		return todosLosDatos();
		
	}
	/**
	 * Metodo para devolder la nomina de un trabajador.
	 * @param Nº de mes del que se desa saber la nomina
	 * @return Nomina del empleado
	 */
	public abstract double nomina(int mes);
	
	
	public String todosLosDatos() {
		return getApellido1()+" "+getApellido2()+" "+getNombre()+"-"+getDni();
		}
	public int compare(Trabajador o1, Trabajador o2) {
		return ((Trabajador) o1).compareTo(o2);
	}
	
}
