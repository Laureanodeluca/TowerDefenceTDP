package Factory;

import Personajes.*;
public class FabricaEnemigoLongMoan extends FabricaEnemigo {
    public static FabricaEnemigoLongMoan instance=null;
    
    public static FabricaEnemigoLongMoan getFabricaEnemigoLongMoan() {
    	if(instance==null) instance=new FabricaEnemigoLongMoan();
   	return instance;
    }
    
   private FabricaEnemigoLongMoan() {super();}
   
   public Enemigo crearEnemigo() {return new LongMoan();}
}
