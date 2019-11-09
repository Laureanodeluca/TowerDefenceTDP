package Personajes;
import javax.swing.ImageIcon;

import PowerUps.*;

public class MegaMan extends Torre{
	public static final double c = 500;
	public MegaMan(){
		sprite = new ImageIcon("src/main/resources/Mega Man/idle1.gif");
		spriteDisparo =  new ImageIcon("src/main/resources/Mega Man/disparo.png");
		ataque = 150;
		ataqueOriginal=150;
		vida = 100;
		precio = 650;
		rango = 5;
		velocidadDeAtaque = 1.6;
		label.setIcon(sprite);
		contador = c;
		estado = new Normal(this);
	}

}
