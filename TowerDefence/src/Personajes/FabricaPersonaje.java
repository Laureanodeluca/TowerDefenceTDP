package Personajes;

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
}