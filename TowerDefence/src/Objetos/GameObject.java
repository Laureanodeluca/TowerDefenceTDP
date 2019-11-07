package Objetos;
import javax.swing.*;
import Visitor.Visitor;
import Mapa.*;

public abstract class GameObject
{
	protected Icon sprite;
	protected Visitor miVisitor;
	protected JLabel label = new JLabel();
	protected Celda celda;


	/**
	 * Retorna el JLabel con el sprite del objeto.
	 * @return Sprite con el JLabel del enemigo.
	 */
	public JLabel getLabel(){
		if(this.label == null){
			this.label = new JLabel(sprite);
		}	
		return this.label;
	}
	

	/**
	 * Le asigna un sprite s al objeto.
	 * @param s Dirección del sprite.
	 */
	public void setSprite(Icon s){
		sprite = s;
		this.label = new JLabel(sprite);
	}
	
	/**
	 * Mata al objeto.
	 * @return Monedas soltadas por el objeto.
	 */
	public abstract int kill();
}
