package Factory;

import java.util.Random;

import Personajes.*;
public class FabricaEnemigoBadnik extends FabricaEnemigo {
    private static FabricaEnemigoBadnik instance=null;
    private Random random;
    
    public static FabricaEnemigoBadnik getFabricaEnemigoBadnik() {
    	if(instance==null) instance=new FabricaEnemigoBadnik();
   	return instance;
    }
    
   private FabricaEnemigoBadnik() {
	   super();
	   random = new Random();
   }
   
   public Enemigo crearEnemigo() {
	  Badnik e = new Badnik();  
	  return e;
   }
}
