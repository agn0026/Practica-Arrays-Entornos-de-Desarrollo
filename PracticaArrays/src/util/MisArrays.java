package util;

import java.util.ArrayList;
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
	
}
