package paquete;

public class Provincia
{
	private String nombre = "";
	
	public Provincia()
	{
		super();
		this.nombre = "";
	}
	
	public Provincia(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombreProvincia()
	{
		return this.nombre;
	}
	
	public void setNombreProvincia(String nombre)
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		return this.getNombreProvincia();
	}
}
