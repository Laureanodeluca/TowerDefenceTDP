package Factory;
import Personajes.*;
public class FabricaDonkeyKong extends FactoryPersonaje{
	public Personaje crearPersonaje() {
		return new DonkeyKong();
	}
}
