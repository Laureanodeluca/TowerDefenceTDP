package Factory;
import Personajes.*;
public class FabricaPlantaEscupeFuego extends FactoryPersonaje {

	public Personaje crearPersonaje() {
		return new PlantaEscupeFuego();
	}
	
	

}
