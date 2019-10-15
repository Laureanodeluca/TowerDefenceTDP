package Personajes;

import javax.swing.ImageIcon;

public abstract class Disparo  extends Personaje{
   protected Personaje disparo;
   
   public Disparo(int x , int y , int ataque , int velocidaddeAtaque) {
	   this.x=x;
	   this.y=y;
	   this.ataque=ataque;
	   this.velocidadDeAtaque=velocidaddeAtaque;
	   sprite=new ImageIcon();
	   
   }
  public void afectarPersonaje(Enemigo afectarPersonaje) {
	  afectarPersonaje.kill();
  }
}
