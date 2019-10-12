package Personajes;

import javax.swing.Icon;
import javax.swing.JLabel;

import Visitor.Visitor;

public abstract class Enemigo extends Personaje
{
	protected JLabel label = new JLabel();
	protected int velocidadDeMovimiento;
	protected int monedas;
	protected boolean enMovimiento = true;
	
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
	 * Retorna el JLabel con el sprite del enemigo.
	 * @return Sprite con el JLabel del enemigo.
	 */
	public JLabel getLabel()
	{
		if(this.label == null){
			this.label = new JLabel(sprite);
			this.label.setBounds(x, y, 100, 100);
		}
		
		return this.label;
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
	 * Establece la etiqueta del enemigo.
	 * @param l Nueva etiqueta.
	 */
	public void setLabel(JLabel l)
	{
		label = l;
	}
	
	/**
	 * Mueve j espacios al objeto sobre el eje x.
	 * @param j cantidad de espacios movidos.
	 */
	public void mover(int i)
	{
		this.x = this.x-i/velocidadDeMovimiento;
		cambiarLabel(this.sprite);
	}
	
	/**
	 * Mata al enemigo.
	 * @return Monedas soltadas por el enemigo.
	 */
	public int kill()
	{
		cambiarLabel(null);
		return this.monedas;
	}
	
	/**
	 * Cambia el label y la ubicacion del enemigo.
	 * @param i Nuevo icono del label.
	 */
	protected void cambiarLabel(Icon i){
		this.label.setIcon(i);
		this.label.setLocation(x, y);
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
}
