package paquete;

import java.util.ArrayList;

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
		
		this.mapa_Mundial.get(0).añadir_Paises(paises_Americanos);		
		this.mapa_Mundial.get(1).añadir_Paises(paises_Europeos);
		
		//Argentina
		this.mapa_Mundial.get(0).get_Pais(0).añadir_Provincias(provincias_Argentinas);
		this.mapa_Mundial.get(0).get_Pais(0).set_Capital(mapa_Mundial.get(0).get_Pais(0).get_Provincia(1));
		
		//Uruguay
		this.mapa_Mundial.get(0).get_Pais(1).añadir_Provincias(provincias_Uruguayas);
		this.mapa_Mundial.get(0).get_Pais(1).set_Capital(mapa_Mundial.get(0).get_Pais(1).get_Provincia(0));
		
	}
	
	public MapaMundial(ArrayList<Continente> mapa_Mundial) 
	{
		super();
		this.mapa_Mundial = mapa_Mundial;
	}
	
	public ArrayList<Continente> get_Mapa_Mundial() 
	{
		return this.mapa_Mundial;
	}

	public void set_Mapa_Mundial(ArrayList<Continente> mapa_Mundial)
	{
		this.mapa_Mundial = mapa_Mundial;
	}
	

}
