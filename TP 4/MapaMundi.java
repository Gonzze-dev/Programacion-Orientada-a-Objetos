package paquete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MapaMundi 
{
	public static Continente buscar_Continente(String nombre_Continente, MapaMundial obj_Mapa_Mundial)
	{
		ArrayList<Continente> mapa_Mundial = new ArrayList<Continente>();
		mapa_Mundial = obj_Mapa_Mundial.get_Mapa_Mundial();
		
		for (int i = 0; i < mapa_Mundial.size(); i++)
		{
			if	(mapa_Mundial.get(i).get_Nombre_Continente().equals(nombre_Continente))
			{
					return mapa_Mundial.get(i);
			}
			
		}
		
		return null;
	}
	
	public static String listar_Paises_Del_Continente(Continente obj_Continente)
	{
		String listado_Paises = "";
		
		for (int i = 0; i < obj_Continente.get_Paises().size(); i++) 
		{
			listado_Paises += obj_Continente.get_Pais(i).get_Nombre_Pais() + "\n";
		}
		
		return listado_Paises;
	}
	
	public static Pais buscar_Pais(String nombre_Pais, MapaMundial obj_Mapa_Mundial)
	{
		ArrayList<Continente> mapa_Mundial = new ArrayList<Continente>();
		mapa_Mundial = obj_Mapa_Mundial.get_Mapa_Mundial();
		
		for (int i = 0; i < mapa_Mundial.size(); i++)
		{
			
			for (int j = 0; j < mapa_Mundial.size(); j++) 
			{
				
				if	(mapa_Mundial.get(i).get_Pais(j).get_Nombre_Pais().equals(nombre_Pais))
				{
					return mapa_Mundial.get(i).get_Pais(j);
				}
				
			}
			
		}
		
		return null;
		
	}
	
	public static String listar_Provincias_Del_Pais(Pais obj_Pais)
	{
		String listado_Provincias = "";
		
		for (int i = 0; i < obj_Pais.get_Provincias().size(); i++) 
		{
			
			listado_Provincias += obj_Pais.get_Provincia(i).get_Nombre_Provincia() + "\n";
			
		}
		
		return listado_Provincias;
	}
	
	public static void Menu(MapaMundial obj_Mapa_Mundial, Scanner escaner)
	{
		int opcion = 0;
		String nombre = "";
		
		Continente obj_continente = new Continente();
		Pais obj_Pais = new Pais();
		
		System.out.print("Ingrese elija una opcion: ");
		opcion = Integer.parseInt(escaner.nextLine()); 
		
		switch(opcion)
		{
			case 1:
				
				System.out.print("\nIngrese el nombre del continente: ");
				nombre = escaner.nextLine();
				obj_continente = buscar_Continente(nombre, obj_Mapa_Mundial);
				
				if (obj_continente != null)
				{
					System.out.print(listar_Paises_Del_Continente(obj_continente));
				}
				else
				{
					System.out.println("Error, no se encontro el continente");
				}
				
			break;
			case 2:
				
				System.out.print("\nIngrese el nombre del Pais: ");
				nombre = escaner.nextLine();
				obj_Pais = buscar_Pais(nombre, obj_Mapa_Mundial);
				
				if (obj_Pais != null)
				{
					System.out.print(listar_Provincias_Del_Pais(obj_Pais));
				}
				else
				{
					System.out.println("\nError, no se encontro el pais");
				}
				
			break;
			default:
				System.out.println("\nError, opcion no existente");
			break;
		}
		
	}
	
	public static void main(String[] args) 
	{
		MapaMundial obj_Mapa_Mundial = new MapaMundial();
		Scanner escaner = new Scanner(System.in);
		String opcion;
		
		do 
		{
			Menu(obj_Mapa_Mundial, escaner);
			
			System.out.print("\n¿Volver a realizar la operacion? (Y/N): ");
			opcion = escaner.nextLine().toLowerCase();

		} while (opcion.equals("y"));
			
	}

}
