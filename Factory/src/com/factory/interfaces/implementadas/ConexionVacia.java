package com.factory.interfaces.implementadas;

import com.factory.interfaces.IConexion;

public class ConexionVacia implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String pass;
	

	@Override
	public void conectar() {
		System.out.println("No se especificó motor de base de datos");
	}

	@Override
	public void desconectar() {
		System.out.println("No se especificó motor de base de datos");
	}

}
