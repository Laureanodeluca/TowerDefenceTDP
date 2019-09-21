package Mapa;
import java.util.*;
import Objetos.GameObject;

public class Celda {
   protected List<GameObject> Contenido;  
   
   public Celda() {
	   Contenido= new LinkedList<GameObject>();
   }
   
   public void addGameObject(GameObject o)
   {
	   Contenido.add(o);
   }
}
