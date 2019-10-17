package com.factory;

import com.factory.interfaces.IConexion;

public class Main {

	public static void main(String[] args) {
		
		ConexionFactory factory = new ConexionFactory();
		
		IConexion conMySQL = factory.getConexion(1);
		conMySQL.conectar();
		
		IConexion conVacia = factory.getConexion(5);
		conVacia.conectar();

	}

}
