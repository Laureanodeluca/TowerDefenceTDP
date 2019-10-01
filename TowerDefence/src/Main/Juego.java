package Main;
import GUI.GUI;
import Personajes.*;

public class Juego 
{
	private Fantasma p;
	
	public Juego(GUI gui)
	{
		this.p = new Fantasma(gui.acomodarX(1200,10), gui.acomodarY(250,6));
		gui.add(p.getLabel());
	}
	
	/**
	 * Mueve un personaje.
	 */
	public void moverPersonaje()
	{
		p.mover(1);
	}
	
	/**
	 * Retorna un enemigo.
	 * @return Enemigo.
	 */
	public Enemigo getEnemy()
	{
		System.out.println("Retornado P!");
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
}
