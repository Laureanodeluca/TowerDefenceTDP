package State;

import Disparos.Disparo;
import Factory.*;

public class BoostVelocidad extends Estado
{
	public BoostVelocidad(double cont)
	{
		contador = cont;
		contadorAux = cont;
	}
/*	
	public Disparo torre_atacar(double velocidadDeAtaque) {
		if (contador > 0)
			contador = contador-2*velocidadDeAtaque;
		else
		{
			contador = contadorAux;
			return f.generarDisparo();
		}
		
		return null;	
	}
*/	
}
