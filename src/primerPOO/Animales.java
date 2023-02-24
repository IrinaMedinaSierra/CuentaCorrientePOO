package primerPOO;

public class Animales {
	//Atributos
	String nombre;
	static int iD=0;
	int edad;
	
	//metodos
	public void  mostrarNombre() {
		System.out.println(nombre);
	}
	public void mostrarCaracteristicas(String nombString, int edad,int iD) {
		System.out.println("Mi Animal se llama "+ nombString + " tiene "+edad+" años y su ID es "+iD );
	}
	public Animales() {
		iD++;
	}
	public Animales(String nombre) {
		iD++;		
		this.nombre = nombre;
		System.out.println("El nombre es " + this.nombre);		
	}
	public Animales(String nombre, int edad) {
		iD++;
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("mi mascota es " + this.nombre + " y tiene " + this.edad + " y su ID es "+ iD);
	}
   
	
}