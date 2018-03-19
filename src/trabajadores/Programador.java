package trabajadores;

import empresa.Utilidades;

@SuppressWarnings("serial")
public class Programador extends Tecnico{

	
	/**
	 * Devuelve la nomina del Programador
	 */
	public double nomina(int mes) {
		return super.sueldoBase + Utilidades.Mes(mes)*20.50;
	}

}
