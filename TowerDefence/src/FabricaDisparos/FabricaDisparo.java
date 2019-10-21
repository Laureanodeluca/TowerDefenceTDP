package FabricaDisparos;

import Personajes.*;
public abstract class FabricaDisparo {

	protected Personaje disparador;
	
	public FabricaDisparo(Personaje disparador) {
		this.disparador=disparador;
	}



	/**
	 * Hace que el aliado que pasa como parametro genere
	 * un disparo y despues utiliza el comando
	 * agregarEntidad de Mapa para agregar el disparo al mapa
	 * 
	 *
	 */

	public abstract Disparo generarDisparo();





}
