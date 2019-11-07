package Personajes;
import javax.swing.Icon;

import Disparos.Disparo;
import Mapa.Celda;
import Objetos.GameObject;
import State.Estado;
public abstract class Personaje extends GameObject {
	
	protected int ataque;
	protected int vida;
	protected int rango;
	protected double velocidadDeAtaque;
	protected boolean puedeAtacar;
	protected Estado estado;
	protected Celda c;
	protected Icon spriteDisparo;

	
	public Celda getCelda() {
		return c;
	}
	
	public void setCelda(Celda c) {
		this.c=c;
	}
	
	public boolean estaMuerto() {
		return (vida < 1);	
	}
	
	/**
	 * Consulta la fuerza de ataque de la torre.
	 * @return Fuerza de ataque de la torre.
	 */
	public int getAtaque(){
		return ataque;
	}
	
	/**
	 * Consulta la vida de la torre.
	 * @return vida.
	 */
	public int getVida(){
		return vida;
	}
	
	public void restarVida(int ataque) {
		this.vida -= ataque; //CHEQUEAR MUERTE
	}
	
	/**
	 * Consulta el rango de la torre.
	 * @return rango de la torre.
	 */
	public int getRango(){
		return rango;
	}
	
	/**
	 * Consulta la velocidad de ataque de la torre.
	 * @return velocidad de ataque de la torre.
	 */
	public double getVelocidadDeAtaque(){
		return velocidadDeAtaque;
	}
	
	/**
	 * Establece la fuerza de ataque de la torre.
	 * @param a Fuerza de ataque.
	 */
	public void setAtaque(int a){
		ataque = a;
	}
	
	/**
	 * Establece la vida de la torre.
	 * @param v Vida de la torre.
	 */
	public void setVida(int v){
		vida = v;
	}
	
	/**
	 * Establece el rango de ataque de la torre.
	 * @param r Rango de ataque de la torre.
	 */
	public void setRango(int r){
		rango = r;
	}
	
	/**
	 * Establece la velocidad de ataque de la torre.
	 * @param v Velocidad de ataque de la torre.
	 */
	public void setVelocidadDeAtaque(int v){
		velocidadDeAtaque = v;
	}
	public Icon getSpriteDisparo() {
		return spriteDisparo;
	}
	
	/**
	 * Ataca a un personaje p.
	 * @param p Personaje a atacar.
	 */
	public abstract Disparo atacar();

	public void setPuedeAtacar(boolean puede) {
		puedeAtacar=puede;
	}

	/**
	 * Retorna el atributo puedeAtacar
	 *
	 * @return boolean puedeAtacar
	 */
	public boolean puedeAtacar() {
		return puedeAtacar;
	}
	
	/**
	 * Retorna el estado del personaje.
	 * @return Estado del personaje.
	 */
	public Estado getEstado()
	{
		return estado;
	}
	
	/**
	 * Establece el estado e como el nuevo estado del personaje.
	 * @param e estado del personaje. 
	 */
	public void setEstado(Estado e)
	{
		estado = e;
	}
	
	public abstract void accept(Disparo disparo);
	
}
