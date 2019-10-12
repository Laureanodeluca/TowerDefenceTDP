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
	 * Retorna la posición X del personaje en el mapa.
	 * @return entero que denota la posición X en el mapa.
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * Retorna la posición Y en el mapa.
	 * @return entero que denota la pocisión Y en el mapa.
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * Le asigna un sprite s al objeto.
	 * @param s Dirección del sprite.
	 */
	public void setSprite(String s){
		sprite = new ImageIcon(s);
	}
	
	/**
	 * Le asigna una posición X al objeto.
	 * @param i Posición en el eje X.
	 */
	public void setX(int i){
		x = i;
	}
	
	/**
	 * Le asigna una posición Y al objeto.
	 * @param j posición en el eje Y.
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
