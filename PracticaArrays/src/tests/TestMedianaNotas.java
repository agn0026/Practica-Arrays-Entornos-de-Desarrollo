package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMedianaNotas {

	static float arrayNotas [];
	
	@BeforeAll
	static void setup() {
		arrayNotas = new float [] {4.5f, 7.2f, 10f, 1.2f, 2f};
	}

	@Test
	void testMedianaNotas() {
		float numObtenida = Math.round(MisArrays.medianaNotas(arrayNotas)*100)/100;
		float numEsperada = Math.round(4.5f*100)/100;
		assertEquals(numEsperada, numObtenida);
	}
	
	@Test
	void testException() {
		float arrayNotas2 [] = new float [] {4.5f, 11f, -2f, 1.2f, 2f};
		Exception exception = assertThrows(IllegalArgumentException.class, () -> MisArrays.medianaNotas(arrayNotas2));
		String mensajeEsperado = "Alguno de los numeros del array no esta entre 0 y 10";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}


}
