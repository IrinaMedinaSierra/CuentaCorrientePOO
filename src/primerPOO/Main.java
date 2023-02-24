package primerPOO;

import static iu.MiMenu.*;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instranciar la clase..declarar miAnimal como un objeto de la clase Animales
		Animales miAnimal=new Animales();
		//id=1
		miAnimal.nombre="Misifu";
		miAnimal.edad=14;				
		//miAnimal.mostrarNombre();
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, Animales.iD);
		
		//System.out.println(miAnimal);
	
		//id 2
		Animales miMascota=new Animales();
		miMascota.nombre="Guffi";
		//miMascota.mostrarNombre();
		miMascota.edad=35;
		miMascota.mostrarCaracteristicas(miMascota.nombre, miMascota.edad, Animales.iD);
	//	mostrarMenu();
		//llamar al metodo constructor de solo el nombre
		Animales miMascota2= new Animales("Candela");
		Animales miMascota3=new Animales("Candela2",15);
		System.out.println("El Id de "+miMascota3.nombre +" es "+Animales.iD);
		
	}

}
