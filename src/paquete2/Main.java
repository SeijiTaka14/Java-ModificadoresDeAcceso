package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

public class Main extends paquete1.ClaseProtected {
	
	public static void main(String[] args) {
		
		ClaseDefault prueba = new ClaseDefault(); 
		//prueba.mostrar();
		
		ClasePrivada privada = new ClasePrivada();
//		privada.edad = 21;
//		privada.nombre = "Seiji";
		
		privada.setSaludar("Seiji");
		System.out.println(privada.getSaludar());
		
		
		//Objeto de la clase protected
		ClaseProtected protegido = new ClaseProtected();
		protegido.setEdad(21);
		System.out.println(protegido.getEdad());
		
	}
}
