package FabricaDisparos;

import Personajes.Personaje;

public class FabricaDisparoMegaMan extends FabricaDisparo
{
	public FabricaDisparoMegaMan(Personaje disparador)
	{
		super(disparador);
	}

	@Override
	public Disparo generarDisparo() 
	{
		Disparo nuevoDisparo=new DisparoMegaMan(disparador.getX(),disparador.getY(),disparador.getAtaque(),disparador.getVelocidadDeAtaque());
        return nuevoDisparo;
	}
}
