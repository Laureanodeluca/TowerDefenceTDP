package Main;
import GUI.GUI;
import Objetos.GameObject;
import Personajes.*;

public class Juego 
{
	private GameObject torre;
	private Fantasma p;
	
	public Juego(GUI gui)
	{
		this.p = new Fantasma(gui.acomodarX(1200,10), gui.acomodarY(250,6));
		gui.add(p.getLabel());
		torre = null;
	}
	
	/**
	 * Mueve un personaje.
	 */
	public void moverPersonaje()
	{
		p.mover(p.getVelocidadDeMovimiento());
	}
	
	public void detener()
	{
		p.mover(-150);
	}
	
	/**
	 * Retorna un enemigo.
	 * @return Enemigo.
	 */
	public Enemigo getEnemy()
	{
		return p;
	}
	
	/**
	 * Mata un personaje.
	 * @return personaje.
	 */
	public int killCharacter()
	{
		int money = p.kill();
		p = null;
		return money;
	}
	
	/**
	 * Inserta un personaje p en el espacio i del arreglo.
	 * @param i Espacio del arreglo.
	 * @param p Torre a insertar.
	 */
	public void insertarTorre(GameObject p)
	{
		torre = p;
	}
	
	public GameObject getTorre()
	{
		return torre;
	}
}
