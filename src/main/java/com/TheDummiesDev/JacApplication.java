package com.TheDummiesDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

//@SpringBootApplication

//Clase principal (main) de nuestro proyecto
public class JacApplication {

	// He comentado las pruebas de los atributos anteriores en lugar de eliminarlas en caso de necesitar esta información en el futuro
	public static void main(String[] args) {

		//SpringApplication.run(JacApplication.class, args);
	Jac Jac1 = new Jac ("La Prosperidad","cl 3 # 3-27","727 6420","1134-5");
	System.out.println(Jac1.getNombreJac());
	System.out.println(Jac1.getDireccionJac());
	System.out.println(Jac1.getTelefonoJac());
	System.out.println(Jac1.getNitJac());
	System.out.println("-------------");
	Empleado empleado1 = new Empleado("Marcos Bautista","macondo777@hotmail.com",Jac1,"Administrador");
	Empleado empleado2 = new Empleado("Juan Bolanos","juankz040895@gmail.com",Jac1,"Product Owner");
    Empleado empleado3 = new Empleado("Raymond Moreno", "Stivensmorenomora1990@gmail.com",Jac1,"Desarrollador");
		MovimientoDinero ingreso1 = new MovimientoDinero(20000,"donativo",empleado1);
		MovimientoDinero ingreso2 = new MovimientoDinero(15000,"rifa",empleado2);
		MovimientoDinero ingreso3 = new MovimientoDinero(25000,"bazar",empleado3);
		MovimientoDinero egreso1 = new MovimientoDinero(-10000,"pago",empleado1);

		/*  provando las clases creadas  (descomentar para provar).
		System.out.println(empleado1.getNombreEmpleado());
		System.out.println(empleado1.getRolJuntaAccionComunal());
		System.out.println("------------");
		MovimientoDinero ingreso1 = new MovimientoDinero(20000,"donativo",usuario1);
		System.out.println(ingreso1.getMontoMovimiento());
		System.out.println(ingreso1.getConceptoMovimiento());
		System.out.println(ingreso1.getUsuario().getNombreEmpleado());
		System.out.println(ingreso1.getUsuario().getRolJuntaAccionComunal());*/

	// Organizar informacion en Arrays para poder acceder facilmente a la información

		ArrayList<Empleado> empleados = new ArrayList();
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		ArrayList<MovimientoDinero> movimientoDineros = new ArrayList<>();
		movimientoDineros.add(ingreso1);
		movimientoDineros.add(ingreso2);
		movimientoDineros.add(ingreso3);
        movimientoDineros.add(egreso1);
		System.out.println(Arrays.toString(JacApplication.informacionEmpleados(empleados)));
		System.out.println(Arrays.toString(JacApplication.informacionMonetaria(movimientoDineros)));

	}

	// Funcion para obtener informacion resumida de los empleados
	public static Object[] informacionEmpleados (ArrayList<Empleado> empleados) {
		int cantEmpleados = 0;
		for (Empleado empleado : empleados) {
			cantEmpleados += 1;
		}
			Object[] resumido = {"Cantidad Empleados = " + cantEmpleados};
			return resumido;
	}

	//Funcion para obtener informacion resumida de los movimientos de dinero
	public static Object[] informacionMonetaria (ArrayList<MovimientoDinero> movimientoDineros) {
		float dineroTotal = 0;
		for (MovimientoDinero movimientoDinero : movimientoDineros) {
			dineroTotal += movimientoDinero.getMontoMovimiento();
		}
		Object[] balances = {"Dinero Total = " + dineroTotal};
		return balances;
	}


}
