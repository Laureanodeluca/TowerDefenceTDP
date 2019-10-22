package Personajes;

import Enemigos.*;
import Torres.*;

public class FabricaPersonaje implements FactoryPersonajes {



	@Override
	public Personaje Fantasma(int x, int y) {
		// TODO Auto-generated method stub
		return new Fantasma(x, y);
	}

	@Override
	public Personaje PlantaEscupeFuego(int x, int y, int e) {
		// TODO Auto-generated method stub
	return new PlantaEscupeFuego(x,y,e);
	}

	public Personaje Goomba(int x, int y) {
		return new Goomba(x,y);
	}

	@Override
	public Personaje Stalfos(int x, int y) {
		// TODO Auto-generated method stub
		return new Stalfos(x,y);
	}

	public Personaje DarkMan(int x, int y)
	{
		return new DarkMan(x,y);
	}

	@Override
	public Personaje LongMoan(int x, int y) {
		// TODO Auto-generated method stub
		return new LongMoan(x,y);
	}

	@Override
	public Personaje Badnik(int x, int y) {
		// TODO Auto-generated method stub
		return new Badnik(x,y);
	}
	
	public Personaje BulletBill(int x, int y, int e){
		return new BulletBill(x,y,e);
	}
	
	public Personaje MegaMan(int x, int y, int e) {
		return new MegaMan(x,y,e);
	}
	
	
}