package Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Personajes.Disparo;
import Personajes.Enemigo;

public class LongMoan extends Enemigo
{
	public LongMoan(int x, int y)
	{
		this.x = x;
		this.y = y;
		sprite = new ImageIcon("src/Main/resources/LongMoan/idle1.gif");
		this.ataque = 65;
		this.vida = 65;
		this.monedas = 450;
		this.velocidadDeAtaque = 23;
		this.velocidadDeMovimiento = 2;
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
