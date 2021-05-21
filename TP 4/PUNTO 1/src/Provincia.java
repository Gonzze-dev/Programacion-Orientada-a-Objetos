package paquete;

public class Provincia
{
	String nombre_Provincia = "";
	
	
	public Provincia()
	{
		super();
		this.nombre_Provincia = "";
	}
	
	public Provincia(String nombre_Provincia) {
		super();
		this.nombre_Provincia = nombre_Provincia;
	}
	
	public String get_Nombre_Provincia()
	{
		return this.nombre_Provincia;
	}
	
	public void set_Nombre_Provincia(String nombre_Provincia)
	{
		this.nombre_Provincia = nombre_Provincia;
	}
	
	@Override
	public String toString()
	{
		return this.get_Nombre_Provincia();
	}
}
