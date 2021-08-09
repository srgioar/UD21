package com.mastermind.ejemplo.Testeos;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Arc2D.Double;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	Geometria geo = new Geometria();
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}
	
//	@AfterEach
//	public void after() {
//		System.out.println("after()");
//		geo.clear();
//	}
	
//	@Test
//	public void testInstancia() {
//		String resultado = geo.getId();
//	}
	
	@Test
	public void testgetNom() {
		String resultado = geo.getNom();
		String esperado = geo.getNom();
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testsetNom() {
		geo.setNom("Nombre");
		String resultado = geo.getNom();
		String esperado = "Nombre";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void getArea() {
		double resultado = geo.getArea();
		double esperado = geo.getArea();
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void setArea() {
		geo.setArea(10);
		double resultado = geo.getArea();
		double esperado = 10;
		assertEquals(resultado, esperado);
	}

	@Test
	public void testGetID() {
		int resultado = geo.getId();
		int esperado = geo.getId();
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testSetID() {
		geo.setId(1);
		int resultado = geo.getId();
		int esperado = 1;
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testCuadrado() {
		int resultado = geo.areacuadrado(2);
		int esperado = 4;
		assertEquals(resultado, esperado);
		
	}
	
	@Test
	public void testCirculo() {
		int resultado = (int)geo.areaCirculo(4);
		int esperado = 50;
		int delta = 1;
		assertEquals(resultado, esperado, delta);
	}
	
	@Test
	public void testTriangulo(){
		int resultado = geo.areatriangulo(2, 3);
		int esperado = 3;
		assertEquals(resultado, esperado);
		}
	
	@Test
	public void testRectangulo(){
		int resultado = geo.arearectangulo(2, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
		}
	
	@Test
	public void testPentagono(){
		int resultado = geo.areapentagono(2, 2);
		int esperado = 2;
		assertEquals(resultado, esperado);
		}
	
	@Test
	public void testRombo(){
		int resultado = geo.arearombo(2, 2);
		int esperado = 2;
		assertEquals(resultado, esperado);
		}
	
	@Test
	public void testRomboide(){
		int resultado = geo.arearomboide(2, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
		}
	
	@Test
	public void testTrapecio (){ 
		double resultado = geo.areatrapecio(3, 2, 5);
		int esperado = 12;
		int delta = 1;
		assertEquals(resultado, esperado, delta);
		}
	
	@Test
	public void testFiguraCuadrado() {
		String resultado = geo.figura(1);
		String esperado = "cuadrado";
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testFiguraCirculo() {
		String resultado = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraTriangulo() {
		String resultado = geo.figura(3);
		String esperado = "Triangulo";
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testFiguraRectangulo() {
		String resultado = geo.figura(4);
		String esperado = "Rectangulo";
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testFiguraPentagono() {
		String resultado = geo.figura(5);
		String esperado = "Pentagono";
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testFiguraRombo() {
		String resultado = geo.figura(6);
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testFiguraRomboide() {
		String resultado = geo.figura(7);
		String esperado = "Romboide";
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testFiguraTrapecio() {
		String resultado = geo.figura(8);
		String esperado = "Trapecio";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraDefault() {
		String resultado = geo.figura(9);
		String esperado = "Default";
		assertEquals(resultado, esperado);
	}
	
	
//	@Test
//	public testGeometria() {
//		Geometria esperado = new Geometria(3)
//	}
	
	@Test
	public void testToString() {
		String resultado = geo.toString();
		
	}


}
