package FabricaDisparos;

import Disparos.Disparo;
import Disparos.DisparoBulletBill;
import Personajes.Personaje;

public class FabricaDisparoBulletBill extends FabricaDisparo
{

	public FabricaDisparoBulletBill(Personaje disparador) {
		super(disparador);
	}

	@Override
	public Disparo generarDisparo()
	{
		Disparo nuevoDisparo=new DisparoBulletBill(disparador.getX(),disparador.getY(),disparador.getAtaque(),disparador.getVelocidadDeAtaque());
        return nuevoDisparo;
	}

}
