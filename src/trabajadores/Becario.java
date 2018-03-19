package trabajadores;

@SuppressWarnings("serial")
public class Becario extends Trabajador{

	public Becario(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro,
			double nomina) {
		super(nombre, apellido1, apellido2, dni, centro);
		
	}

	public Becario() {
		
	}

		

	public int compareTo(Becario o) {
		return this.compareTo(o);}

	/**
	 * Obtener la nomina del becario
	 */
	public double nomina(int mes) {
		
		return super.sueldoBase;
	}

	

}
