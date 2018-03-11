package empresa;


import java.io.*;
import java.util.*;

import trabajadores.Trabajador;

@SuppressWarnings("serial")
public class Empresa implements Serializable {
	/**
	 * 
	 */
	
	TreeMap<String , Trabajador> plantilla;
	TreeMap<String , Centro> centros;
	TreeMap<String, Tecnologia> tecnologias;
	
	/**
	 * @author llama
	 * Constructor de clase
	 */
	public Empresa() {
		
		plantilla=new TreeMap <String,Trabajador>();
		centros=new TreeMap<String,Centro>();
		tecnologias=new TreeMap<String,Tecnologia>();
	}

	/**
	 * @return el plantilla
	 */
	public TreeMap <String,Trabajador> getPlantilla() {
		return plantilla;
	}

	/**
	 * @param plantilla el plantilla a establecer
	 */
	public void setPlantilla(TreeMap <String,Trabajador> plantilla) {
		this.plantilla = plantilla;
	}

	/**
	 * @return el centros
	 */
	public Centro getCentros(Centro buscado) {
		centros.get(buscado.getCodigo());
		return null;
	}
	public void añadirCentro() {
		
	}

	/**
	 * @param centros el centros a establecer
	 */
	public void setCentros(TreeMap<String,Centro> centros) {
		this.centros = centros;
	}

	/**
	 * @return el tecnologias
	 */
	public TreeMap<String, Tecnologia> getTecnologias() {
		return tecnologias;
	}

	/**
	 * @param tecnologias el tecnologias a establecer
	 */
	public void setTecnologias(TreeMap<String,Tecnologia> tecnologias) {
		this.tecnologias = tecnologias;
	}
	
		 
	public void altaTrabajador(Trabajador T,TreeMap <String,Trabajador> plantilla) {
		plantilla.put(T.getDni(), T);

	}
	public void bajaTrabajador(Trabajador T,TreeMap <String,Trabajador> plantilla) {
		plantilla.remove(T.getDni(), T);

	}
		
	public Empresa LeerEmpresa() throws FileNotFoundException, IOException, ClassNotFoundException{
		//Leer el objeto guardado
		
		 ObjectInputStream leido = new ObjectInputStream(new FileInputStream("Empresa.txt"));
				return (Empresa)leido.readObject();
				
	}
	
	public void GrabaEmpresa(Empresa o) throws FileNotFoundException, IOException{
		ObjectOutputStream guardado= new ObjectOutputStream(new FileOutputStream("Empresa.txt"));
			guardado.writeObject (o);
	}
	

	
	
}
