package iu;

import java.util.Scanner;

public class MiMenu {
	//metodo
	static public void mostrarMenu() {
	int opcion;
	do {
		System.out.println("Menú +Cotas");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Salir");
		System.out.print("Tu opción es->");
		opcion=new Scanner(System.in).nextInt();
		switch (opcion) {
		case 1: System.out.println("Es una alta");
				break;
			
		case 2: System.out.println("Es una baja");
				break;
	
		case 3: System.out.println("Hasta luego Lucas...");
				break;
		
		default: System.out.println("Opcion erronea");
				break;
		}
		
	}while(opcion!=3);
	}

}

