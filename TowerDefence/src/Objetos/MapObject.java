package Objetos;

import Objetos.GameObject;

public abstract class MapObject extends GameObject
{
	protected static final int t = 10000;
	protected int tiempoEnMapa = t;
	
	/**
	 * Reduce la cantidad de tiempo que la magia estara en el mapa.
	 */
	public void reducirTiempoEnMapa()
	{
		tiempoEnMapa--;
	}
}
