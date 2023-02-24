package segundoPOO;

public class Persona {

	String nombre;
	int edad=5;
	double estatura;
	
	public void saludar() {
		System.out.println("Hola. Mi nombre es: " + nombre);
		System.out.println("Encantado de conocerte");
	}
	public  void cumplirAnios() {
		edad++; //Incrementamos en 1
	}
	
	public void crecer(double incremento) {
		estatura+=incremento; //la estatura aumenta segun el incremento
	}
	// metodos constructores  -> obligatorios//
	public Persona(String nombre) { 
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	public Persona() {
	}
	
	
	
	
}