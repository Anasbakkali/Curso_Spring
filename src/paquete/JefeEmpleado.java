package paquete;

public class JefeEmpleado implements Empleado {

	private Creacion_Informes nuevoInforme;
	
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
