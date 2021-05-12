package Ejercicio4;

	

public class Ejercicio4 {
	
	public static void mostrar_Cantidad_De_Elementos_De_Un_Array_De_Enteros(int[] arreglo) 
	{
		System.out.println("Cantidad de elementos del arreglo: " + arreglo.length);
	}
	
	public static void mostrar_El_Numero_Mayor_De_Un_Arreglo_De_Enteros(int[] arreglo) 
	{
		int aux = 0;
		
		for (int i = 0; i < arreglo.length; i++) 
		{
			if (aux > arreglo[i])
			{
				aux = arreglo[i];
			}
		}
		
		System.out.println("El numero mayor es del arreglo: " + aux);
	}
	
	public static void mostrar_El_Promedio_De_Un_Arreglo_De_Enteros(int[] arreglo) 
	{
		int aux = 0;
		
		for (int i = 0; i < arreglo.length; i++) 
		{
				aux += arreglo[i];
		}
		
		System.out.println("El promedio de la suma de todos los elementos del arreglo es: " + (aux/arreglo.length));
	}
	
	public static int[] ordenar_De_Mayor_A_Menor_El_Arreglo_De_Enteros(int[] arreglo) 
	{
		int aux = 0;
		
		for (int i = 0; i < arreglo.length - 1; i++) 
		{
			for (int j = 0; j < arreglo.length - i - 1; j++) 
			{
				if (arreglo[j] < arreglo[j + 1]) 
				{
					aux = arreglo[j+1];
					arreglo[j+1] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}
		
		return arreglo;
	}
	
	public static int[] ordenar_De_Menor_A_Mayor_El_Arreglo_De_Enteros(int[] arreglo) 
	{
		int aux = 0;
		
		for (int i = 0; i < arreglo.length - 1; i++) 
		{
			for (int j = 0; j < arreglo.length - i - 1; j++) 
			{
				if (arreglo[j] > arreglo[j + 1]) 
				{
					aux = arreglo[j+1];
					arreglo[j+1] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}
		
		return arreglo;
	}

	
	public static String mostrar_Elementos_de_Un_Array_de_Enteros(int[] arreglo) 
	{
		String aux = " ";
		
		for (int i = 0; i < arreglo.length; i++) 
		{
				aux += arreglo[i] + ", ";
		}
		
		
		return aux;
	}
	
	public static void main(String[] args) 
	{
		int[] numeros = {4,2,3,8,1};
		
		mostrar_Cantidad_De_Elementos_De_Un_Array_De_Enteros(numeros);
		mostrar_El_Numero_Mayor_De_Un_Arreglo_De_Enteros(numeros);
		mostrar_El_Promedio_De_Un_Arreglo_De_Enteros(numeros);
		
		System.out.println("De Menor a Mayor: " + mostrar_Elementos_de_Un_Array_de_Enteros(ordenar_De_Menor_A_Mayor_El_Arreglo_De_Enteros(numeros)));
		System.out.println("De Mayor a Menor: " + mostrar_Elementos_de_Un_Array_de_Enteros(ordenar_De_Mayor_A_Menor_El_Arreglo_De_Enteros(numeros)));
	}

}
