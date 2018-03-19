package ordenar;

import java.util.Comparator;
import empresa.Utilidades;
import trabajadores.Trabajador;

public class OrdenarNomina implements Comparator<Trabajador> {
	
	@Override
	public int compare(Trabajador t1, Trabajador t2) {

		return (int) (t1.nomina(Utilidades.Mes)-(t2.nomina(Utilidades.Mes)));
			
	}
}


