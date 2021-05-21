package paquete;

import java.util.ArrayList;

public class Pais
{
	private String nombre = "";
	private String capital = "";
	private ArrayList<Provincia> listaProvincias = new ArrayList<Provincia>();
	private ArrayList<Pais> listaPisesLimitrofes = new ArrayList<Pais>();
	
	public Pais()
	{
		super();
		this.nombre = "";
	}
	
	public Pais(String nombre)
	{
		super();
		this.nombre = nombre;
	}
	
	public String getNombrePais()
	{
		return this.nombre;
	}
	
	public String getNombreCapital()
	{
		return this.capital;
	}
	
	public Provincia getProvincia(Integer indice)
	{
		return this.listaProvincias.get(indice);
	}
	
	public Pais getPaisLimitrof(Integer indice)
	{
		return this.listaPisesLimitrofes.get(indice);
	}
	
	public ArrayList<Provincia> getProvincias()
	{
		return this.listaProvincias;
	}
	
	public ArrayList<Pais> getPaisesLimitrofes()
	{
		return this.listaPisesLimitrofes;
	}
	
	public void setNombrePais(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setNombreCapital(String capital)
	{
		this.capital = capital;
	}
	
	public void setProvincias(String[] nombreProvincias)
	{
		for (int i = 0; i < nombreProvincias.length; i++)
		{
			Provincia ObjProvincias = new Provincia(nombreProvincias[i]);
			this.listaProvincias.add(ObjProvincias);
		}
		
	}
	
	public void setPaisLimitrofe(Pais paisLimitrofe)
	{
		this.listaPisesLimitrofes.add(paisLimitrofe);
	}
	
	public void setPaisesLimitrofes(Pais[] paisesLimitrofes)
	{
		for (int i = 0; i < paisesLimitrofes.length; i++) 
		{
			setPaisLimitrofe(paisesLimitrofes[i]);;
		}
	}
	
	@Override
	public String toString()
	{
		return this.getNombrePais();
	}
}
