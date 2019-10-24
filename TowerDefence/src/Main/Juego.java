package Main;
import Disparos.Disparo;
import Enemigos.*;
import GUI.GUI;
import Objetos.GameObject;
import Personajes.*;

public class Juego 
{
	private Torre [] torre;
	private Disparo [] disparo;
	private Enemigo p;
	private int cantTorres;
	private int cantDisparos;
	
	public Juego(GUI gui)
	{
		cantTorres = 0;
		cantDisparos = 0;
		this.p = new DarkMan(gui.acomodarX(1200,10), gui.acomodarY(250,6));
		gui.add(p.getLabel());
		torre = new Torre[100];
		disparo = new Disparo[10000];
	}
	
	
	/**
	 * Mueve un personaje.
	 */
	public void moverPersonaje()
	{
		p.mover(p.getVelocidadDeMovimiento());
	}
	
	public void moverDisparo(int i, int vel)
	{
		disparo[i].mover(-vel);
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
	
	/**
	 * Consulta el disparo en la posicion i del arreglo.
	 * @param i Posicion en el arreglo que contiene el disparo.
	 * @return Disparo en la posicion i.
	 */
	public Disparo getDisparo(int i)
	{
		return disparo[i];
	}
	
	/**
	 * Ingresa un disparo en la posicion i del arreglo.
	 * @param i Posicion i del nuevo disparo en el arreglo.
	 * @param d Disparo a insertar.
	 */
	public void insertarDisparo(Disparo d, int i)
	{
		disparo[i] = d;
		cantDisparos++;
	}
	
	/**
	 * Retorna la cantidad de disparos activos en el mapa.
	 * @return cantidad de disparos en el mapa.
	 */
	public int getCantDisparos()
	{
		return cantDisparos;
	}
	
}