package trabajadores;

@SuppressWarnings("serial")
public class Contable extends Administrativo{
	String Turno=new String();
	
	public Contable(String nombre, String apellido1, String apellido2, String dni, empresa.Centro centro,String turno) {
		super(nombre, apellido1, apellido2, dni, centro);
		
		do {
			if (turno!="M"||turno!="T") {
				turno=turno.toUpperCase();
			}
			
		} while (turno.equals("M")||turno.equals("T"));
	}
	
}
