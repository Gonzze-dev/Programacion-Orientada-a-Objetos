package paquete;


import java.util.ArrayList;
import java.util.Scanner;

public class MapaMundi 
{

	public static void menu(MapaMundial objMapaMundial, Scanner escaner)
	{
		int opcion = 0;
		String nombre = "";
		ArrayList<Provincia> listadoProvincias = new ArrayList<Provincia>();
		ArrayList<Pais> listadoPaises = new ArrayList<Pais>();
		
		System.out.print("1-Obtener los paises de un continente"
						+ "\n2-Obtener las provincias de un pais"
						+ "\n3-Obtener los paises limitrofes de un pais"
						+ "\nElija una opcion: ");
		
		opcion = Integer.parseInt(escaner.nextLine()); 
		
		switch(opcion)
		{
			case 1:
				
				System.out.print("\nIngrese el nombre del continente: ");
				nombre = escaner.nextLine();
				
				listadoPaises = objMapaMundial.getPaises(nombre);
				
				if (listadoPaises != null)
				{
					System.out.print(listadoPaises);
				}
				else
				{
					System.out.println("Error, no se encontro el continente");
				}
				
			break;
			case 2:
				
				System.out.print("\nIngrese el nombre del pais: ");
				nombre = escaner.nextLine();
				
				listadoProvincias = objMapaMundial.getProvincias(nombre);
				
				if (listadoProvincias != null)
				{
					System.out.print(listadoProvincias);
				}
				else
				{
					System.out.println("\nError, no se encontro el pais");
				}
				
			break;
			case 3:
				System.out.print("\nIngrese el nombre del pais limitrofe: ");
				nombre = escaner.nextLine();
				
				listadoPaises = objMapaMundial.getLimitrofes(nombre);
				
				if (listadoPaises != null)
				{
					System.out.print(listadoPaises);
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
		MapaMundial objMapaMundial = new MapaMundial();
		Scanner escaner = new Scanner(System.in);
		String opcion;
		
		do 
		{
			menu(objMapaMundial, escaner);
			
			System.out.print("\n¿Volver a realizar la operacion? (Y/N): ");
			opcion = escaner.nextLine().toLowerCase();

		} while (opcion.equals("y"));
			
	}
	
}
