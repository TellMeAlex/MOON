package trabajadores;

import empresa.Utilidades;

@SuppressWarnings("serial")
public class Programador extends Tecnico{

	@Override
	public double nomina(int mes) {
		return (Utilidades.dias(mes)*20.50)+200;
	}

}
