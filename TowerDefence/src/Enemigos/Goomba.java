package Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Personajes.Disparo;
import Personajes.Enemigo;

public class Goomba extends Enemigo
{
	public Goomba(int x, int y)
	{
		this.x = x;
		this.y = y;
		sprite = new ImageIcon("src/Main/resources/Goomba/idle1.gif");
		this.ataque = 50;
		this.vida = 75;
		this.monedas = 250;
		this.velocidadDeAtaque = 50;
		this.velocidadDeMovimiento = 1;
		this.rango = 0;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 1;
	}

	@Override
	public Disparo atacar() {
		// TODO Auto-generated method stub
		return null;
	}

}
