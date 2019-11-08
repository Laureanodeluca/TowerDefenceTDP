package Personajes;

import Disparos.Disparo;
import Disparos.DisparoEnemigo;
import Mapa.*;

public abstract class Enemigo extends Personaje{
	protected int velocidadDeMovimiento;
	protected int monedas;
	protected boolean enMovimiento = true;
	protected int movimientoOriginal;

	
	public void setCelda(Celda p) {
		celda=p;
	}
	
	public Celda getCelda() {
		return celda;
	}
	/**
	 * Retorna la cantidad de monedas que suelta cada enemigo.
	 * @return Cantidad de monedas soltadas por el enemigo.
	 */
	public int getMonedas(){
		return monedas;
	}
		
	public int kill(){
		vida = vida -10;
		return this.monedas;
	}
	
	public Disparo atacar() {
		return new DisparoEnemigo(this);
	}
	
	public void accept(Disparo disparo) {
		disparo.visitarEnemigo(this);
	}
	
	public boolean estaMuerto() {
		return (vida < 1);		
	}
	
	
	public int getVida() {
		return vida;
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
	
	/**
	 * Si el enemigo esta en movimiento, retorna true. Si no lo esta, retorna false.
	 * @return true si el enemigo esta en movimiento, false si no lo esta.
	 */
	public boolean getMovimiento(){
		return enMovimiento;
	}
	
	/**
	 * Cambia el movimiento del enemigo.
	 * @param b True: el enemigo esta en movimiento. False: no lo esta.
	 */
	public void setMovimiento(boolean b){
		enMovimiento = b;
	}
	
	/**
	 * Velocidad de movimiento del enemigo en su estado por defecto, es decir, sin estar detenido ni bajo ningun otro efecto.
	 * @return
	 */
	public int getMovimientoOriginal(){
		return movimientoOriginal;
	}
	
}
