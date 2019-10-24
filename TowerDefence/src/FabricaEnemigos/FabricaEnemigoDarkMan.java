package FabricaEnemigos;

import Enemigos.Enemigo;
import Enemigos.DarkMan;
public class FabricaEnemigoDarkMan {
    public static FabricaEnemigoDarkMan instance=null;
    
    public static FabricaEnemigoDarkMan getFabricaEnemigoDarkMan() {
    	if(instance==null) {
    		instance=new FabricaEnemigoDarkMan();
    	}
   	return instance;
    }
    
   private FabricaEnemigoDarkMan() {
	   super();
   }
   
   public Enemigo crearEnemigo(int x , int y) {
	   return new DarkMan( x, y);
   }
}
