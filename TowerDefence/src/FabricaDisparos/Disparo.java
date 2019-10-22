package FabricaDisparos;

import Objetos.GameObject;
import Personajes.Enemigo;
import Personajes.Personaje;

public abstract class Disparo  extends GameObject{
   protected Personaje disparo;
   int ataque;
   int velocidadDeAtaque;
   public Disparo(int x , int y , int ataque , int velocidaddeAtaque) {
	   this.x=x;
	   this.y=y;
	   this.ataque=ataque;
	   this.velocidadDeAtaque=velocidaddeAtaque;	   
   }
  public void afectarPersonaje(Enemigo afectarPersonaje) {
	  afectarPersonaje.kill();
  }
  
  public int getVelocidad()
  {
	  return velocidadDeAtaque;
  }
}
