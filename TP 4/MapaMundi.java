package paquete;


import java.util.Scanner;

public class MapaMundi 
{

	public static void Menu(MapaMundial obj_Mapa_Mundial, Scanner escaner)
	{
		int opcion = 0;
		String nombre = "", listado_Paises = "", listado_Provincias = "";
		
		System.out.print("Ingrese elija una opcion: ");
		opcion = Integer.parseInt(escaner.nextLine()); 
		
		switch(opcion)
		{
			case 1:
				
				System.out.print("\nIngrese el nombre del continente: ");
				nombre = escaner.nextLine();
				
				listado_Paises = obj_Mapa_Mundial.get_Paises(nombre);
				
				if (listado_Paises != null)
				{
					System.out.print(listado_Paises);
				}
				else
				{
					System.out.println("Error, no se encontro el continente");
				}
				
			break;
			case 2:
				
				System.out.print("\nIngrese el nombre del Pais: ");
				nombre = escaner.nextLine();
				
				listado_Provincias = obj_Mapa_Mundial.get_Provincias(nombre);
				
				if (listado_Provincias != null)
				{
					System.out.print(listado_Provincias);
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
