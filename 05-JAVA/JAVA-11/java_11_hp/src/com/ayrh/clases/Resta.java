package com.ayrh.clases;

public class Resta implements OperacionesAritmeticas, Mensajes {

	private double n1;
	private double n2;
	
	
	
	
	
	public Resta(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	
	public double getN1() {
		return n1;
	}



	public void setN1(double n1) {
		this.n1 = n1;
	}



	public double getN2() {
		return n2;
	}



	public void setN2(double n2) {
		this.n2 = n2;
	}



	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return n1-n2;
	}
	@Override
	public double dividir() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double multiplicar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
