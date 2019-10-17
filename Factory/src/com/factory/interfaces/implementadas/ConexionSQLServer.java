package com.factory.interfaces.implementadas;

import com.factory.interfaces.IConexion;

public class ConexionSQLServer implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String pass;
	
	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "9090";
		this.usuario = "root";
		this.pass = "12345";
	}

	@Override
	public void conectar() {
		System.out.println("Conexión exitosa a SQLServer");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconexión exitosa a SQLServer");
	}
	
}
