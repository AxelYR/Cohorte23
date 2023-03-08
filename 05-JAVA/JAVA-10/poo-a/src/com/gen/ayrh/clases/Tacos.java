package com.gen.ayrh.clases;

public class Tacos {
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private double precio;
	
	public Tacos() {
	}
	
	public void setTacos(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla) {
		this.tamanioDeTortilla=tamanioDeTortilla;
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla= numeroDeTortilla;
	}
	
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getGuisado() {
		return guisado;
	}

	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
