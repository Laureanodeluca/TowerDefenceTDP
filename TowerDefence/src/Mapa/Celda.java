package Mapa;
import Disparos.Disparo;
import Personajes.*;

public class Celda {
   protected int posI;
   protected int posJ;
   protected Personaje p;
   protected Disparo disparo;
	
   public Celda(int i, int j) {
	   posI=i;
	   posJ=j;
   }
   
   public void addPersonaje(Personaje p) {
	   this.p=p;
   }
   
   public Personaje getPersonaje() {
	   return p;
   }
   
   public void removePersonaje() {
	   p=null;
   }
   public void removeDisparo() {
	   disparo=null;
   }
   
   public void addDisparo(Disparo d) {
	   disparo =d;
   }
   
   public int getI() {
	   return posI;
   }
   
   public int getJ() {
	   return posJ;
   }
   
   public boolean isEmpty() {
	   return p==null; 
   }

}
