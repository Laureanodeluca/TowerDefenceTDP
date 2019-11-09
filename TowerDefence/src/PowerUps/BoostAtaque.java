package PowerUps;
import Personajes.*;
public class BoostAtaque extends PowerUp {
	int ataque;
	int contador=0;
	public BoostAtaque(Personaje p) {personaje=p;}
	
	public void recibirDanio(Personaje p) {
		personaje.restarVida(p.getAtaque());
	}

	public void modificarAtaque() {
		ataque=personaje.getAtaque();
		if(contador<5) {
			System.out.println("ME EJECUTE DESDE BOOST ATAQUE");
			personaje.setAtaque(personaje.getAtaque()*2);
			contador++;
		}
		else {
			contador=0;
			pasarDeEstado(personaje);
		}
	}
	

	public void pasarDeEstado(Personaje p) {
		personaje.setEstado(new Normal(personaje));
	}

	@Override
	public void asignarPersonaje(Personaje p) {
		personaje=p;
	}

}
