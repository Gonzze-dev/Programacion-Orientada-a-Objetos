package paquete;
import java.util.ArrayList;

public class Continente 
{
	String nombre_Continente = "";
	ArrayList<Pais> lista_Paises = new ArrayList<Pais>();
	
	public Continente()
	{
		super();
		this.nombre_Continente = "";
	}
	
	public Continente(String nombre_Continente)
	{
		super();
		this.nombre_Continente = nombre_Continente;
	}
	
	public String get_Nombre_Continente()
	{
		return this.nombre_Continente;
	}
	
	public Pais get_Pais(int indice)
	{
		return this.lista_Paises.get(indice);
	}
	
	public ArrayList<Pais> get_Paises()
	{
		return this.lista_Paises;
	}
	
	public void set_Nombre_Continente(String nombre_Continente)
	{
		this.nombre_Continente = nombre_Continente;
	}
	
	public void set_Paises(String[] array_Nombre_Paises)
	{
		for (int  i = 0; i < array_Nombre_Paises.length; i++)
		{
			Pais obj_Pais = new Pais(array_Nombre_Paises[i]);
			this.lista_Paises.add(obj_Pais);
		}
	}
	
	@Override
	public String toString()
	{
		return this.get_Nombre_Continente();
	}
	
}
