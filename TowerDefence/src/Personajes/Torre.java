package Personajes;
import Disparos.Disparo;
import Disparos.DisparoTorre;
import Mapa.*;

public abstract class Torre extends Personaje{
	protected int precio;
	protected double contador;
	protected int escudo;
	protected Celda celda;
	
	public int getPrecio(){return precio;}
		
	public void setPrecio(int p){precio = p;}
		
	public Celda getCelda() {return celda;}
	
	public void setCelda(Celda c) {celda=c;}
	
	public Disparo atacar() {
		return new DisparoTorre(this);
	}
	
	public void accept(Disparo disparo) {
		disparo.visitarTorre(this);
	}
}
