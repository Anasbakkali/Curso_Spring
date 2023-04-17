package paquete;

public class JefeEmpleado implements Empleado {

	private Creacion_Informes nuevoInforme;
	private String email;
	private String nombreEmpresa;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public JefeEmpleado(Creacion_Informes nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	}
	@Override
	public String get_datos() {
		// TODO Auto-generated method stub
		return "Hola soy el jefe";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe del Jefe: " + nuevoInforme.getInforme();
	}

}
