package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


import com.bancomaya.clientes.model.TarjetaDigital;


@WebService(endpointInterface = "com.bancomaya.clientes.TarjetaDigitalService")
public class TarjetaDigitalServicesImpl implements TarjetaDigitalService {

	
	private static List<TarjetaDigital>tarjetas= new ArrayList<>();
	
	static {
		
	}

	@Override
	public TarjetaDigital crearTarjeta(TarjetaDigital tarjetaDigital) {
		    tarjetaDigital.setId(tarjetas.size()+1);
		 	tarjetas.add(tarjetaDigital);
		return tarjetaDigital;
	}

	@Override
	public List<TarjetaDigital> obtenerTarjetaDigital() {
		// TODO Auto-generated method stub
		return tarjetas;
	}

	@Override
	public TarjetaDigital obtenerTarjetaPorNumero(String nuemroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTarjetaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
