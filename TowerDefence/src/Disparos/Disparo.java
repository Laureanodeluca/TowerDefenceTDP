package Disparos;

import Mapa.Celda;

import Objetos.GameObject;
import Personajes.*;
import Visitor.*;

public abstract class Disparo extends GameObject implements Visitor{
	
   protected Personaje disparador;
   protected Celda celda;
   protected boolean estaVivo;
  
   public Disparo(Personaje p) {
	   estaVivo=true;
	   disparador=p;
	   celda=p.getCelda();
	   setSprite(p.getSpriteDisparo());
   }
   public boolean getVida() {return estaVivo;}
   public void setVida(boolean d) {estaVivo=d;}
  
   public Celda getCelda() {
	   return celda;
   }
   
   public void setCelda(Celda c) {
	   celda=c;
   }
   
  public double getVelocidad(){
	  return disparador.getVelocidadDeAtaque();
  }
	
}


