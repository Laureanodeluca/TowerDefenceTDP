package PowerUps;
import Personajes.*;
public abstract class PowerUp {
	Personaje personaje;

	public abstract void recibirDanio(Personaje p);
	public abstract void modificarAtaque();
	public abstract void pasarDeEstado(Personaje p);
	public abstract void asignarPersonaje(Personaje p);
}
