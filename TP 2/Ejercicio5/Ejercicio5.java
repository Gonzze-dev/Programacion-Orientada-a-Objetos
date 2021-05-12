package Ejercicio5;


import java.util.Scanner;

class Empleado
{
	String nombre;
	Double sueldo;
	
	public Empleado()
	{
		this.nombre = "";
		this.sueldo = 0.0;
	}
	
	public Empleado(String nombre, double sueldo)
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public double getSueldoEmpleado()
	{
		return this.sueldo;
	}
	public String getNombreEmpleado()
	{
		return this.nombre;
	}
}

public class Ejercicio5 {
	
	public static double Promedio_Sueldo(double sueldos, int cantidad_empleados)
	{
		return sueldos / cantidad_empleados;
	}

	public static void main(String[] args) 
	{
		String nombre;
		double sueldo, total_Sueldos = 0.0, aux = 0.0;
		int indice_Del_Empleado_Con_Mas_Salario = 0;
		
		Empleado array_Empleado[]= new Empleado[5];
		
		Scanner leer = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) 
		{
			 System.out.print("Introduzca el nombre del empleado: ");
			 nombre = leer.nextLine();
			 System.out.print("Introduzca el sueldo del empleado: ");
			 sueldo = Double.parseDouble(leer.nextLine());	
			 
			 array_Empleado[i] = new Empleado(nombre, sueldo);
			 total_Sueldos += array_Empleado[i].getSueldoEmpleado();
		}
		
		leer.close();
		
		for (int i = 0; i < 5; i++) 
		{
			 
			if(aux < array_Empleado[i].getSueldoEmpleado())
			{
				aux = array_Empleado[i].getSueldoEmpleado();
				indice_Del_Empleado_Con_Mas_Salario = i;
			}
			
		}
		
		System.out.println("El promedio de los sueldos es: " + Promedio_Sueldo(total_Sueldos, array_Empleado.length));
		System.out.println("El empleado con mas sueldo es: " + array_Empleado[indice_Del_Empleado_Con_Mas_Salario].getNombreEmpleado() + " con un sueldo de: " + array_Empleado[indice_Del_Empleado_Con_Mas_Salario].getSueldoEmpleado());
	}

}
