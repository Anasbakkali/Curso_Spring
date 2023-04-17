package paquete;

public class SecretariaEmpleado implements Empleado {

	private Creacion_Informes nuevoInforme;
	
	
	
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
