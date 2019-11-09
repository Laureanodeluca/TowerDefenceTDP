package Factory;

import Personajes.*;
public class FabricaEnemigoStalfos extends FabricaEnemigo {
    public static FabricaEnemigoStalfos instance=null;
    
    public static FabricaEnemigoStalfos getFabricaEnemigoStalfos() {
    	if(instance==null) instance=new FabricaEnemigoStalfos();
   	return instance;
    }
    
   private FabricaEnemigoStalfos() { super(); }
   
   public Enemigo crearEnemigo() { return new Stalfos();}
}
