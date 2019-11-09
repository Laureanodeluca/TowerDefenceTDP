package Personajes;
import java.util.Random;
import Disparos.Disparo;
import Disparos.DisparoEnemigo;
import Mapa.*;

public abstract class Enemigo extends Personaje{
	protected int velocidadDeMovimiento;
	protected int monedas;
	protected boolean enMovimiento = true;
	protected int movimientoOriginal;
	protected boolean tienePowerUp;
	protected Random random;
	
	
	public boolean tienePowerUp() {
		int rdm = random.nextInt(10);
		if(rdm==3) tienePowerUp=true;
		
		return tienePowerUp;
	}
	
	public Disparo atacar() {
		return new DisparoEnemigo(this);
	}
	
	public void accept(Disparo disparo) {
		disparo.visitarEnemigo(this);
	}
	
	public void setCelda(Celda p) {celda=p;}
	
	public Celda getCelda() {return celda;}

	public int getMonedas(){return monedas;}
	
	public void setMonedas(int m){monedas = m;}
	
	public boolean estaMuerto() {return (vida < 1);}
	
	public int getVida() {return vida;}

	public int getVelocidadDeMovimiento(){return velocidadDeMovimiento;}

	public void setVelocidadDeMovimiento(int v){velocidadDeMovimiento = v;}

	public boolean getMovimiento(){return enMovimiento;}
	
	public void setMovimiento(boolean b){enMovimiento = b;}
	
	public int getMovimientoOriginal(){return movimientoOriginal;}
	
}
