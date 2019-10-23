package FabricaDisparos;

import Disparos.Disparo;
import Disparos.DisparoPlantaEscupeFuego;
import Personajes.Personaje;

public class FabricaDisparoPlantaEscupeFuego extends FabricaDisparo{

	public FabricaDisparoPlantaEscupeFuego(Personaje disparador) {
		super(disparador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Disparo generarDisparo() {
		// TODO Auto-generated method stub

        Disparo nuevoDisparo=new DisparoPlantaEscupeFuego(disparador.getX(),disparador.getY(),disparador.getAtaque(),disparador.getVelocidadDeAtaque());
        return nuevoDisparo;
	}

}
