
public class Conexion {

	private static Conexion conexion;
	
	private Conexion() {}
	
	public static Conexion getConexion() {
		
		if (conexion == null) {
			conexion = new Conexion();
		}
		return conexion;
	}
	
	public void conectar() {
		System.out.println("CONEXIÓN EXITOSA");
	}
	
	public void desconectar() {
		System.out.println("DESCONEXIÓN EXITOSA");
	}
	
}
