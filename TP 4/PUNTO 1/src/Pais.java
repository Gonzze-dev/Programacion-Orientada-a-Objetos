package paquete;

import java.util.ArrayList;

public class Pais
{
	String nombre_Pais = "";
	ArrayList<Provincia> lista_Provincias = new ArrayList<Provincia>();
	
	public Pais()
	{
		super();
		this.nombre_Pais = "";
	}
	
	public Pais(String nombre_Pais)
	{
		super();
		this.nombre_Pais = nombre_Pais;
	}
	
	public String get_Nombre_Pais()
	{
		return this.nombre_Pais;
	}
	
	public Provincia get_Provincia(Integer indice)
	{
		return this.lista_Provincias.get(indice);
	}
	
	public ArrayList<Provincia> get_Provincias()
	{
		return this.lista_Provincias;
	}
	
	public void set_Nombre_Pais(String nombre_Pais)
	{
		this.nombre_Pais = nombre_Pais;
	}
	
	public void set_Provincias(String[] nombre_Provincias)
	{
		for (int i = 0; i < nombre_Provincias.length; i++)
		{
			Provincia Obj_Provincias = new Provincia(nombre_Provincias[i]);
			this.lista_Provincias.add(Obj_Provincias);
		}
		
	}
	
	@Override
	public String toString()
	{
		return this.get_Nombre_Pais();
	}
}
