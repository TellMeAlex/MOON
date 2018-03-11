package trabajadores;

@SuppressWarnings("serial")
public class Becario extends Trabajador{

	public Becario(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro,
			double nomina) {
		super(nombre, apellido1, apellido2, dni, centro);
		// TODO Apéndice de constructor generado automáticamente
	}

	public int compareTo(Becario o) {
		return 0;
	}

	@Override
	public double nomina(int mes) {
		
		return 200;
	}

	

}
