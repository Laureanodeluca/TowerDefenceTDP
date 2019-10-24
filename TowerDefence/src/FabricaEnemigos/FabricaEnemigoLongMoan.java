package FabricaEnemigos;

import Enemigos.Enemigo;
import Enemigos.LongMoan;
public class FabricaEnemigoLongMoan {
    public static FabricaEnemigoLongMoan instance=null;
    
    public static FabricaEnemigoLongMoan getFabricaEnemigoLongMoan() {
    	if(instance==null) {
    		instance=new FabricaEnemigoLongMoan();
    	}
   	return instance;
    }
    
   private FabricaEnemigoLongMoan() {
	   super();
   }
   
   public Enemigo crearEnemigo(int x , int y) {
	   return new LongMoan( x, y);
   }
}
