package ExplicacionesJavaBasics;

import java.util.*;

public class BucleWhile2 {

	public static void main(String[] args) {
		//Vamos a hacer un juego con metodo math y random para ver
		// que nuestro juego haya que adivinar un numero del 1-100
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=aleatorio){
			
			intentos++;
			System.out.println("Introduce un número, por favor");
			
			numero = entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Más bajo");
			}
	
			else if(aleatorio>numero) {
				
				System.out.println("Más alto");
			}
		
		} //llave cierre while
			System.out.println("Oleeee. Lo has conseguido en  " + intentos + " intentos");	
			
	}

}
