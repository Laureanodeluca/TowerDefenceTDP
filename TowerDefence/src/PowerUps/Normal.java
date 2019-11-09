package PowerUps;
import Personajes.*;
public class Normal extends PowerUp{

	public Normal(Personaje p) {personaje=p;}
	
	public void recibirDanio(Personaje p) {
		System.out.println("ME EJECUTE DESDE NORMAL");

		personaje.restarVida(p.getAtaque());
	}

	
	public void modificarAtaque() {
		// TODO Auto-generated method stub
		
	}

	public void pasarDeEstado(Personaje p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asignarPersonaje(Personaje p) {
		personaje=p;
	}

}
