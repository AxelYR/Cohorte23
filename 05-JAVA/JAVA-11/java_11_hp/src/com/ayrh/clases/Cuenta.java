package com.ayrh.clases;

public class Cuenta {

	private float saldo;
	private int numeroConsignaciones = 0;
	private int numeroRetiros = 0;
	private float tasaAnual;
	private float comisionMensual = 0;

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	public Cuenta(float saldo, float tasaAnual) {
		super();
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	
	public float Consignar(float cantidad) {
			
		return this.saldo = saldo+cantidad;
	}
	
	public float retirar(float cantidad) {
		
		return this.saldo = saldo-cantidad;
	}
	
	public float calcularInteres() {
		
		return this.saldo = (float)(saldo*0.1);
	}
	
	public float extractoMensual() {				
		
		return this.saldo = saldo-calcularInteres();
		
	}
	
	

}
