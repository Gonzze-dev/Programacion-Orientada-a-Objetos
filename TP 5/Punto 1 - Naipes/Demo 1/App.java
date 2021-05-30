package paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		Mazo mazo = new Mazo();
		ArrayList<Naipe> naipesSacados = new ArrayList<Naipe>();
		ArrayList<Naipe> naipesElegidos = new ArrayList<Naipe>();
		int opcion;
		String opcionCantJugadores;
		Juego juego;
		Scanner escaner = new Scanner(System.in);
		
		int cantidadDeJugadores, iteracion;
		
		System.out.print("1-2 Jugadores\n"
				+ "2-mas de jugadores\n\n"
				+ "Elija una opcion: ");
		
		opcionCantJugadores = escaner.next();
		
		if(opcionCantJugadores == "1")
		{
			juego = new Juego();
		}
		else
		{
			System.out.print("Ingrese la cantidad de jugadores: ");
			cantidadDeJugadores = Integer.parseInt(escaner.next());
			juego = new Juego(cantidadDeJugadores);
		}
			
		
		while(JuegoService.finJuego(juego.getJugadores()))
		{
			
			while(JuegoService.finMath(mazo.getMazo().size()))
			{
				
				iteracion = 0;
				mazo.barajar();
				naipesSacados.add(mazo.getNaipe());
				
				System.out.println(naipesSacados.get(naipesSacados.size()-1));
				
				for(Jugador jugador : juego.getJugadores())
				{
					System.out.println("Turno de: " + jugador.getNombre() + "\n");
					naipesElegidos.add(JuegoService.elegirNaipe());
				}
				
				for(Naipe naipe : naipesElegidos)
				{
					if(naipe.equals(naipesSacados.get(naipesSacados.size()-1)))
					{
						JuegoService.incrementarScore(juego.getJugadores().get(iteracion));
						System.out.println(juego.getJugadores().get(iteracion).getNombre() + " HA SUMADO UN PUNTO!!!");
					}
					
					iteracion++;
					
				}
				
				naipesElegidos.clear();
			}
			
			mazo.setNaipes(naipesSacados); 
			naipesSacados.clear();
		}

		System.out.print("\n*****FIN DEL JUEGO*****\n"
						+ "*******RANKING********\n\n"+JuegoService.getRanking(juego.getJugadores()));
	}

}
