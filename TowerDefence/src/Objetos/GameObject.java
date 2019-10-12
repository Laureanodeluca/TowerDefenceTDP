package Objetos;
import javax.swing.*;
import Visitor.Visitor;

public abstract class GameObject
{
	protected Icon sprite;
	protected int x, y;
	protected Visitor miVisitor;

	
	/**
	 * Retorna el sprite del personaje.
	 * @return Sprite del personaje.
	 */
	public Icon getSprite(){
		return sprite;
	}
	
	/**
	 * Retorna la posici�n X del personaje en el mapa.
	 * @return entero que denota la posici�n X en el mapa.
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * Retorna la posici�n Y en el mapa.
	 * @return entero que denota la pocisi�n Y en el mapa.
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * Le asigna un sprite s al objeto.
	 * @param s Direcci�n del sprite.
	 */
	public void setSprite(String s){
		sprite = new ImageIcon(s);
	}
	
	/**
	 * Le asigna una posici�n X al objeto.
	 * @param i Posici�n en el eje X.
	 */
	public void setX(int i){
		x = i;
	}
	
	/**
	 * Le asigna una posici�n Y al objeto.
	 * @param j posici�n en el eje Y.
	 */
	public void setY(int j){
		y = j;
	}
	
	/**
	 * Acepta a un visitor v
	 * @param v Visitor.
	 */
	public abstract void accept(Visitor v);
	//GameObjectGrafico miGrafico; 
	// sprites de cada object en particas. mover()
}
