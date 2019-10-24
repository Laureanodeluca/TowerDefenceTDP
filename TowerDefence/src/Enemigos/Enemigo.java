package Enemigos;

import Personajes.Personaje;
import Visitor.Visitor;

public abstract class Enemigo extends Personaje
{
	protected int velocidadDeMovimiento;
	protected int monedas;
	protected boolean enMovimiento = true;
	protected int movimientoOriginal;
	
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
	
	public void mover(int i)
	{
		if (i != 0)
			this.x = this.x-i;
		cambiarLabel(this.sprite);
	}
	
	public int kill()
	{
		cambiarLabel(null);
		return this.monedas;
	}
	
	/**
	 * Acepta al visitor v.
	 * @param v Visitor. 
	 */
	public void accept(Visitor v)
	{
		v.visitarEnemigo(this);
	}
	
	/**
	 * Si el enemigo esta en movimiento, retorna true. Si no lo esta, retorna false.
	 * @return true si el enemigo esta en movimiento, false si no lo esta.
	 */
	public boolean getMovimiento()
	{
		return enMovimiento;
	}
	
	/**
	 * Cambia el movimiento del enemigo.
	 * @param b True: el enemigo esta en movimiento. False: no lo esta.
	 */
	public void setMovimiento(boolean b)
	{
		enMovimiento = b;
	}
	
	/**
	 * Velocidad de movimiento del enemigo en su estado por defecto, es decir, sin estar detenido ni bajo ningun otro efecto.
	 * @return
	 */
	public int getMovimientoOriginal()
	{
		return movimientoOriginal;
	}
}
