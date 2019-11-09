package Personajes;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import PowerUps.*;

public class Stalfos extends Enemigo{
	public Stalfos(){
		sprite = new ImageIcon("src/Main/resources/Stalfos/idle1.gif");
		this.ataque = 75;
		this.vida = 100;
		this.monedas = 400;
		this.velocidadDeAtaque = 60;
		this.velocidadDeMovimiento = 7;
		this.rango = 0;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 2;
		estado = new Normal(this);
		random = new Random();
	}
}
