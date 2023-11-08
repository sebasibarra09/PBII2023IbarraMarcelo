package ar.edu.unlam.pb2.Parcial01;

public class Servicio implements Vendible {
	
	protected String codigo;
	protected String nombre;
	protected double precio;
	protected String fecha1;
	protected String fecha2;
	

	public Servicio(String codigo, String nombre, double precio, String fecha1, String fecha2) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	@Override
	public String getCodigo() {
		return this.codigo;
	}

	public String getFecha1() {
		return fecha1;
	}

	public void setFecha1(String fecha1) {
		this.fecha1 = fecha1;
	}

	public String getFecha2() {
		return fecha2;
	}

	public void setFecha2(String fecha2) {
		this.fecha2 = fecha2;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}
	
	
}
