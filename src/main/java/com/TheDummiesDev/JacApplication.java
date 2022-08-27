package com.TheDummiesDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

//@SpringBootApplication

//Clase principal (main) de nuestro proyecto
public class JacApplication {

	// He comentado las pruebas de los atributos anteriores en lugar de eliminarlas en caso de necesitar esta información en el futuro
//	public static void main(String[] args) {
//
//		//SpringApplication.run(JacApplication.class, args);
//		Jac Jac1 = new Jac ("La Prosperidad","cl 3 # 3-27","727 6420","1134-5");
//		System.out.println(Jac1.getNombreJac());
//		System.out.println(Jac1.getDireccionJac());
//		System.out.println(Jac1.getTelefonoJac());
//		System.out.println(Jac1.getNitJac());
//        System.out.println("-------------");
//		Empleado empleado1 = new Empleado("Marcos Bautista","macondo777@hotmail.com","La prosperidad","Administrador");
//		System.out.println(empleado1.getNombreEmpleado());
//		System.out.println(empleado1.getRolJuntaAccionComunal());
//		System.out.println("------------");
//		MovimientoDinero ingreso1 = new MovimientoDinero(20000,"donativo","Marcos Bautista");
//		System.out.println(ingreso1.getMontoMovimiento());
//		System.out.println(ingreso1.getConceptoMovimiento());
//		System.out.println(ingreso1.getUsuarioRegistraMovimiento());
//		Empleado empleado2 = new Empleado("Juan Bolanos","juankz040895@gmail.com","La prosperidad","Product Owner");
//		MovimientoDinero ingreso2 = new MovimientoDinero(15000,"donativo","Juan Bolanos");
//	}


	// Organizar informacion en Arrays para poder acceder facilmente a la información
	public static void main(String[] args){
		ArrayList<Empleado> empleados = new ArrayList();
		empleados.add(new Empleado("Marcos Bautista", "macondo777@hotmail.com","La prosperidad","Administrador"));
		empleados.add(new Empleado("Juan Bolanos","juankz040895@gmail.com","La prosperidad","Product Owner"));
		ArrayList<MovimientoDinero> movimientoDineros = new ArrayList<>();
		movimientoDineros.add(new MovimientoDinero(20000,"donativo","Marcos Bautista"));
		movimientoDineros.add(new MovimientoDinero(15000,"donativo","Juan Bolanos"));
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
	public static Object[] informacionMonetaria (ArrayList<MovimientoDinero> movimientoDineros){
		float dineroTotal = 0;
		for (MovimientoDinero movimientoDinero : movimientoDineros) {
			dineroTotal += movimientoDinero.getMontoMovimiento();
		}
			Object[] balances = {"Dinero Total = " + dineroTotal};
			return balances;
	}







}


