package Personajes;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import PowerUps.*;

public class Badnik extends Enemigo{
	
	public Badnik(){
		sprite = new ImageIcon("src/Main/resources/Badnik/idle1.gif");
		this.ataque = 45;
		this.vida = 40;
		this.monedas = 300;
		this.velocidadDeAtaque = 100;
		this.velocidadDeMovimiento = 1;
		this.rango = 0;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 1;
		estado = new Normal(this);
		random = new Random();
	}
	

	
}
