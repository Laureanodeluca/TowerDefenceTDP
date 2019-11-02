package Factory;
import Personajes.*;
public class FabricaBulletBill extends FactoryPersonaje{

	public Personaje crearPersonaje() {
		return new BulletBill();
	}

}
