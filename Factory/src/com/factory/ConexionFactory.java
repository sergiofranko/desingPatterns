package com.factory;

import com.factory.interfaces.IConexion;
import com.factory.interfaces.implementadas.ConexionMySQL;
import com.factory.interfaces.implementadas.ConexionOracle;
import com.factory.interfaces.implementadas.ConexionSQLServer;
import com.factory.interfaces.implementadas.ConexionVacia;

public class ConexionFactory {

	public final static int MYSQL = 1;
	public final static int SQLSERVER = 2;
	public final static int ORACLE = 3;
	
	
	
	public IConexion getConexion(int motor) {
		switch(motor) {
		case 1:
			return new ConexionMySQL();
		case 2:
			return new ConexionSQLServer();
		case 3:
			return new ConexionOracle();
		default:
			return new ConexionVacia();
		}
	}
}
