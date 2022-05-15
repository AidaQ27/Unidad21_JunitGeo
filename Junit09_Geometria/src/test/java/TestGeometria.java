import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;


import JUnit.Junit09_Geometria.dto.Geometria;
class TestGeometria {

		
		Geometria geometria = new Geometria();
		
		
		@BeforeAll
		public static void beforea() {
			System.out.println("beforeClass");	
		}
		
		/*@BeforeEach
		public static void before() {
			System.out.println("beforeClass");	
		}
		*/
		
		@Test
		public void testAreacuadrado() {
			
			int resultado = geometria.areacuadrado(2);
			int esperado = 4;
			assertEquals(esperado,resultado);
			
			
		}
		
		@Test
		public void testareacirculo() {
			double resultado = geometria.areaCirculo(3);
			double esperado = 28.2744;
			assertEquals(esperado, resultado);
			
		}
		@Test
		public void testareatriangulo() {
			int resultado = geometria.areatriangulo(10,2);
			int esperado = 10;
			assertEquals(esperado,resultado);
		}
		@Test
		public void testarearectangulo() {
			int resultado = geometria.arearectangulo(5,5);
			int esperado = 25;
			assertEquals(esperado, resultado);
			
		}
		
		@Test
		public void testareapentagono() {
			int resultado = geometria.areapentagono(5,5);
			int esperado = 12;
			assertEquals(esperado, resultado);	
			
		}
		
		@Test
		public void testarearombo() {
			
			int resultado = geometria.arearombo(5,5);
			int esperado = 12;
			assertEquals(esperado, resultado);	
			
			
		}
		@Test
		public void testarearomboide() {
			
			int resultado = geometria.arearomboide(5,5);
			int esperado = 25;
			assertEquals(esperado, resultado);
		}
		
		@Test
		public void testareatrapecio() {
			int resultado = geometria.areatrapecio(5,5,5);
			int esperado = 25;
			assertEquals(esperado, resultado);
		
			}
		
		
		
		@Test
		public void testfigura() {
			String resultado = geometria.figura(1);
			String esperado = "cuadrado";
			assertEquals(esperado, resultado);
			
			String resultado_2 = geometria.figura(2);
			String esperado_2 = "Circulo";
			assertEquals(esperado, resultado);
			
			String resultado_3 = geometria.figura(3);
			String esperado_3 = "Triangulo";
			assertEquals(esperado, resultado);
			
			String resultado_4 = geometria.figura(4);
			String esperado_4 = "Rectangulo";
			assertEquals(esperado, resultado);
			
			String resultado_5 = geometria.figura(5);
			String esperado_5 = "Pentagono";
			assertEquals(esperado, resultado);
			
			String resultado_6 = geometria.figura(6);
			String esperado_6 = "Rombo";
			assertEquals(esperado, resultado);
			
			String resultado_7 = geometria.figura(7);
			String esperado_7 = "Rombiode";
			assertEquals(esperado, resultado);
			
			String resultado_8 = geometria.figura(8);
			String esperado_8 = "Trapecio";
			assertEquals(esperado, resultado);
			
		}
		
		
		

		
		
	
}
