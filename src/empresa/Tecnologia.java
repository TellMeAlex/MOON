package empresa;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Tecnologia implements Serializable{
	private String nombre;
	private int codigo;

	public Tecnologia(String nombre,int codigo) 
	{
		this.setNombre(nombre);
		this.setCodigo(codigo);	
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo el codigo a establecer
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String toString(Object T) {
		return nombre;
		
	}
}
