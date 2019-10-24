package Personajes;

import FabricaDisparos.FabricaDisparo;

public abstract class Torre extends Personaje
{
	protected int precio;
	protected int espacioEnArreglo;
	protected FabricaDisparo factory;
	protected double contador;
	protected int escudo;
	
	
	/**
	 * Consulta el precio de la torre.
	 * @return precio de la torre.
	 */
	public int getPrecio()
	{
		return precio;
	}
	
	
	/**
	 * Establece el precio de la torre.
	 * @param p Precio de la torre.
	 */
	public void setPrecio(int p)
	{
		precio = p;
	}
	
	/**
	 * Le establece un escudo protector a la torre.
	 * @param i vida del escudo.
	 */
	public void setEscudo(int i)
	{
		escudo = i;
	}
}
