package Personajes;
import javax.swing.Icon;

import Disparos.Disparo;
import Mapa.Celda;
import Objetos.GameObject;
import PowerUps.*;
public abstract class Personaje extends GameObject {
	
	protected int ataque;
	protected int ataqueOriginal;
	protected int vida;
	protected int rango;
	protected double velocidadDeAtaque;
	protected boolean puedeAtacar;
	protected Celda c;
	protected Icon spriteDisparo;
	protected PowerUp estado;

	public void setEstado(PowerUp p) {estado=p;}
	
	public Celda getCelda() {return c;}
	
	public void setCelda(Celda c) {this.c=c;}
	
	public boolean estaMuerto() {return (vida<1);}
	
	public int getAtaque(){return ataque;}
	
	public int getAtaqueOriginal() {return ataqueOriginal;}
	
	public int getVida(){return vida;}
	
	public void restarVida(int ataque) {vida=vida-ataque;}
	
	public double getVelocidadDeAtaque(){return velocidadDeAtaque;}

	public void setAtaque(int a){ataque = a;}

	public void setVida(Personaje p){estado.recibirDanio(p);}
	
	public void setVelocidadDeAtaque(int v){velocidadDeAtaque = v;}
	
	public Icon getSpriteDisparo() {return spriteDisparo;}

	public abstract Disparo atacar();

	public abstract void accept(Disparo disparo);
	
}
