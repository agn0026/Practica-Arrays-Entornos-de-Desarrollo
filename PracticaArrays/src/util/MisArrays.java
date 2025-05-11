package util;

import java.util.Arrays;

/**
 * Clase que implementa funciones para calcular media, mediana, maximo y minimo de notas
 * 
 * @author Adrián
 */

public abstract class MisArrays {
	
	/**
	 * Calcula la media de notas que se encuentran en un array pasado por parametro y su valores comprenden entre el 0 y 10 con decimales
	 *
	 * @param nuevoArray
	 *
	 * @return la media con decimales de las notas pasadas
	 *
	 * @throws IllegalArgumentException
	 */
	public static float mediaNotas (float nuevoArray []) throws IllegalArgumentException{
		float suma = 0;
		for (int i=0; i<nuevoArray.length; i++) {
			if (nuevoArray[i]<0 || nuevoArray[i]>10) {
				throw new IllegalArgumentException ("Alguno de los numeros del array no esta entre 0 y 10");
			}else {
				suma+= nuevoArray[i];
			}
		}
		float media = suma/nuevoArray.length;
		return media;
	}
	
	/**
	 * Calcula la mediana de notas que se encuentran en un array pasado por parametro y su valores comprenden entre el 0 y 10 con decimales
	 *
	 * @param nuevoArray
	 *
	 * @return la mediana con decimales de las notas pasadas
	 *
	 * @throws IllegalArgumentException
	 */
	public static float medianaNotas (float nuevoArray []) throws IllegalArgumentException{
		for (int i=0; i<nuevoArray.length; i++) {
			if (nuevoArray[i]<0 || nuevoArray[i]>10) {
				throw new IllegalArgumentException ("Alguno de los numeros del array no esta entre 0 y 10");
			}
		}
		
		Arrays.sort(nuevoArray);   //importar clase para funcionamiento
		
		float media;
		if (nuevoArray.length%2 == 0) {
			int posicion1= (nuevoArray.length/2) -1;
			int posicion2 = posicion1 + 1;
			
			float valor1 = nuevoArray[posicion1];
			float valor2 = nuevoArray[posicion2];
			
			media = (valor1+valor2)/2;
		}else {
			media = nuevoArray[(nuevoArray.length/2)];
		}
		return  media;
	}

	
}
