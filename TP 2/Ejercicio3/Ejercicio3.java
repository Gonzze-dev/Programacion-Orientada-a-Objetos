package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		String palabra;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Introduzca una palabra: ");
		palabra = leer.nextLine();
		
		for (int i = 0; i < palabra.length(); i++) 
		{
			
			 if(palabra.charAt(i) == palabra.charAt(palabra.length() - (i + 1)))
			 {
				 if(i == (palabra.length() - 1))
				 {
					 System.out.println("La palabra " + palabra + " es un palindromo");
				 }
			 }
			 else
			 {
				 System.out.println("La palabra " + palabra + " no es un palindromo");
				 break;
			 }
		}
		
		leer.close();
		
	}

}
