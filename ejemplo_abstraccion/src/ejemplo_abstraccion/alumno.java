package ejemplo_abstraccion;

import javax.swing.JOptionPane;

public class alumno extends persona {
public alumno(String nombre, String apellido, String domicilio, int edad) {
		super(nombre, apellido, domicilio, edad);
		// TODO Auto-generated constructor stub
	}

private String matricula;

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public void mostrarDatos() {
	JOptionPane.showMessageDialog(null, "ALUMNO  \nNombre:"+getNombre()+" "+getApellido()+" "+"\nDomicilio:"+getDomicilio()+"\nEdad:"+getEdad()+"\nMatricula: "+getMatricula());
}
}
