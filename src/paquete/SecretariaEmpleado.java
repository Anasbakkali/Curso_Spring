package paquete;

public class SecretariaEmpleado implements Empleado {

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

	public void setNuevoInforme(Creacion_Informes nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String get_datos() {
		// TODO Auto-generated method stub
		return "Hola soy la Secretaria";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de la Secretaria" + nuevoInforme.getInforme();
	}

}
