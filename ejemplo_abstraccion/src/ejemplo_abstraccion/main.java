package ejemplo_abstraccion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alumno obA = new alumno("Ronald ","Orozco","Managua",17);
		obA.setMatricula("2023-1067U");
		obA.mostrarDatos();
		
		profesor obP = new profesor("Marvin","Parrales","Managua",45);
		obP.setCedula("001-345678ue");
		obP.mostrarDatos();
		
	}

}
