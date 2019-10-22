package Enemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import FabricaDisparos.Disparo;
import Personajes.Enemigo;

public class Stalfos extends Enemigo
{
	public Stalfos(int x, int y)
	{
		this.x = x;
		this.y = y;
		sprite = new ImageIcon("src/Main/resources/Stalfos/idle1.gif");
		this.ataque = 75;
		this.vida = 100;
		this.monedas = 400;
		this.velocidadDeAtaque = 60;
		this.velocidadDeMovimiento = 7;
		this.rango = 0;
		this.label = new JLabel(sprite);
		this.movimientoOriginal = 2;
	}

	@Override
	public Disparo atacar() {
		// TODO Auto-generated method stub
		return null;
	}
}
