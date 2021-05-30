package paquete;
import java.util.ArrayList;
import java.util.Collections;

public class Mazo 
{
	String[] nombrePalos = {"ORO", "ESPADA", "COPA", "BASTO"};
	ArrayList<Naipe> mazo = new ArrayList<Naipe>();
	
	public Mazo()
	{
		for (String palo : nombrePalos) 
		{
			for (byte i = 1; i <= 12; i++) 
			{	
				Naipe naipe = new Naipe(Enum.valueOf(FamiliaNaipe.class, palo), i);
				mazo.add(naipe);
			}
		}
	}
	
	public void barajar()
	{
		Collections.shuffle(mazo);
	}
	
	public ArrayList<Naipe> getMazo()
	{
		return this.mazo;
	}
	
	public Naipe getNaipe()
	{
		if (mazo.size() > 0)
		{
			return mazo.remove(mazo.size()-1);
		}
		else
		{
			return null;
		}
		
	}
	
	public void setNaipes(ArrayList<Naipe> naipes)
	{
		for(Naipe naipe : naipes)
		{
			this.mazo.add(naipe);
		}
		
	}
	
	@Override
	public String toString()
	{
		String strMazo = "";
		
		for (int i = 0; i < mazo.size(); i++) 
		{
			strMazo += mazo.get(i) + " ";
		}
		
		return strMazo;
	}
}
