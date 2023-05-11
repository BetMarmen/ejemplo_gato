package ejemplo_abstraccion;

import javax.swing.JOptionPane;

public class profesor extends persona{
public profesor(String nombre, String apellido, String domicilio, int edad) {
		super(nombre, apellido, domicilio, edad);
		// TODO Auto-generated constructor stub
	}
private String cedula;
public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public void mostrarDatos() {
	JOptionPane.showMessageDialog(null, "PROFESOR  \nNombre:"+getNombre()+" "+getApellido()+" "+"\nDomicilio:"+getDomicilio()+"\nEdad:"+getEdad()+"\nCedula: "+getCedula());
}

}
