package paquete;
import java.util.ArrayList;

public class Continente 
{
	private String nombre = "";
	private ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	
	public Continente()
	{
		super();
		this.nombre = "";
	}
	
	public Continente(String nombre)
	{
		super();
		this.nombre = nombre;
	}
	
	public String getNombreContinente()
	{
		return this.nombre;
	}
	
	public Pais getPais(int indice)
	{
		return this.listaPaises.get(indice);
	}
	
	public ArrayList<Pais> getPaises()
	{
		return this.listaPaises;
	}
	
	public void setNombreContinente(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setPaises(String[] arrayNombrePaises)
	{
		for (int  i = 0; i < arrayNombrePaises.length; i++)
		{
			Pais objPais = new Pais(arrayNombrePaises[i]);
			this.listaPaises.add(objPais);
		}
	}
	
	@Override
	public String toString()
	{
		return this.getNombreContinente();
	}
	
}
