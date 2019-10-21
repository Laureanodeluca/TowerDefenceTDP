package Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Personajes.Disparo;
import Personajes.Enemigo;

public class DarkMan extends Enemigo
{
	public DarkMan(int x, int y)
	{
		this.x = x;
		this.y = y;
		sprite = new ImageIcon("src/Main/resources/DarkMan/idle1.gif");
		this.ataque = 150;
		this.vida = 100;
		this.monedas = 500;
		this.velocidadDeAtaque = 20;
		this.velocidadDeMovimiento = 1;
		this.rango = 50;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 1;
	}

	@Override
	public Disparo atacar() {
		// TODO Auto-generated method stub
		return null;
	}
}
