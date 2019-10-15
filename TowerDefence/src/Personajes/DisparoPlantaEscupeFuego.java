package Personajes;

import javax.swing.ImageIcon;

import Visitor.Visitor;

public class DisparoPlantaEscupeFuego extends Disparo {

	public DisparoPlantaEscupeFuego(int x, int y, int ataque, int velocidaddeAtaque) {
		super(x, y, ataque, velocidaddeAtaque);
		sprite=new ImageIcon("src/main/resources/PlantaEscupefuego/bola fuego.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int kill() {
		// TODO Auto-generated method stub
		return 0;
	}

}
