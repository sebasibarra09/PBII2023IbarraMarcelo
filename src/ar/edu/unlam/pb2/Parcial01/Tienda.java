package ar.edu.unlam.pb2.Parcial01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tienda {
	
	private String codigo;
	private String nombre;
	private Set<Producto> productos;
	private Map<Producto, Integer> stock;
	private Set<Cliente> clientes;
	private Set <Vendedor> vendedores;
	private Set <Venta> ventas;
	private Set <Servicio> servicios;
	
	public Tienda(String codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.productos = new HashSet<>();
		this.stock = new HashMap<>();
		this.clientes = new HashSet<>();
		this.vendedores = new HashSet<>();
		this.ventas = new HashSet<>();
		this.servicios= new HashSet<>();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void agregarProducto(Producto producto, Integer cantidad) {
		stock.put(producto, cantidad);	
	}

	public Producto getVendible(String codigo2) throws VendibleInexistenteException {
		for (Producto produ : productos) {
			if (produ.getCodigo().equals(codigo2)) {
				return produ;
			}
		}throw new VendibleInexistenteException();
	}

	public Integer getStock(Producto producto) {
		return stock.get(producto);
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}

	public Cliente getCliente(String cuitEjemplo) throws ClienteInexistenteException {
		for (Cliente cliente : clientes) {
			if (cliente.getCuit().equals(cuitEjemplo)) {
				return cliente;
			}
		}
		throw new ClienteInexistenteException();
	}

	public void agregarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	public Vendedor getVendedor(String dniEjemplo) throws VendedorInexistenteException {
		for (Vendedor vend : vendedores) {
			if (vend.getDni().equals(dniEjemplo)) {
				return vend;
			}
		}
			throw new VendedorInexistenteException();
		}

	public void agregarVenta(Venta ticket) {
		ventas.add(ticket);
		
	}

	public void agregarProductoAVenta(String codigo2, Producto producto, Integer cantidadVendida) throws StockInsuficienteException, VentaInexistenteException {
			for (Map.Entry<Producto, Integer> entry : stock.entrySet()) {
				Producto key = entry.getKey();
				Integer val = entry.getValue();
				if (key == producto) {
					if (val > cantidadVendida) {
						entry.setValue(val -cantidadVendida);
						for (Venta venta : ventas) {
							if (venta.getCodigo() == codigo2) {
								venta.setTotal(venta.getTotal()+(producto.getPrecio()*cantidadVendida));
								
							}
						}
						return;
					} else {
						throw new StockInsuficienteException();
					}
				} 
				
			} throw new VentaInexistenteException();		
	}

	public void agregarServicio(Servicio servicio) {
		servicios.add(servicio);
		
	}

	public void agregarServicioAVenta(String codigo, Servicio servicio) {
		for (Venta servi : ventas) {
			if (servi.getCodigo() == codigo) {
				servi.setTotal(servi.getTotal()+servicio.getPrecio());
			}
		}
		
	}

	public void agregarVentaAlVendedor(Venta venta, Vendedor vendedor) {
		for (Vendedor vende : vendedores) {
			vendedor.getVentas().add(venta);
		}
	}

	public void sumarVentasPorVendedor(Vendedor vendedor) {
		for (Venta vende : vendedor.getVentas()) {
			vendedor.setVentasGeneradas(vendedor.getGananciasGeneradas()+vende.getTotal());
		}
		
	}

	public void calcularPorcentajePorVendedor(Vendedor vendedor) {
		vendedor.setGananciasGeneradas(vendedor.getGananciasGeneradas()+vendedor.getVentasGeneradas()*0.10);
		System.out.println(vendedor.getGananciasGeneradas());
	}
	

}
