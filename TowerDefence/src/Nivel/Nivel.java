package Nivel;
import Factory.*;
import Main.*;
import Mapa.*;
import Personajes.*;
import java.util.*;

public abstract class Nivel  {

	protected Mapa mapa;
	protected int dificultad;
	protected ArrayList<Enemigo> enemigos;
	private Random random;
	

	protected FabricaEnemigo fEnemigos; 
	
	public Nivel(Mapa m, int d) {
		mapa=m;
		dificultad=d;
		random = new Random();
		//fEnemigos = FabricaEnemigoBadnik.getFabricaEnemigoBadnik();
		enemigos = new ArrayList<Enemigo>();
		crearEnemigos();
	}
	
	public void crearEnemigos(){
		int rdm = random.nextInt(6);
		int size = dificultad; 
		for (int i=0; i<size; i++) {
			FabricaEnemigo fabrica;
			switch(rdm) {
				case 0:
					fabrica = FabricaEnemigoBadnik.getFabricaEnemigoBadnik(); break;
				case 1:
					fabrica = FabricaEnemigoDarkMan.getFabricaEnemigoDarkMan(); break;
				case 2:
					fabrica = FabricaEnemigoFantasma.getFabricaEnemigoFantasma(); break;
				case 3:
					fabrica = FabricaEnemigoGoomba.getFabricaEnemigoGoomba(); break;
				case 4:
					fabrica = FabricaEnemigoLongMoan.getFabricaEnemigoLongMoan(); break;
				default:
					fabrica = FabricaEnemigoStalfos.getFabricaEnemigoStalfos();
			}
			enemigos.add(fabrica.crearEnemigo());
			rdm = random.nextInt(6);
		}
	}
	
	public Enemigo getNextEnemigo(){
		if (enemigos.isEmpty()) return null;
		
		return enemigos.remove(0);
	}
	
	public void aumentarDificultad() {
		dificultad= dificultad*2;
	}
	
	public boolean noHayMasEnemigos() {
		return enemigos.isEmpty();
	}
	
}
