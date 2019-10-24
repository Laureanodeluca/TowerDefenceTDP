package FabricaEnemigos;
import Enemigos.Enemigo;
import Enemigos.Fantasma;
public class FabricaEnemigoFantasma {
    public static FabricaEnemigoFantasma instance=null;
    
    public static FabricaEnemigoFantasma getFabricaEnemigoFantasma() {
    	if(instance==null) {
    		instance=new FabricaEnemigoFantasma();
    	}
   	return instance;
    }
    
   private FabricaEnemigoFantasma() {
	   super();
   }
   
   public Enemigo crearEnemigo(int x , int y) {
	   return new Fantasma( x, y);
   }
}
