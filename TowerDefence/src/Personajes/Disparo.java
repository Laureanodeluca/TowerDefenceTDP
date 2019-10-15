package Personajes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Objetos.GameObject;

public abstract class Disparo  extends GameObject{
   protected Personaje disparo;
   int ataque;
   int velocidadDeAtaque;
   public Disparo(int x , int y , int ataque , int velocidaddeAtaque) {
	   this.x=x;
	   this.y=y;
	   this.ataque=ataque;
	   this.velocidadDeAtaque=velocidaddeAtaque;
	   this.label = new JLabel();
	   
   }
  public void afectarPersonaje(Enemigo afectarPersonaje) {
	  afectarPersonaje.kill();
  }
}
