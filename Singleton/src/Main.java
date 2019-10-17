
public class Main {

	public static void main(String[] args) {
		
		Conexion c = Conexion.getConexion();
		c.conectar();
		c.desconectar();
		
		Boolean rta = c instanceof Conexion;
		
		System.out.println("¿Es c una instancia de Conexión? " + rta);
		
	}

}
