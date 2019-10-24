package Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.Disparo;

public class Badnik extends Enemigo
{

	public Badnik(int x, int y)
	{
		this.x = x;
		this.y = y;
		sprite = new ImageIcon("src/Main/resources/Badnik/idle1.gif");
		this.ataque = 45;
		this.vida = 40;
		this.monedas = 300;
		this.velocidadDeAtaque = 100;
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
