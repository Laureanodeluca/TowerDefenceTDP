package Mapa;

import Personajes.*;
import Disparos.*;
import java.util.*;
import Main.*;
import Nivel.Nivel;

import java.util.Random;

public class Mapa {
  protected  Celda [][] mapa;
  protected Juego juego;
  protected List<Torre> ListaTorres;
  protected List<Enemigo> ListaEnemigos;
  protected List<Disparo> ListaDisparos;
  protected Random rdm;

 
  public Mapa(Juego j) {
	  juego=j;
	  ListaTorres = new LinkedList<Torre>();
	  ListaEnemigos = new LinkedList<Enemigo>();
	  ListaDisparos = new LinkedList<Disparo>();
	  generarMapa();
	  rdm = new Random();
	  
  }
  
  public void generarMapa() {
	//genero la matriz
	  mapa = new Celda[6][10] ;
	//creo los objetos de cada posicion
	  for(int i=0;i<mapa.length;i++) {
		  for(int j=0;j<mapa[0].length;j++) {
			mapa[i][j]= new Celda(i,j);
		}
	  }
  }
  
  public List<Torre> getTorres() {
	  return ListaTorres;
  }
  
  public List<Enemigo> getEnemigos(){
	  return ListaEnemigos;
  }
  
  public List<Disparo> getDisparo(){
	  return ListaDisparos;
  }
  
  public void agregarEnemigo(Enemigo e) {
	  //inserta un eneemigo de manera random en el mapa
	  int random = rdm.nextInt(6);
	  
	  mapa[random][9].addPersonaje(e);
	  ListaEnemigos.add(e);
	  e.setCelda(mapa[random][9]);
	  juego.getGUI().agregarAlTablero(e.getLabel(), e.getCelda());
  }
  
  public void agregarPersonaje(Torre t, int fila, int columna) {
	  Celda celda = mapa[fila][columna];
	  if (celda.isEmpty()) {
		celda.addPersonaje(t);
	  	ListaTorres.add(t);
	  	t.setCelda(celda);
	  	juego.getGUI().agregarAlTablero(t.getLabel(), t.getCelda());
	  }
  }
  
  public void agregarDisparo(Disparo d) {
	  ListaDisparos.add(d);
  }
  
  public void moverEnemigos() {
	  for (Enemigo e : ListaEnemigos) {
		  Celda c = e.getCelda();
		  if(c.getJ()!=0) { //CUANDO ES CERO ES PORQUE PERDISTE
			  Celda nextCelda = mapa[c.getI()][c.getJ()-1];
			  if(nextCelda.isEmpty()) {
				  c.removePersonaje();
				  if(!e.estaMuerto()) { 
					  nextCelda.addPersonaje(e);
				  	  e.setCelda(nextCelda);
				  	  juego.getGUI().agregarAlTablero(e.getLabel(), e.getCelda());
				  }
				  else {
					  juego.getGUI().sacarDelTablero(e.getLabel());
					  juego.setMonedas(e.getMonedas());
					  juego.getGUI().refrescarTienda();
				  }
			  } 
		  }
		  else juego.getGUI().juegoTerminado();
	  }	  
	  removerMuertos();	  
  }		
 
  
  public void moverDisparos() {
	  List<Disparo> aRemover = new LinkedList<Disparo>();
	  for (Disparo d: ListaDisparos) {
		  Celda disp = d.getCelda();
		  
		  if (disp.getJ()!=9) {
			  Celda nc = mapa[disp.getI()][disp.getJ()+1];	  
			  if (!nc.isEmpty()) {//Hay un enemigo en la celda
				  nc.getPersonaje().accept(d);
			  }
			  else { //No hay enemigo en la celda.
				  disp.removeDisparo();
				  nc.addDisparo(d);
				  d.setCelda(nc);
				  juego.getGUI().agregarAlTablero(d.getLabel(), d.getCelda());
			  } 
		 }
		 else {
			  aRemover.add(d); // muere el coso
		  }
	  }
	  ListaDisparos.removeAll(aRemover);  
  }
  
  
  public void removerMuertos() {
	  LinkedList<Enemigo> muertos = new LinkedList<Enemigo>();
	  for(Enemigo e : ListaEnemigos) {
		  if(e.estaMuerto()) { 
			  muertos.add(e);
			  e.setSprite(null);
		  }
	  }
	  for(Enemigo m : muertos)
		  ListaEnemigos.remove(m);
  }
  
  
  /**
  public void moverDisparos() {
	  List<Disparo> aRemover = new LinkedList<Disparo>();
	  for(Disparo d : ListaDisparos) {
		  Celda c = d.getCelda();
		// si next celda  no se cae de la matriz
		  if(c.getJ()!=9) {
			  Celda nextCelda = mapa[c.getI()][c.getJ()+1];
			  if(nextCelda.isEmpty()) { // no tiene personaje
				  c.removeDisparo();
				  nextCelda.addDisparo(d);
				  d.setCelda(nextCelda);
				  juego.getGUI().agregarAlTablero(d.getLabel(), d.getCelda());

				  Personaje personaje = nextCelda.getPersonaje();
				  
				  if (personaje != null) {
					  personaje.accept(d);
				  }
			  } else { 
				  // entonces celda tiene personaje
			  }
		  } else {
			  aRemover.add(d); // muere el coso
		  }
	  }
	  ListaDisparos.removeAll(aRemover);
  }**/
 
  
}
