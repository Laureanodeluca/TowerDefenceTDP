package Nivel;
import Factory.*;
import Main.*;
import Mapa.*;
import Personajes.*;
import java.util.*;

public abstract class Nivel  {

	protected Mapa mapa;
	protected int cantEnemigos;
	protected ArrayList<Enemigo> enemigos;
	private Random random;
	

	protected FabricaEnemigo fEnemigos; 
	
	public Nivel(Mapa m) {
		mapa=m;
		random = new Random();
		enemigos = new ArrayList<Enemigo>();
	}
	
	public void crearEnemigos(){
		int rdm = random.nextInt(6); 
		for (int i=0; i<cantEnemigos; i++) {
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
	
	public boolean noHayMasEnemigos() {
		return enemigos.isEmpty();
	}
	
	public abstract Nivel pasarDeNivel();
	
}
