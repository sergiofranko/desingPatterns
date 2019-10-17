package com.factory.interfaces.implementadas;

import com.factory.interfaces.IConexion;

public class ConexionOracle implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String pass;
	
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "7070";
		this.usuario = "root";
		this.pass = "1234567";
	}

	@Override
	public void conectar() {
		System.out.println("Conexión exitosa a Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconexión exitosa a Oracle");
	}
}
