package Personajes;

public abstract class Torre extends Personaje
{
	protected int precio;
	
	
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
}
