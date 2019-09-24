package Personajes;

public abstract class Enemigo extends Personaje
{
	protected int velocidadDeMovimiento;
	protected int monedas;
	
	/**
	 * Retorna la cantidad de monedas que suelta cada enemigo.
	 * @return Cantidad de monedas soltadas por el enemigo.
	 */
	public int getMonedas(){
		return monedas;
	}
	
	/**
	 * Retorna la velocidad de movimiento del enemigo.
	 * @return velocidad de movimiento del enemigo.
	 */
	public int getVelocidadDeMovimiento(){
		return velocidadDeMovimiento;
	}
	
	/**
	 * Le asigna la velocidad de movimiento v al enemigo.
	 * @param v Nueva velocidad de movimiento.
	 */
	public void setVelocidadDeMovimiento(int v){
		velocidadDeMovimiento = v;
	}
	
	/**
	 * Le asigna una cantidad de monedas al personaje.
	 * @param m Cantidad de monedas.
	 */
	public void setMonedas(int m){
		monedas = m;
	}
	
}
