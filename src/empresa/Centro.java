package empresa;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Centro implements Serializable{

	/**
	 * 
	 */
	private String nombre;
	private String localidad;
	private String provincia;
	private int codigo;
	private String telefono;
	
	
	public Centro (String nombre,String localidad,String provincia,int codigo,String telefono) {
		this.nombre=nombre;
		this.localidad=localidad;
		this.provincia=provincia;
		this.codigo=codigo;
		this.telefono=telefono;
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
	 * @return el localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad el localidad a establecer
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	/**
	 * @return el provincia
	 */
	public String getProvincia() {
		return provincia;
	}


	/**
	 * @param provincia el provincia a establecer
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
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


	/**
	 * @return el telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int compareTo(Centro centro) {
		return this.getCodigo() - centro.getCodigo();
	}

	
	
}
