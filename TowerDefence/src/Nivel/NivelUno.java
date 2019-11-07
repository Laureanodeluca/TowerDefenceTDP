package Nivel;
import java.util.Random;

import Mapa.*;

public class NivelUno extends Nivel {

	public NivelUno(Mapa m) {
		super(m);
		cantEnemigos=10;
		crearEnemigos();
	}
	
	
	public Nivel pasarDeNivel() {
		return new NivelDos(mapa);
	}
	
}
