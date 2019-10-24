package State;

import Disparos.Disparo;
import FabricaDisparos.FabricaDisparo;

public class BoostVelocidad extends Estado
{
	public BoostVelocidad(double cont)
	{
		contador = cont;
		contadorAux = cont;
	}
	
	@Override
	public Disparo torre_atacar(double velocidadDeAtaque, FabricaDisparo f) {
		if (contador > 0)
			contador = contador-2*velocidadDeAtaque;
		else
		{
			contador = contadorAux;
			return f.generarDisparo();
		}
		
		return null;	
	}
	
}
