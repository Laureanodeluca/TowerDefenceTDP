package Mapa;

import Personajes.*;
import Disparos.*;
import java.util.*;
import Main.*;
import java.util.Random;
import PowerUps.*;
public class Mapa {
  protected  Celda [][] mapa;
  protected Juego juego;
  protected List<Torre> ListaTorres;
  protected List<Enemigo> ListaEnemigos;
  protected List<Disparo> ListaDisparos;
  protected Random rdm;
  protected LinkedList<Enemigo> muertos;

 
  public Mapa(Juego j) {
	  juego=j;
	  ListaTorres = new LinkedList<Torre>();
	  ListaEnemigos = new LinkedList<Enemigo>();
	  ListaDisparos = new LinkedList<Disparo>();
	  muertos = new LinkedList<Enemigo>();
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
  
  public List<Torre> getTorres() {return ListaTorres;}
  
  public List<Enemigo> getEnemigos(){return ListaEnemigos; }
  
  public List<Disparo> getDisparo(){return ListaDisparos;}
  
  public void agregarEnemigo(Enemigo e) {
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
  
  public void agregarDisparo(Disparo d) { ListaDisparos.add(d);}
  
  public synchronized void moverEnemigos() {
	  for (Enemigo e : ListaEnemigos) {
		  Celda c = e.getCelda();
		  if(c.getJ()!=0) { //CUANDO ES CERO ES PORQUE PERDISTE
			  Celda nextCelda = mapa[c.getI()][c.getJ()-1];
			  if(nextCelda.isEmpty()) {
				  c.removePersonaje();
				  if(!e.estaMuerto() && juego.getEstado()) { 
					  nextCelda.addPersonaje(e);
				  	  e.setCelda(nextCelda);
				  	  juego.getGUI().agregarAlTablero(e.getLabel(), e.getCelda());
				  }
			  }
			  else {
				  if(e.estaMuerto()) c.removePersonaje();
			  }
		  }
		  else { juego.terminar(); } 
	  }	  
	 // System.out.println("CANTDAD DE ENEMIGOS"+ListaEnemigos.size());
	  removerMuertos();	  
  }		
   
  public synchronized void moverDisparos() {
	  for (Disparo d: ListaDisparos) {
		  Celda disp = d.getCelda();
		  
		  if (disp.getJ()!=9  && juego.getEstado()) {
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
		 else { d.setVida(false); }
	  }
	  removerDisparos();
  }
  
  public synchronized void removerMuertos() {
	  for(Enemigo e : ListaEnemigos) {
		  if(e.estaMuerto()) { 
			  muertos.add(e);
		  }
	  }
	  for(Enemigo m : muertos) {
		  ListaEnemigos.remove(m);
		  m.getCelda().removePersonaje();
		  juego.getGUI().sacarDelTablero(m.getLabel());
		  juego.setMonedas(m.getMonedas());
		  juego.getGUI().refrescarTienda();  
	  }
	  if(ListaTorres.size()>3)
		  asignarPowerUp();
  }
  
  public void asignarPowerUp() {
		System.out.println("ME EJECUTE DESDE ASIGNAR POWER UP");

	  int rdmTorre = rdm.nextInt(2);; //elijo torre al azar de la lista
	  int rdmPowerUp = rdm.nextInt(1); //elijo powerup al azar
	  PowerUp estado;
	  if(rdmPowerUp==1)
		  estado = new Escudo(null);
	  else
		  estado = new BoostAtaque(null); //seteo el power up al azar
	  
	  for(Enemigo m : muertos) { //por cada muerto que tenga power up
		  if(m.tienePowerUp()) {
			  ListaTorres.get(0).setEstado(estado); //obtengo la torre al azar y le seteo el power up
			  estado.asignarPersonaje(ListaTorres.get(rdmTorre)); //seteo la torre en el power up 
			  rdmTorre=rdm.nextInt(3); //vuelvo a elegir torre al azar 
		  }
	  }
  }
    
  public synchronized void removerDisparos() {
	  LinkedList<Disparo> muertos = new LinkedList<Disparo>();
	  for (Disparo d : ListaDisparos) {
		  if(!d.getVida()) {
			  muertos.add(d);
		  }
	  }
	  for(Disparo d : muertos) {
		  ListaDisparos.remove(d);
		  juego.getGUI().sacarDelTablero(d.getLabel());
	  }
  }

}
