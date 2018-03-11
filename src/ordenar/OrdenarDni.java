package ordenar;

import java.util.Comparator;

import trabajadores.Trabajador;


public class OrdenarDni implements Comparator<Trabajador> {

		@Override
		public int compare(Trabajador t1, Trabajador t2) {
			
			return t1.getDni().compareTo(t2.getDni());
		}
	}

