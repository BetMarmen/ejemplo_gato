package ejemplo_abstraccion;

public class persona {
private String nombre;//Al momento que comenzamos a describir los elementos de la clase persona
private String apellido;//que son las propiedades , ya se esta haciendo la abstraccion de un objeto
private String domicilio;//sacamos todos los elementos para poder irlos utilizando
private int edad;
//nuestro constructor que crea a la persona
public persona(String nombre, String apellido, String domicilio, int edad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.domicilio = domicilio;
	this.edad = edad;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDomicilio() {
	return domicilio;
}
public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
