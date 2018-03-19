package empresa;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Tecnologia implements Serializable{
	private String nombre;
	private String codigo;

	public Tecnologia(String nombre,String codigo) 
	{
		this.setNombre(nombre);
		this.setCodigo(codigo);	
	}
	
	public Tecnologia(String datos[]) 
	{
		this.setNombre(datos[0]);
		this.setCodigo( datos[1]);	
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
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param datos el codigo a establecer
	 */
	public void setCodigo(String datos) {
		this.codigo = datos;
	}
	public String toString(Object T) {
		return nombre;
		
	}

	public String datosCompletos() {
		return "Nombre "+nombre+" Codigo "+codigo;
	}
}
