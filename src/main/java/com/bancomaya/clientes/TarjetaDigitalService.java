package com.bancomaya.clientes;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService
public interface TarjetaDigitalService {
	
	
	public TarjetaDigital crearTarjeta(TarjetaDigital tarjetaDigital);
	
	
	public List<TarjetaDigital> obtenerTarjetaDigital();
	
	
	public TarjetaDigital obtenerTarjetaPorNumero(String nuemroTarjeta);
	
	public TarjetaDigital obtenerTarjetaPorNombre(String nombre);
}
