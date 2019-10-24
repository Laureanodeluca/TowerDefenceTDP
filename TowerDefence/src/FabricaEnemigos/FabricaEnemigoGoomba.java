package FabricaEnemigos;

import Enemigos.Enemigo;
import Enemigos.Goomba;
public class FabricaEnemigoGoomba {
    public static FabricaEnemigoGoomba instance=null;
    
    public static FabricaEnemigoGoomba getFabricaEnemigoGoomba() {
    	if(instance==null) {
    		instance=new FabricaEnemigoGoomba();
    	}
   	return instance;
    }
    
   private FabricaEnemigoGoomba() {
	   super();
   }
   
   public Enemigo crearEnemigo(int x , int y) {
	   return new Goomba( x, y);
   }
}
