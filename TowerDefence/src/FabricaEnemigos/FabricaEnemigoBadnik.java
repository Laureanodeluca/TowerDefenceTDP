package FabricaEnemigos;

import Enemigos.Enemigo;
import Enemigos.Badnik;
public class FabricaEnemigoBadnik {
    public static FabricaEnemigoBadnik instance=null;
    
    public static FabricaEnemigoBadnik getFabricaEnemigoBadnik() {
    	if(instance==null) {
    		instance=new FabricaEnemigoBadnik();
    	}
   	return instance;
    }
    
   private FabricaEnemigoBadnik() {
	   super();
   }
   
   public Enemigo crearEnemigo(int x , int y) {
	   return new Badnik( x, y);
   }
}
