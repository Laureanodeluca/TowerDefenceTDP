package PowerUps;
import Personajes.*;
public class Escudo extends PowerUp{
	int contador;
	
	public Escudo(Personaje p) {
		contador=0;
		personaje=p;
	}
	public void recibirDanio(Personaje p) {
		System.out.println("ME EJECUTE DESDE ESCUDO");

		if(contador<5)
			contador++;
		else {
			contador=0;
			pasarDeEstado(personaje);
		}
	}

	public void modificarAtaque() {
		
	}

	public void pasarDeEstado(Personaje p) {
		personaje.setEstado(new Normal(p));
	}
	@Override
	public void asignarPersonaje(Personaje p) {
		personaje=p;
	}

}
