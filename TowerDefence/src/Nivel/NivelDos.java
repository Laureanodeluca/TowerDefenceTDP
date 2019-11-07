package Nivel;
import Mapa.*;

public class NivelDos extends Nivel {

	public NivelDos(Mapa m) {
		super(m);
		cantEnemigos = 20;
	}
	
	public Nivel pasarDeNivel() {
		return new NivelTres(mapa);
	}
}
