package paquete;

public class Naipe
{
	private FamiliaNaipe palo = FamiliaNaipe.ORO;
	
	private Integer numero = 0;
	
	public Naipe()
	{
		super();
	}
	
	public Naipe(FamiliaNaipe palo, int numero)
	{
		super();
		this.palo = palo;
		this.numero = numero;
	}
	
	public String getNaipe()
	{
		return palo.name() + " " + numero;
	}
	
	@Override
	public String toString()
	{
		return palo.name() + " " + numero;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Naipe)
		{
			Naipe naipe = (Naipe) obj;
			
			if(this.numero.equals(naipe.numero) && this.palo.equals(palo))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
}
