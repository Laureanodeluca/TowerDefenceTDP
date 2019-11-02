package Factory;

import Personajes.*;
public class FabricaEnemigoBadnik extends FabricaEnemigo {
    private static FabricaEnemigoBadnik instance=null;
    
    public static FabricaEnemigoBadnik getFabricaEnemigoBadnik() {
    	if(instance==null) {
    		instance=new FabricaEnemigoBadnik();
    	}
   	return instance;
    }
    
   private FabricaEnemigoBadnik() {
	   super();
   }
   
   public Enemigo crearEnemigo() {
	   return new Badnik();
   }
}
