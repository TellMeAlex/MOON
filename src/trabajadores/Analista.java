package trabajadores;

@SuppressWarnings("serial")
public class Analista extends Trabajador {

	public Analista(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro) {
		super(nombre, apellido1, apellido2, dni, centro);
		
	}

	public Analista() {
	
	}
	

	public int compareTo(Analista o) {
		
		return this.compareTo(o);}

	/**
	 * Devuelve la nomina del Analista
	 * 
	 */
	public double nomina(int mes) {
		//Se multiplica al final por 1.1 por que tienen un 10% mas de complemento
		return (super.sueldoBase + menus.Utilidades.Mes(mes)*30)*1.1;
	}

	
}
