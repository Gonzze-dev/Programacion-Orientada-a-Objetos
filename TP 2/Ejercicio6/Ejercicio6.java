package Ejercicio6;

import java.util.Scanner;


class Entero
{
	private int numero;
	
	public Entero(int numero)
	{
		super();
		this.numero = numero;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	
	public long cuadrado(int numero)
	{
		return numero*numero;
	}
	
	public boolean numeroParOImpar(int numero)
	{
		if (numero >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public long factorial(int numero)
	{
		long factorial = 1;
		for (int i = 0; i <= numero; i++) 
		{
			if (i >= 1)
			{
				factorial *= i;
			}
		}
		
		return factorial;
	}
	
	public boolean esPrimo(int numero)
	{
		for (int i = 2; i < numero; i++) 
		{
			if(numero % i == 0)
			{
				return false;
			}
			
		}
		
		return true;
		
	}
		
}
public class Ejercicio6 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int numero;
		char opcion;
		
		do{

			System.out.print("Ingrese un numero: ");
			numero = Integer.parseInt(leer.nextLine());
			
			
			
			Entero obj_Entero = new Entero(numero);
			
			System.out.println("El numero ingresado es: " + obj_Entero.getNumero());
			System.out.println("El cuadrado de " + obj_Entero.getNumero() + " es: " + obj_Entero.cuadrado(obj_Entero.getNumero()));
			
			if(obj_Entero.numeroParOImpar(obj_Entero.getNumero()))
			{
				System.out.println("El numero " + obj_Entero.getNumero() + " es par");
			}
			else
			{
				System.out.println("El numero " + obj_Entero.getNumero() + " es impar");
			}
			
			System.out.println("El factorial del numero es: " + obj_Entero.factorial(obj_Entero.getNumero()));
			
			if(obj_Entero.esPrimo(obj_Entero.getNumero()))
			{
				System.out.println("El numero " + obj_Entero.getNumero() + " es primo");
			}
			else
			{
				System.out.println("El numero " + obj_Entero.getNumero() + " no es primo");
			}
			
			System.out.print("¿Volver a realiar la opreacion? (Y/N): ");
			opcion = leer.nextLine().charAt(0);
			
		}while(opcion == 'Y' || opcion == 'y');
		
		leer.close();
	}

}
