package Nivel;
import Mapa.*;

public class NivelDos extends Nivel {
	public NivelDos(Mapa m) {
		super(m);
		cantEnemigos = 20;
		crearEnemigos();
		System.out.println("NIVEL DOS");
	}
	
	public Nivel pasarDeNivel() {return new NivelTres(mapa);}
}
