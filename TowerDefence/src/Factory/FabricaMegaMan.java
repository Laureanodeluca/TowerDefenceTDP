package Factory;
import Personajes.*;
public class FabricaMegaMan extends FactoryPersonaje {
  public Personaje crearPersonaje() {
	  return new MegaMan();
  }
}
