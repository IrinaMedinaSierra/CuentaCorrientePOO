package primerPOO;


public class Animales {
	//Atributos
	String nombre;
	int iD;
	int edad;
	
	//metodos
	public void  mostrarNombre() {
		System.out.println(nombre);
	}
	public void mostrarCaracteristicas(String nombString, int edad,int iD) {
		System.out.println("Mi Animal se llama "+ nombString + " tiene "+edad+" años y su ID es "+iD );
	}
}
