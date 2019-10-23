package FabricaDisparos;

import Disparos.Disparo;
import Disparos.DisparoDonkeyKong;
import Personajes.Personaje;

public class FabricaDisparoDonkeyKong extends FabricaDisparo
{

	public FabricaDisparoDonkeyKong(Personaje disparador)
	{
		super(disparador);
	}

	@Override
	public Disparo generarDisparo() 
	{
		Disparo nuevoDisparo=new DisparoDonkeyKong(disparador.getX(),disparador.getY(),disparador.getAtaque(),disparador.getVelocidadDeAtaque());
        return nuevoDisparo;
	}
}
