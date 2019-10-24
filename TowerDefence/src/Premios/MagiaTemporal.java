package Premios;

import Objetos.MapObject;

public abstract class MagiaTemporal extends MapObject
{
	protected int tiempoDeVida = 20000;
	
	/**
	 * Establece el tiempo hasta que la magia temporal deje de existir.
	 * @param i Tiempo de vida.
	 */
	public void setTiempoDeVida(int i)
	{
		tiempoDeVida = i;
	}
	
	/**
	 * Reduce el tiempo que falta para que la magia deje de existir.
	 */
	public abstract void reducirTiempoDeVida();
}
