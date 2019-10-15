package FabricaDisparos;

import Personajes.Disparo;
import Personajes.DisparoPlantaEscupeFuego;
import Personajes.Personaje;

public class FabricaDisparoPlantaEscupeFuego extends FabricaDisparo{

	public FabricaDisparoPlantaEscupeFuego(Personaje disparador) {
		super(disparador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generarDisparo() {
		// TODO Auto-generated method stub

        Disparo nuevoDisparo=new DisparoPlantaEscupeFuego(disparador.getX(),disparador.getY(),disparador.getAtaque(),disparador.getVelocidadDeAtaque());

        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
	}

}
