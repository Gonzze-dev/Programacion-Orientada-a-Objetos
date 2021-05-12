package paquete;

import java.util.ArrayList;

public class Pais
{
	String nombre_Pais = "";
	Provincia obj_Capital = new Provincia();
	ArrayList<Provincia> lista_Provincia = new ArrayList<Provincia>();
	
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
	
	public void set_Nombre_Pais(String nombre_Pais)
	{
		this.nombre_Pais = nombre_Pais;
	}
	
	public Provincia get_Capital()
	{
		return this.obj_Capital;
	}
	
	public void set_Capital(Provincia obj_Capital)
	{
		this.obj_Capital = obj_Capital;
	}
	
	public void añadir_Provincia(Provincia obj_Provincia)
	{
		this.lista_Provincia.add(obj_Provincia);
	}
	
	public void añadir_Provincias(String[] nombre_Provincias)
	{
		for (int i = 0; i < nombre_Provincias.length; i++)
		{
			Provincia Obj_Provincias = new Provincia(nombre_Provincias[i]);
			this.lista_Provincia.add(Obj_Provincias);
		}
		
	}
	
	public Provincia get_Provincia(Integer indice)
	{
		return this.lista_Provincia.get(indice);
	}
	
	public ArrayList<Provincia> get_Provincias()
	{
		return this.lista_Provincia;
	}
	
	@Override
	public String toString()
	{
		return this.get_Nombre_Pais();
	}
}
