package Disparos;

import Enemigos.Enemigo;
import Objetos.GameObject;
import Personajes.Personaje;

public abstract class Disparo  extends GameObject{
   protected Personaje disparo;
   int ataque;
   double velocidadDeAtaque;
   public Disparo(int x , int y , int ataque , double velocidaddeAtaque) {
	   this.x=x;
	   this.y=y;
	   this.ataque=ataque;
	   this.velocidadDeAtaque=velocidaddeAtaque;	   
   }
  public void afectarPersonaje(Enemigo afectarPersonaje) {
	  afectarPersonaje.kill();
  }
  
  public double getVelocidad()
  {
	  return velocidadDeAtaque;
  }
}
