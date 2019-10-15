package Main;
import GUI.GUI;
import Objetos.GameObject;
import Personajes.*;

public class Juego 
{
	private Torre [] torre;
	private Disparo [] Disparo;
	private Fantasma p;
	private int cantTorres;
	
	public Juego(GUI gui)
	{
		cantTorres = 0;
		this.p = new Fantasma(gui.acomodarX(1200,10), gui.acomodarY(250,6));
		gui.add(p.getLabel());
		torre = new Torre[100];
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
	
	public void killTower(int i)
	{
		torre[i].kill();
		cantTorres--;
		torre[i] = null;
		
		for (int j = i; j < torre.length-1; j++)
		{
			torre[j] = torre[j+1];
			torre[j+1] = null;
		}
	}
	
	/**
	 * Inserta un personaje p en el espacio i del arreglo.
	 * @param i Espacio del arreglo.
	 * @param p Torre a insertar.
	 */
	public void insertarTorre(GameObject p)
	{
		torre[cantTorres] = (Torre) p;
		cantTorres++;
	}
	
	/**
	 * Retorna la torre en el bucket i del arreglo.
	 * @param i Bucket que contiene la torre que se desea retornar
	 * @return Torre en el bucket i del arreglo.
	 */
	public Torre getTorre(int i)
	{
		return torre[i];
	}
	
	/**
	 * Consulta la cantidad de torres en el mapa.
	 * @return cantidad de torres en el mapa.
	 */
	public int getCantTorres()
	{
		return cantTorres;
	}
	
	public Disparo getDisparo(int i)
	{
		return Disparo[i];
	}
}
