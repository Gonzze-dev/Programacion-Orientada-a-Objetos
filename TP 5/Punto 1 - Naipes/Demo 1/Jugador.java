package paquete;

public class Jugador implements Comparable<Jugador>
{
	private String nombre = "Jugador";
	private int score = 0;
	
	public Jugador()
	{
		super();
	}
	
	public Jugador(String nombre)
	{
		super();
		
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}

	
	public int getScore()
	{
		return score;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	

	public void setScore(int score)
	{
		this.score = score;
	}
	
	@Override
	public String toString()
	{
		return nombre + " \nScore: " + score;
	}
	
	@Override
	public int compareTo(Jugador jugador) 
	{
		
		if (score > jugador.score) 
		{
            return -1;
        }
        if (score < jugador.score) 
        {
            return 1;
        }
        
		return 0;
	}
}
