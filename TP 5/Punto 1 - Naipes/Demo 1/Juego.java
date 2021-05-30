package paquete;
import java.util.ArrayList;
import java.util.Scanner;


public class Juego 
{
	private Scanner escaner = new Scanner(System.in);
	private int numeroDeJugadores = 2;
	private static final int puntajeGanador = 2;
	
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Juego()
	{
		super();
		InicializadorJuego(this.numeroDeJugadores);
	}
	
	public Juego(int numeroDeJugadores)
	{
		super();
		InicializadorJuego(numeroDeJugadores);
	}
	
	private void InicializadorJuego(int numeroDeJugadores) 
	{
		this.numeroDeJugadores = numeroDeJugadores;
		
		for (int i = 0; i < numeroDeJugadores; i++) 
		{
			Jugador jugador;
			jugador = new Jugador(ingresarDatosJugador());
			
			jugadores.add(jugador);
		}
	}
	
	private String ingresarDatosJugador()
	{
		String nombreJugador = "";
		System.out.print("Nombre del jugador: ");
		nombreJugador = escaner.next();
		
		return nombreJugador;
	}
	
	public static int getPuntajeGanador()
	{
		return puntajeGanador;
	}
	
	public ArrayList<Jugador> getJugadores()
	{
		return this.jugadores;
	}
	
}
