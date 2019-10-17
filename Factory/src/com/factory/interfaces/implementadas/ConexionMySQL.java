package com.factory.interfaces.implementadas;

import com.factory.interfaces.IConexion;

public class ConexionMySQL implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String pass;
	
	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "8080";
		this.usuario = "root";
		this.pass = "123";
	}

	@Override
	public void conectar() {
		System.out.println("Conexión exitosa a MySQL");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconexión exitosa a MySQL");
	}
	
	
	
}
