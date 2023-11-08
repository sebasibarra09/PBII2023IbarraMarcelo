package ar.edu.unlam.pb2.Parcial01;

import java.util.Objects;

public class Producto implements Vendible {
	
	private String codigo;
	private String nombre;
	private double precio;
	
	public Producto(String codigo, String nombre, double precio) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
	}

	@Override
	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
}
