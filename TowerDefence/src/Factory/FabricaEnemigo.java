package Factory;
import Personajes.*;
public abstract class FabricaEnemigo {
    public FabricaEnemigo() {}
    
    public abstract Enemigo crearEnemigo();
}
