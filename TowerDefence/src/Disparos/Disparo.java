package Disparos;

import Mapa.Celda;

import Objetos.GameObject;
import Personajes.*;
import Visitor.*;

public abstract class Disparo extends GameObject implements Visitor{
	
   protected Personaje disparador;
   protected Celda celda;
  
   public Disparo(Personaje p) {
	   disparador=p;
	   celda=p.getCelda();
	   setSprite(p.getSpriteDisparo());
   }
   
   public Celda getCelda() {
	   return celda;
   }
   
   public void setCelda(Celda c) {
	   celda=c;
   }
   
   public void afectarPersonaje(Enemigo afectarPersonaje) {
	  afectarPersonaje.kill();
  }
  
  public double getVelocidad(){
	  return disparador.getVelocidadDeAtaque();
  }

	@Override
	public int kill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


