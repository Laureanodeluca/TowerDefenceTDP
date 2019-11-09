package Personajes;
import javax.swing.ImageIcon;

import PowerUps.*;

public class BulletBill extends Torre {
	public static final double c = 840;
	public BulletBill(){
		sprite = new ImageIcon("src/main/resources/Bullet Bill/idle1.gif");
		spriteDisparo = new ImageIcon("src/main/resources/Bullet Bill/disparo.gif");
		ataque = 250;
		ataqueOriginal=250;
		vida = 250;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 1.6;
		label.setIcon(sprite);
		contador = c;
		estado = new Normal(this);
	}
	
}
