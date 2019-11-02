package Personajes;

import javax.swing.Icon;

import Disparos.Disparo;
import Disparos.DisparoTorre;
import Factory.*;
import Mapa.*;
public abstract class Torre extends Personaje{
	protected int precio;
	protected double contador;
	protected int escudo;
	protected Celda celda;
	
		
	/**
	 * Consulta el precio de la torre.
	 * @return precio de la torre.
	 */
	public int getPrecio(){
		return precio;
	}
		
	/**
	 * Establece el precio de la torre.
	 * @param p Precio de la torre.
	 */
	public void setPrecio(int p){
		precio = p;
	}
	
	/**
	 * Le establece un escudo protector a la torre.
	 * @param i vida del escudo.
	 */
	public void setEscudo(int i){
		escudo = i;
	}
	
	public Celda getCelda() {
		return celda;
	}
	
	public void setCelda(Celda c) {
		celda=c;
	}
	
	public Disparo atacar() {
		return new DisparoTorre(this);
	}
	
	public void accept(Disparo disparo) {
		disparo.visitarTorre(this);
	}
	
}
