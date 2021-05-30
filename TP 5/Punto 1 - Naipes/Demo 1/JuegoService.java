package paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class JuegoService
{
	
	public static FamiliaNaipe elijoPalo()
	{
		Scanner escaner = new Scanner(System.in);

		int paloElegido;
		
		String[] palos = {"ORO", "ESPADA", "COPA", "BASTO"};
		System.out.println("1-ORO\n"
				+ "2-ESPADA\n"
				+ "3-COPA\n"
				+ "4-BASTO\n\n"
				+ "Elija una opcion: ");
		
		paloElegido = Integer.parseInt(escaner.next());
		
		FamiliaNaipe palo = Enum.valueOf(FamiliaNaipe.class, palos[paloElegido-1]);
		
		escaner = null;
		return palo;
	}
	
	public static int elijoNumeroNaipe()
	{
		Scanner escaner = new Scanner(System.in);
		int numeroPalo;
		
		System.out.println("Ingrese un numero del 1 al 12 ");
		numeroPalo = Integer.parseInt(escaner.next());
		
		escaner = null;
		return numeroPalo;
	}

	public static Naipe elegirNaipe()
	{
		FamiliaNaipe palo = elijoPalo();
		int numeroNaipe = elijoNumeroNaipe();
		Naipe naipe = new Naipe(palo, numeroNaipe);
		
		return naipe;
	}
	
	public static void incrementarScore(Jugador jugador)
	{
		jugador.setScore(jugador.getScore() + 1);
	}
	
	//Devuelve el jugador al que le toca
	public static Jugador getJugador(ArrayList<Jugador> jugadores, Integer numeroTurno)
	{
		if (numeroTurno <= jugadores.size())
		{
			return jugadores.get(numeroTurno);
		}
		
		return null;
	}
	
	//Devuelve una lista ordenada segun el score
	public static ArrayList<Jugador> getRanking(ArrayList<Jugador> jugadores)
	{
		Collections.sort(jugadores);
		
		return jugadores;
	}
	
	public static boolean finMath(int cantidadDeCartas)
	{
		
		if(cantidadDeCartas > 20)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean finJuego(ArrayList<Jugador> jugadores)
	{
		boolean fin = false;
		
		for (Jugador jugador : jugadores)
		{
			
			if(jugador.getScore() <= Juego.getPuntajeGanador())
			{
				fin = true;
			}
		}
		
		return fin;
	}
	
	
}
