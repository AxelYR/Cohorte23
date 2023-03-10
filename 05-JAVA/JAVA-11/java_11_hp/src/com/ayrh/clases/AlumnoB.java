package com.ayrh.clases;

public class AlumnoB extends PersonaP{
	private int matricula;
	private double promedio;
	private String apellido;
	
	
	public AlumnoB(int matricula, double promedio, String nombre, int edad ) {
		super(nombre, edad);
		this.matricula = matricula;
		this.promedio = promedio;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	public void mostrarDatos(String apellido) {
		System.out.println(this.getNombre()+ apellido+" " +this.getEdad()+" "+this.matricula+" "+this.promedio);
	}
	
	
	@Override
	public String toString() {
		return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	
}
