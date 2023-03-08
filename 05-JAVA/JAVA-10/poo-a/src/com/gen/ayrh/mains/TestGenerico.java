package com.gen.ayrh.mains;

import com.gen.ayrh.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {

		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> StringObj = new ClaseGenerica<String>("Prueba");
		
		intObj.claseTipo();
		StringObj.claseTipo();

	}

}
