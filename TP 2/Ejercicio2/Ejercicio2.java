package Ejercicio2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) 
	{
		int num1, num2, num3;
		char opcion;
		
		Scanner leer = new Scanner(System.in);
		
		do {
			
			System.out.print("Introduzca un numero: ");
			num1 = Integer.parseInt(leer.nextLine());
			System.out.print("Introduzca un numero: ");
			num2 = Integer.parseInt(leer.nextLine());
			System.out.print("Introduzca un numero: ");
			num3 = Integer.parseInt(leer.nextLine());
			
			if (num1 >= 0)
			{
				System.out.print("El prdocuto de " + num2 + " * " + num3 + " es: " + (num2 * num3));
			}
			else
			{
				System.out.print("La suma de " + num2 + " + " + num3 + " es: " + (num2 + num3));
			}
			
			System.out.print("\n¿Volver a hacerlo? (Y/N): ");
			opcion = leer.nextLine().charAt(0);
			
		}while(opcion == 'Y' || opcion == 'y');
		
		leer.close();
	}

}
