package Personajes;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import PowerUps.*;

public class DarkMan extends Enemigo{
	public DarkMan(){
		sprite = new ImageIcon("src/Main/resources/DarkMan/idle1.gif");
		this.ataque = 150;
		this.vida = 100;
		this.monedas = 500;
		this.velocidadDeAtaque = 20;
		this.velocidadDeMovimiento = 1;
		this.rango = 50;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 1;
		estado = new Normal(this);
		random = new Random();
	}


}
