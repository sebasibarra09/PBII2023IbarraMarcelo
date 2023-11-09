package ar.edu.unlam.pb2.Parcial01;

import java.util.HashSet;
import java.util.Set;

public class Vendedor {
	
	private String dni;
	private String nombre;
	private Set<Venta> ventas;
	private double ventasGeneradas;
	private double gananciasGeneradas;

	public Vendedor (String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		this.ventas = new HashSet<>();
		this.ventasGeneradas=0;
		this.gananciasGeneradas=0;
	}
	
	public double getVentasGeneradas() {
		return ventasGeneradas;
	}

	public void setVentasGeneradas(double ventasGeneradas) {
		this.ventasGeneradas = ventasGeneradas;
	}

	public double getGananciasGeneradas() {
		return gananciasGeneradas;
	}

	public void setGananciasGeneradas(double gananciasGeneradas) {
		this.gananciasGeneradas = gananciasGeneradas;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}
	
	
}
