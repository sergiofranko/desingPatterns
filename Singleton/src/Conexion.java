
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
		System.out.println("CONEXI�N EXITOSA");
	}
	
	public void desconectar() {
		System.out.println("DESCONEXI�N EXITOSA");
	}
	
}
