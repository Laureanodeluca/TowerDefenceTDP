package Personajes;
import javax.swing.*;

import Disparos.Disparo;
import Factory.*;
import Personajes.Torre;
import State.Normal;
import Visitor.Visitor;

public class PlantaEscupeFuego extends Torre{
	private static final float c = 650;	

	public PlantaEscupeFuego(){
		
		sprite = new ImageIcon("src/main/resources/PlantaEscupefuego/idle1.gif");
		spriteDisparo =new ImageIcon("src/main/resources/PlantaEscupefuego/bolafuego.png");

		ataque = 50;
		vida = 100;
		precio = 500;
		rango = 5;
		velocidadDeAtaque = 1.6;
		label.setIcon(sprite);
		contador = c;
		estado  = new Normal(c);
	}

	public void accept(Visitor v){		}

	public int kill() {

		return 0;
	}

}
