package Personajes;

public interface FactoryPersonajes {
	
	//Enemigos
    public Personaje Fantasma(int x , int y);
	public Personaje Goomba(int x, int y);
	public Personaje Stalfos(int x, int y);
	public Personaje DarkMan(int x, int y);
	public Personaje LongMoan(int x, int y);
	public Personaje Badnik(int x, int y);

	//Torres
	public Personaje PlantaEscupeFuego(int x , int y, int e);
	public Personaje BulletBill(int x, int y, int e);
	public Personaje MegaMan(int x, int y, int e);
	public Personaje DonkeyKong(int x, int y, int e);
}
