package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copia = new int[arregloEnteros.length];
        
        for (int i = 0; i < arregloEnteros.length; i++) {
            copia[i] = arregloEnteros[i];
        }
        return copia;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] copia=arregloCadenas.clone();
    	return copia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int l = arregloEnteros.length;
        return l;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int l = arregloCadenas.length;
        return l;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int tama=(arregloEnteros.length+1);
    	int[] nueva=new int[tama];
    	if (tama!=1) {
    		for(int i=0; i<tama-1;i++) {
    			nueva[i]=arregloEnteros[i];
    		}
    	}
    	nueva[tama-1]=entero;
    	arregloEnteros=nueva;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int tama=(arregloCadenas.length+1);
    	String[] nueva=new String[tama];
    	if (tama!=1) {
    		for(int i=0; i<tama-1;i++) {
    			nueva[i]=arregloCadenas[i];
    		}
    	}
    	nueva[tama-1]=cadena;
    	arregloCadenas=nueva;
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int[] nuevo = new int[arregloEnteros.length];
    	int pos=0;
    	int elim=0;
    	for (int i = 0; i < arregloEnteros.length; i++) {
        	if (arregloEnteros[i]!=valor) {
        		nuevo[pos]=arregloEnteros[i];
        		pos++;
        	}
        	else {
        		elim++;
        	}
        }
        if (elim>0){
        	int[] nuevo2 = new int[arregloEnteros.length-elim];
            for (int i = 0; i < nuevo2.length; i++) {
            		nuevo2[i]=nuevo[i];
            }
            arregloEnteros=nuevo2;
        	}
        else {
        	arregloEnteros=nuevo;
        }
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	String[] nuevo = new String[arregloCadenas.length];
    	int pos=0;
    	int elim=0;
    	for (int i = 0; i < arregloCadenas.length; i++) {
    		if (arregloCadenas[i]!=cadena) {
    			nuevo[pos]=arregloCadenas[i];
    			pos++;
    		}
    		else {
    			elim++;
    		}
    	}
    	if (elim>0) {
    		String[] nuevo2 = new String[arregloCadenas.length-elim];
        	for (int i = 0; i < nuevo2.length; i++) {
        			nuevo2[i]=nuevo[i];
        	}
        	arregloCadenas=nuevo2;
    	}
    	else {
    		arregloCadenas=nuevo;
    	}
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	if (posicion<=0) {
    		if (arregloEnteros.length==0) {
    			arregloEnteros=new int[1];
    			arregloEnteros[0]=entero;
    		}
    		else {
    			int[]nueva=new int[arregloEnteros.length+1];
    			nueva[0]=entero;
    			int pos=1;
        		for(int i=0;i<arregloEnteros.length;i++) {
        				nueva[pos]=arregloEnteros[i];
        				pos++;
        			}
        		arregloEnteros=nueva;
        		}
    		
    	}
    	else if(posicion>=arregloEnteros.length) {
    		int[]nueva=new int[arregloEnteros.length+1];
    		for(int i=0;i<arregloEnteros.length;i++) {
    			nueva[i]=arregloEnteros[i];
    		}
    		nueva[arregloEnteros.length]=entero;
    		arregloEnteros=nueva;
    	}
    	else {
    		int[]nueva=new int[arregloEnteros.length+1];
    		int pos=0;
    		for(int i=0;i<arregloEnteros.length+1;i++) {
    			if (i!=posicion) {
    				nueva[i]=arregloEnteros[pos];
    				pos++;
    			}
    			else {
    				nueva[i]=entero;
    			}
    		}
    		arregloEnteros=nueva;
    	}
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if(posicion>=0 && posicion<arregloEnteros.length) {
    		int[]nueva=new int[arregloEnteros.length-1];
    		int pos=0;
    		for(int i=0;i<arregloEnteros.length;i++) {
    			if (i!=posicion) {
    				nueva[pos]=arregloEnteros[i];
    				pos++;
    			}
    		}
    		arregloEnteros=nueva;
    	}

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[]nuevo=new int[valores.length];
    	for (int i=0; i<valores.length;i++) {
    		nuevo[i]=(int)valores[i];
    	}
    	arregloEnteros=nuevo;
    		

    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[]nuevo=new String[objetos.length];
    	for (int i=0; i<objetos.length;i++) {
    		nuevo[i]=String.valueOf(objetos[i]);
    	}
    	arregloCadenas=nuevo;

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for(int i=0; i<arregloEnteros.length;i++) {
    		int n =arregloEnteros[i];
    		if (n<0) {
    			n=n*-1;
    		}
    		arregloEnteros[i]=n;
    		
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int c=0;
    	for (int n:arregloEnteros) {
    		if(n==valor) {
    			c++;
    		}
    	}
        return c;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        {
        	cadena=cadena.toLowerCase();
        	int c=0;
        	for (String n:arregloCadenas) {
        		if(n.equals(cadena)) {
        			c++;
        		}
        	}
            return c;
        }
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int[]copia=getCopiaEnteros();
    	arregloEnteros=new int[0];
    	for(int i=0; i<copia.length;i++) {
    		int n =copia[i];
    		if (n==valor) {
    			agregarEntero(i);
    		}
    	}
    	int[]posiciones=getCopiaEnteros();
    	arregloEnteros=copia;
        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[]rango=new int[2];
    	int mayor=-1000;
    	int menor=1000;
    	if (arregloEnteros.length!=0) {
    		for (int n : arregloEnteros) {
    			if (n> mayor){
    				mayor=n;
    			}
    			if(n<menor) {
    				menor=n;
    			}
    		}
    		rango[0]=menor;
    		rango[1]=mayor;
    	}
    	else {
    		rango=new int[0];
    	}
    	
        return rango;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer,Integer> histograma= new HashMap<Integer,Integer>();
    	
    	for(int n : arregloEnteros) {
    		if (histograma.containsKey(n)) {
    			int v =histograma.get(n);
    			v++;
    			histograma.put(n, v);
    		}
    		else {
    			histograma.put(n,1);
    		}
    	}
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int[] repetidos=new int[arregloEnteros.length];
    	int pos=0;
    	int rep=0;
    	for(int i=0; i<arregloEnteros.length;i++) {
    		for(int p=0;p<arregloEnteros.length;p++) {
    			if(arregloEnteros[i]==arregloEnteros[p] && i!=p) {
    				if (pos==0) {
    					repetidos[pos]=arregloEnteros[i];
    					pos++;
    					rep++;
    				}
    				else {
    					boolean y=false;
    					for (int r=0;r<repetidos.length;r++) {
    						if (arregloEnteros[i]== repetidos[r]) {
    							y=true;
    						}
    					}
    					if (y ==false) {
    						repetidos[pos]=arregloEnteros[i];
    						pos++;
    						rep++;
    					}
    				}
    			}
    		}
    	}
        return rep;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if(arregloEnteros.length != otroArreglo.length) {
    		return false;
    	}
    	
    	for (int i=0;i<arregloEnteros.length;i++){
    		if (otroArreglo[i]!=arregloEnteros[i]){
    			return false;
    		}
    	}
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if(arregloEnteros.length != otroArreglo.length) {
    		return false;
    	}
    	int[] copia=getCopiaEnteros();
    	
    	//Copia otro arreglo
    	int[] copia_otroa=new int[otroArreglo.length];
    	for (int a=0;a<otroArreglo.length;a++) {
    		copia_otroa[a]=otroArreglo[a];
    	}
    	
    	
    	for (int i=0;i<copia.length;i++){
    		int elementoE = arregloEnteros[0];
    		boolean e= false;
    		for (int a=0;a<copia_otroa.length && !e;a++) {
    			if (copia_otroa[a]==elementoE){
    				copia_otroa[a]=1212;
    				e= true;
    			}
    		}
    		eliminarEnteroPorPosicion(0);
    		if (e==false) {
    			arregloEnteros=copia;
				return false;
    		}
    	}
    	arregloEnteros=copia;
        return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	arregloEnteros=new int[cantidad];
    	for(int i=0;i<cantidad;i++) {
    		int n=(int) (Math.random() * (maximo - minimo + 1)) + minimo;
    		arregloEnteros[i]=n;
    	}

    }

}
