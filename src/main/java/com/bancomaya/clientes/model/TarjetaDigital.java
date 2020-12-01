package com.bancomaya.clientes.model;

public class TarjetaDigital {
	
	private int id;
	
	private String banco;
	
	private String cliente;
	
	private String fechaCencimiento;
	
	private String numeroSeguridad;
	
	private String numeroTarjeta;
	
	public TarjetaDigital() {}
	
	

	public TarjetaDigital(int id, String banco, String cliente, String fechaCencimiento, String numeroSeguridad,
			String numeroTarjeta) {
		this.id = id;
		this.banco = banco;
		this.cliente = cliente;
		this.fechaCencimiento = fechaCencimiento;
		this.numeroSeguridad = numeroSeguridad;
		this.numeroTarjeta = numeroTarjeta;
	}





	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFechaCencimiento() {
		return fechaCencimiento;
	}

	public void setFechaCencimiento(String fechaCencimiento) {
		this.fechaCencimiento = fechaCencimiento;
	}

	public String getNumeroSeguridad() {
		return numeroSeguridad;
	}

	public void setNumeroSeguridad(String numeroSeguridad) {
		this.numeroSeguridad = numeroSeguridad;
	}
	
	

}
