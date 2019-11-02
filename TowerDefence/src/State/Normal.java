package State;

import Disparos.Disparo;
import Factory.*;
public class Normal extends Estado
{
	public Normal(double c)
	{
		contador = c;
		contadorAux = c;
	}
/*	
	public Disparo torre_atacar(double velocidadDeAtaque, ) {
		if (contador > 0)
			contador = contador-velocidadDeAtaque;
		else
		{
			contador = contadorAux;
			return f.generarDisparo();
		}
		
		return null;
	}
*/
}
