package Objetos;
import javax.swing.*;
import Visitor.Visitor;

public abstract class GameObject
{
	protected Icon sprite;
	protected int x, y;
	protected Visitor miVisitor;
	protected JLabel label = new JLabel();


	/**
	 * Retorna el JLabel con el sprite del objeto.
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
	 * Establece la etiqueta del objeto.
	 * @param l Nueva etiqueta.
	 */
	public void setLabel(JLabel l)
	{
		label = l;
	}
	
	/**
	 * Cambia el label y la ubicacion del objeto.
	 * @param i Nuevo icono del label.
	 */
	public void cambiarLabel(Icon i){
		this.label.setIcon(i);
		this.label.setLocation(x+20, y+18);
	}
	
	/**
	 * Retorna el sprite del objeto.
	 * @return Sprite del objeto.
	 */
	public Icon getSprite(){
		return sprite;
	}
	
	/**
	 * Retorna la posición X del objeto en el mapa.
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
	
	/**
	 * Mata al objeto.
	 * @return Monedas soltadas por el objeto.
	 */
	public abstract int kill();
}
