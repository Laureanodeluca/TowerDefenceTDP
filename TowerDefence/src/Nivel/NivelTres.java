package Nivel;

import Mapa.Mapa;

public class NivelTres extends Nivel {
	public NivelTres(Mapa m) {
		super(m);
		cantEnemigos=30;
	}
	
	public Nivel pasarDeNivel() {return null;}
}
