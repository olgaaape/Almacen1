package almacen;

import java.util.Arrays;

/*
 * Almacen1: Suponer que trabajamos con una tabla de huecos, 
 * donde la posición libre se indica con el valor 0
 */
public class Almacen1 {
	/**Variable constante, se utiliza para indicar posicion libre en la tabla*/
	static private final int LIBRE = 0;
	/**Array con los valores almacenados*/
	private int tvalores[];
	/**Variable que almacena el numero de valores que hay almacenados*/
	private int valoresAlmacenados = 0;
	
	/** Constructores sin parámetros creo una tabla de 10 elementos*/
	public Almacen1(){
		this(10);  /**Llamo al constructor con parámetros*/
	}

	/**Constructor donde se fija tamaño máximo del Almacén, según lo que indique el usuario*/
	public Almacen1( int tamaño){
		tvalores = new int [tamaño];
		init();
	}
	
	/**Pone todas las posiciones a LIBRES*/
	public void init (){
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
		}
		valoresAlmacenados = 0;
	}
	
	/**Muestra una cadena con los valores que tiene la tabla*/
	public String toString (){
		return Arrays.toString(tvalores);
		
	}
	
	/**Devuelve el números de posiciones libres*/
	public int numPosicionesLibres(){
		int libres=0;
		libres= tvalores.length - valoresAlmacenados;
	return libres;
	}
	
	/** Devuelve el número de posiones ocupadas*/
	public int numPosicionesOcupadas(){
		return valoresAlmacenados;
	}
	
	/** Devuelve verdadero o falso si está almacenado el valor en la tabla*/
	public boolean estaValor ( int num) {
	/**Bucle que recorre toda la tabla en busca del valor introducido por el usuario*/
	for (int i = 0; i < tvalores.length; i++) {
		if (tvalores[i]==num) {
			return true;/**Está almacenado el valor*/
		}
	}
	return false;/**No está almacenado*/

	}
	
	/** Almacena el valor en la tabla, devuelve false sin no puede almacenarlo*/
	public boolean ponValor (int num){
		for (int i = 0; i < tvalores.length; i++) {
			if (tvalores[i]==0) {
		 		tvalores[i]=num;
				/**Aumenta la variable cada vez que se introduzca un valor en el almacen*/
				valoresAlmacenados++;
				return true;/**Hay hueco, el valor se ha almacenado correctamente*/
			}
		}
		return false;/**No hay hueco, el valor no se puede almacenar*/
	}
	
	/**Elimina el elemento de la tabla, si no lo encuentra devuelve false*/
	public boolean sacarValor (int num){	
		int cont=0;/**Almacena el numero de veces que se encuentra el elemento en la tabla*/
		for (int i = 0; i < tvalores.length; i++) {
			if (tvalores[i]==num) {
				tvalores[i]=LIBRE;
				cont++;
			}
		}
		if (cont==0) {
			return false;/**El elemento no está en la tabla*/
		}else {
			return true;/**El elemento está en la tabla*/
		}
	}
    /** Indica si el almacén esta lleno devolviendo true, y si no lo está devuelve false*/
	public boolean estaLleno (){	
		for (int i = 0; i < tvalores.length; i++) {
			if (tvalores[i]==0) {
				return false;/**Aún hay hueco en la tabla*/
			}
		}
		return true;/**La tabla está llena*/
	}
}