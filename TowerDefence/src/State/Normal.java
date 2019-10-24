package State;

import Disparos.Disparo;
import FabricaDisparos.FabricaDisparo;

public class Normal extends Estado
{
	public Normal(double c)
	{
		contador = c;
		contadorAux = c;
	}
	
	@Override
	public Disparo torre_atacar(double velocidadDeAtaque, FabricaDisparo f) {
		if (contador > 0)
			contador = contador-velocidadDeAtaque;
		else
		{
			contador = contadorAux;
			return f.generarDisparo();
		}
		
		return null;
	}

}
