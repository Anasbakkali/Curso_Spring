package paquete;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//Empleado empleado1 = new JefeEmpleado();
			//System.out.println(empleado1.get_datos());
		
		ClassPathXmlApplicationContext contexto = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado juan =  contexto.getBean("miEmpleado",Empleado.class);
		
		System.out.println(juan.get_datos());
		
		contexto.close();
	
	}

}
