package paquete;

import java.util.ArrayList;

public class MapaMundial 
{
	private String[] continentes = {"America", "Europa", "Asia", "Africa", 
							"Oceania", "Antartida"};
	
	private String[] paisesAmericanos = {"Argentina", "Uruguay", "Brasil", "Paraguay",
								"Bolivia"};
	
	private String[] paisesEuropeos = {"España", "Francia", "Italia", "Portugal"};
	
	private String[] provinciasArgentinas = {"Entre Rios", "Buenos Aires", "Santa Fe",
									  "Corrientes", "Cordoba"};
	
	private String[] provinciasUruguayas = {"Salto", "Paysandu", "Canelones",
			  						 "Rocha", "Maldonado"};
	
	private ArrayList<Continente> mapaMundial = new ArrayList<Continente>();
	

	public MapaMundial()
	{
		super();
		
		for (int i = 0; i < continentes.length; i++)
		{
			Continente objContinente =  new Continente(continentes[i]);
			this.mapaMundial.add(objContinente);
		}
		
		this.mapaMundial.get(0).setPaises(paisesAmericanos);		
		this.mapaMundial.get(1).setPaises(paisesEuropeos);
		
		//Argentina
		this.mapaMundial.get(0).getPais(0).setProvincias(provinciasArgentinas);
		this.mapaMundial.get(0).getPais(0).setNombreCapital(provinciasArgentinas[1]);
		
		//Uruguay
		this.mapaMundial.get(0).getPais(1).setProvincias(provinciasUruguayas);
		
	}
	
	public ArrayList<Continente> getMapaMundial() 
	{
		return this.mapaMundial;
	}
	
	public ArrayList<Pais> getPaises(String nombre_Continente)
	{
		Continente objContinente = new Continente();
		ArrayList<Pais> listadoPaises = new ArrayList<Pais>();
		objContinente = buscarContinente(nombre_Continente, this.mapaMundial);
		
		if(objContinente != null)
		{
			listadoPaises = listarPaisesDelContinente(objContinente);
		}
		else
		{
			listadoPaises = null;
		}
		
		objContinente = null;
		
		return listadoPaises;
	}
	
	public ArrayList<Provincia> getProvincias(String nombre_Provincia)
	{
		Pais objPais = new Pais();
		ArrayList<Provincia> listadoProvincias = new ArrayList<Provincia>();
		
		objPais = buscarPais(nombre_Provincia, this.mapaMundial);
		
		if(objPais != null)
		{
			listadoProvincias = listarProvinciasDelPais(objPais);
		}
		else
		{
			listadoProvincias = null;
		}
		
		objPais = null;
		
		return listadoProvincias;
	}
	
	private Continente buscarContinente(String nombre_Continente, ArrayList<Continente> mapa_Mundial)
	{
		
		for (int i = 0; i < mapa_Mundial.size(); i++)
		{
			if	(mapa_Mundial.get(i).getNombreContinente().equals(nombre_Continente))
			{
					return mapa_Mundial.get(i);
			}
			
		}
		
		return null;
	}
	
	private Pais buscarPais(String nombrePais, ArrayList<Continente> mapaMundial)
	{
		
		for (int i = 0; i < mapaMundial.size(); i++)
		{
			
			for (int j = 0; j < mapaMundial.get(i).getPaises().size(); j++) 
			{

				if	(mapaMundial.get(i).getPais(j).getNombrePais().equals(nombrePais))
				{
					
					return mapaMundial.get(i).getPais(j);
					
				}
				
			}
			
		}
		
		return null;
		
	}
	
	private ArrayList<Pais> listarPaisesDelContinente(Continente objContinente)
	{
		ArrayList<Pais> listadoPaises = new ArrayList<Pais>();
		
		for (int i = 0; i < objContinente.getPaises().size(); i++) 
		{
			listadoPaises.add(objContinente.getPais(i));
		}
		
		return listadoPaises;
	}

	private ArrayList<Provincia> listarProvinciasDelPais(Pais objPais)
	{
		ArrayList<Provincia> listadoProvincias = new ArrayList<Provincia>();

		for (int i = 0; i < objPais.getProvincias().size(); i++) 
		{
			
			listadoProvincias.add(objPais.getProvincia(i));
			
		}

		return listadoProvincias;
	}
	
	@Override
	public String toString()
	{
		String listadoContinentes = "";
		
		for (int i = 0; i < mapaMundial.size(); i++) 
		{
			listadoContinentes += mapaMundial.get(i) + " ";
		}
		return listadoContinentes;
	}
}
