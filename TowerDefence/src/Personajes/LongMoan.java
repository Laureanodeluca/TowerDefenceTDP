package Personajes;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import PowerUps.*;

public class LongMoan extends Enemigo{
	public LongMoan(){
		sprite = new ImageIcon("src/Main/resources/LongMoan/idle1.gif");
		this.ataque = 65;
		this.vida = 65;
		this.monedas = 450;
		this.velocidadDeAtaque = 23;
		this.velocidadDeMovimiento = 2;
		this.rango = 0;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 1;
		estado = new Normal(this);
		random = new Random();
	}
}
