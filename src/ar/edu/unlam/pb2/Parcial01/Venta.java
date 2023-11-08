package ar.edu.unlam.pb2.Parcial01;

public class Venta {

	private String codigo;
	private Cliente cliente;
	private Vendedor vendedor;
	private Double total;

	public Venta(String codigo, Cliente cliente, Vendedor vendedor) {
		this.codigo=codigo;
		this.cliente=cliente;
		this.vendedor=vendedor;
		this.total=0.0;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotal() {
		return this.total;
	}

}
