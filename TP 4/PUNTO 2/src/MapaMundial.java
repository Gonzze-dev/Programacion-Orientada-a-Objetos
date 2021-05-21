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
		
		for (int i = 1; i < mapaMundial.get(0).getPaises().size(); i++) 
		{
			this.mapaMundial.get(0).getPais(0).setPaisLimitrofe(this.mapaMundial.get(0).getPais(i));
		}
		
		//Uruguay
		this.mapaMundial.get(0).getPais(1).setPaisLimitrofe(this.mapaMundial.get(0).getPais(0));
		this.mapaMundial.get(0).getPais(1).setPaisLimitrofe(this.mapaMundial.get(0).getPais(2));
		this.mapaMundial.get(0).getPais(1).setProvincias(provinciasUruguayas);
		
	}
	
	public ArrayList<Continente> getMapaMundial() 
	{
		return this.mapaMundial;
	}
	
	public ArrayList<Pais> getPaises(String nombreContinente)
	{
		Continente objContinente = new Continente();
		ArrayList<Pais> listadoPaises = new ArrayList<Pais>();
		objContinente = buscarContinente(nombreContinente, this.mapaMundial);
		
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
	
	public ArrayList<Provincia> getProvincias(String nombreProvincia)
	{
		Pais objPais = new Pais();
		ArrayList<Provincia> listadoProvincias = new ArrayList<Provincia>();
		
		objPais = buscarPais(nombreProvincia, this.mapaMundial);
		
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
	
	public ArrayList<Pais> getLimitrofes (String nombrePais)
	{
		Pais objPais = new Pais();
		ArrayList<Pais> listadoPaisesLimitrofes = new ArrayList<Pais>();
		
		objPais = buscarPais(nombrePais, this.mapaMundial);
		
		if(objPais != null)
		{
			listadoPaisesLimitrofes = objPais.getPaisesLimitrofes();
		}
		else
		{
			listadoPaisesLimitrofes = null;
		}
		
		objPais = null;

		return listadoPaisesLimitrofes;
	}
	
	private Continente buscarContinente(String nombreContinente, ArrayList<Continente> mapaMundial)
	{
		
		for (int i = 0; i < mapaMundial.size(); i++)
		{
			if	(mapaMundial.get(i).getNombreContinente().equals(nombreContinente))
			{
					return mapaMundial.get(i);
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
