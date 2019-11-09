package Personajes;
import javax.swing.ImageIcon;

import PowerUps.*;

public class DonkeyKong extends Torre{
	public static final double c = 800;
	public DonkeyKong(){
		sprite = new ImageIcon("src/main/resources/Donkey Kong/idle1.gif");
		spriteDisparo = new ImageIcon("src/main/resources/Donkey Kong/disparo.gif");
		ataque = 500;
		ataqueOriginal=500;
		vida = 350;
		precio = 600;
		rango = 5;
		velocidadDeAtaque = 1.6;
		label.setIcon(sprite);
		contador = c;
		estado = new Normal(this);
	}

}
