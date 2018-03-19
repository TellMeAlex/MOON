package ordenar;

import java.util.TreeMap;

import empresa.Centro;

import java.util.Map.Entry;


import trabajadores.Trabajador;

public class Busqueda {
	
	
	public static TreeMap<String , Trabajador> buscarTrabajador(TreeMap<String , Trabajador> plantilla,String dni) {
		TreeMap<String , Trabajador> cache=new TreeMap <String,Trabajador>();
		
		for (Entry<String, Trabajador> p : plantilla.entrySet()) {
			Trabajador C=p.getValue();
			
			
			if (C.getDni().toUpperCase()==dni.toUpperCase()) {
				cache.put(dni, C);
			}
		}
		return cache;
		
	}
	
	public static TreeMap<String , Trabajador> buscarNombre(TreeMap<String , Trabajador> plantilla,String nombre) {
		TreeMap<String , Trabajador> cache=new TreeMap <String,Trabajador>();
		
		for (Entry<String, Trabajador> p : plantilla.entrySet()) {
			Trabajador C=p.getValue();
			
			
			if ((C.nombreCompleto().toUpperCase().indexOf(nombre.toUpperCase()))<=0) {
				cache.put(C.getDni(), C);
			}
		}
		return cache;
		
		
		
	}
	
	
	
	public static TreeMap<String , Centro> buscarCentro(TreeMap<String , Centro> Centros,String codigo) {
		TreeMap<String , Centro> cache=new TreeMap <String,Centro>();
		
		for (Entry<String, Centro> p : Centros.entrySet()) {
			Centro C=p.getValue();
			
			
			if (C.getCodigo().toUpperCase()==codigo.toUpperCase()) {
				cache.put(codigo, C);
			}
		}
		return cache;
		
	}

	public static void Mostrar (TreeMap<String , Trabajador> A) {
		for (Entry<String, Trabajador> p : A.entrySet()) {
			Trabajador C=p.getValue();
			System.out.println(C.todosLosDatos());
		}
	}

}
