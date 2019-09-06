package Mapa;

public class Mapa {
  protected  Celda [][] mapa;
  
  
  public void generarMapa() {
	 // genero la matriz
	  mapa = new Celda[6][10] ;
	//creo los objetos de cada posicion
	  for(int i=0;i<mapa.length;i++) {
		  for(int j=0;j<mapa[0].length;i++) {
			mapa[i][j]= new Celda();
		}
	  }
  
  }


}
