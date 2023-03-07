package oop.clases;

public class fecha {
	public int dia;
	public String mes;
	public int año;
	public fecha(int dia, String mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public String fechota() {
		return this.dia +" de "+ this.mes+ " del "+this.año;
	}
}
