package FabricaEnemigos;

import Enemigos.Enemigo;
import Enemigos.Stalfos;
public class FabricaEnemigoStalfos {
    public static FabricaEnemigoStalfos instance=null;
    
    public static FabricaEnemigoStalfos getFabricaEnemigoStalfos() {
    	if(instance==null) {
    		instance=new FabricaEnemigoStalfos();
    	}
   	return instance;
    }
    
   private FabricaEnemigoStalfos() {
	   super();
   }
   
   public Enemigo crearEnemigo(int x , int y) {
	   return new Stalfos( x, y);
   }
}
