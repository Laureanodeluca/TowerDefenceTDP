package State;

import Disparos.Disparo;
import Factory.*;


public abstract class Estado 
{
	protected double contador; //Contador para saber cada cuanto se generan los disparos.
	protected double contadorAux; //Auxiliar para saber el estado del contador inicialmente.
	
	/**
	 * Genera los ataques de la torre.
	 * @param velocidadDeAtaque Velocidad de ataque de la torre.
	 * @param f Fabrica de disparos de la torre.
	 * @return Disparo creado, si el disparo fue creado correctamente. Null en caso contrario.
	 
	public abstract Disparo torre_atacar(double velocidadDeAtaque);
*/
}