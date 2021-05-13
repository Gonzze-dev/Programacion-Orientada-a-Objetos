package paquete;

import java.util.ArrayList;
import java.util.Iterator;

public class MapaMundial 
{
	String[] continentes = {"America", "Europa", "Asia", "Africa", 
							"Oceania", "Antartida"};
	
	String[] paises_Americanos = {"Argentina", "Uruguay", "Brasil", "Paraguay",
								"Bolivia"};
	
	String[] paises_Europeos = {"España", "Francia", "Italia", "Portugal"};
	
	String[] provincias_Argentinas = {"Entre Rios", "Buenos Aires", "Santa Fe",
									  "Corrientes", "Cordoba"};
	
	String[] provincias_Uruguayas = {"Salto", "Paysandu", "Canelones",
			  						 "Rocha", "Maldonado"};
	
	ArrayList<Continente> mapa_Mundial = new ArrayList<Continente>();
	

	public MapaMundial()
	{
		super();
		
		for (int i = 0; i < continentes.length; i++)
		{
			Continente obj_Continente =  new Continente(continentes[i]);
			this.mapa_Mundial.add(obj_Continente);
		}
		
		this.mapa_Mundial.get(0).set_Paises(paises_Americanos);		
		this.mapa_Mundial.get(1).set_Paises(paises_Europeos);
		
		//Argentina
		this.mapa_Mundial.get(0).get_Pais(0).set_Provincias(provincias_Argentinas);
		
		//Uruguay
		this.mapa_Mundial.get(0).get_Pais(1).set_Provincias(provincias_Uruguayas);
		
	}
	
	public ArrayList<Continente> get_Mapa_Mundial() 
	{
		return this.mapa_Mundial;
	}
	
	public String get_Paises(String nombre_Continente)
	{
		Continente obj_continente = new Continente();
		String listado_Paises;
		obj_continente = buscar_Continente(nombre_Continente, this.mapa_Mundial);
		
		if(obj_continente != null)
		{
			listado_Paises = listar_Paises_Del_Continente(obj_continente);
		}
		else
		{
			listado_Paises = null;
		}
		
		obj_continente = null;
		
		return listado_Paises;
	}
	
	public String get_Provincias(String nombre_Provincia)
	{
		Pais obj_Pais = new Pais();
		String listado_Provincias;
		
		obj_Pais = buscar_Pais(nombre_Provincia, this.mapa_Mundial);
		
		if(obj_Pais != null)
		{
			listado_Provincias = listar_Provincias_Del_Pais(obj_Pais);
		}
		else
		{
			listado_Provincias = null;
		}
		
		obj_Pais = null;
		
		return listado_Provincias;
	}
	
	private Continente buscar_Continente(String nombre_Continente, ArrayList<Continente> mapa_Mundial)
	{
		
		for (int i = 0; i < mapa_Mundial.size(); i++)
		{
			if	(mapa_Mundial.get(i).get_Nombre_Continente().equals(nombre_Continente))
			{
					return mapa_Mundial.get(i);
			}
			
		}
		
		return null;
	}
	
	private Pais buscar_Pais(String nombre_Pais, ArrayList<Continente> mapa_Mundial)
	{
		
		for (int i = 0; i < mapa_Mundial.size(); i++)
		{
			
			for (int j = 0; j < mapa_Mundial.get(i).get_Paises().size(); j++) 
			{

				if	(mapa_Mundial.get(i).get_Pais(j).get_Nombre_Pais().equals(nombre_Pais))
				{
					
					return mapa_Mundial.get(i).get_Pais(j);
					
				}
				
			}
			
		}
		
		return null;
		
	}
	
	private String listar_Paises_Del_Continente(Continente obj_Continente)
	{
		String listado_Paises = "";
		
		for (int i = 0; i < obj_Continente.get_Paises().size(); i++) 
		{
			listado_Paises += obj_Continente.get_Pais(i).get_Nombre_Pais() + "\n";
		}
		
		return listado_Paises;
	}

	private String listar_Provincias_Del_Pais(Pais obj_Pais)
	{
		String listado_Provincias = "";

		for (int i = 0; i < obj_Pais.get_Provincias().size(); i++) 
		{
			
			listado_Provincias += obj_Pais.get_Provincia(i).get_Nombre_Provincia() + "\n";
			
		}

		return listado_Provincias;
	}
	
	@Override
	public String toString()
	{
		String listado_Continentes = "";
		
		for (int i = 0; i < mapa_Mundial.size(); i++) 
		{
			listado_Continentes += mapa_Mundial.get(i) + " ";
		}
		return listado_Continentes;
	}
}
