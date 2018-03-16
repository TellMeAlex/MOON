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
	private String codigo;
	private String telefono;
	
	/**
	 * Constructor por defecto de centro
	 */
	public Centro () {
		
	} 
	
	
	/**
	 * Constructor pasando un vector con los datos
	 * @param String[5] con los datos del centro
	 */
	public Centro(String [] datos) {
		new Centro(datos[0],datos[1],datos[2],datos[3],datos[4]);}
	
	/**
	 * Constructor con todos los datos
	 * 
	 */
	
	public Centro (String nombre,String localidad,String provincia,String codigo,String telefono) {
		this.nombre=nombre;
		this.localidad=localidad;
		this.provincia=provincia;
		this.codigo=codigo;
		this.telefono=telefono;
		}


	/**
	 * Obtener el nombre del centro.
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Establecer la localidad del centro.
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Obtener la localidad del centro.
	 * @return el localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad a establecer
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	/**
	 * Obtener la provincia del centro.
	 * @return el provincia
	 */
	public String getProvincia() {
		return provincia;
	}


	/**
	 * Establecer la provincia del centro.
	 * @param provincia el provincia a establecer
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	/**
	 * Obtener el codigo del centro(String).
	 * @return el codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo el codigo a establecer.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return el telefono.
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
	
	/**
	 * Comparar 2 centros por su codigo
	 * @param Centro a comparar
	 */
	public int compareTo(Centro centro) {
		return (this.getCodigo()).compareTo(centro.getCodigo());
	}
	
	/**
	 * Obten todos los datos del centro
	 * @return
	 */
	public String datosCompletos() {
		return codigo+" "+" Con el nombre "+nombre+" con el telefono"+telefono+" situado en "+localidad+" "+provincia;
		
	}

	
	
	
}
