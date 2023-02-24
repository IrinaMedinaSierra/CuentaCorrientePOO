package segundoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona();
		p.edad=18;
		p.nombre="Camen Alicia";
	  	p.estatura=1.56;
		p.cumplirAnios();
		p.saludar();
		System.out.println("Cuando cumplas años tendras " + p.edad );
		System.out.print("¿Cuanto has crecido?->");
		double incremento=new Scanner(System.in).nextDouble();
		p.crecer(incremento);
		System.out.printf("Tu estatura ahora es -> %.2f",p.estatura );
		Persona a=new Persona("Pepe",15,1.90);
		System.out.println(a.nombre + " " + a.edad + " "+ a.estatura);	
		
	}

}
