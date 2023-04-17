package ort;
import java.util.Scanner;

public class TrabajoPractico39{
	int personas = 0;
	int cero= 0;
	int tiro = 0;
	int puntaje = 0;
	int acumulador_de_puntos = 0;
	int acumulador_anterior = 0;
	int distancia = 0;
	int cantidadcentro = 0;
	String nombre;
	String nombre_anterior;
	
	
	

	
	cantidad = SolicitarCantidadPersonas();
	
	  
	for(int i= 0; i > personas; i++) {
		tiro = tiro + 1;
		while 
			if !(tiro > 3){
			consultapuntos = ConsultarPuntaje();
			acumulador_de_puntos = acumulador_de_puntos + puntaje;
			tiro = tiro + 1;
			
			else {
				if !(acumulador_de_puntos = acumulador_anterior){
					if(acumulador_de_puntos > acumulador_anterior){
						acumulador_anterior = acumulador_de_puntos;
						nombre_anterior = nombre;
			}
				else {
						acumulador_anterior = acumulador_de_puntos;
						nombre_anterior = nombre;
					}
					}
				tiro = cero;
				break;
				}
					
					}

		System.out.println("El ganador es: " +  nombre_anterior);	
		System.out.println("Y su puntaje fue: " +  acumulador_anterior);	
		System.out.println("Los tiros al centro fueron: " +  cantidadcentro);	
}

	Private class SolicitarCantidadPersonas{
			 int personas = 0;
			 System.out.println("¿Cuantas personas van a jugar al tiro al blanco?");		
		     personas = Integer.parseInt(input.nextLine());
	return personas;		
}

	Private class ConsultarPuntaje{
	 int puntaje = 0;
	 int distancia = 0;
	 int cantidadcentro = 0;
	 System.out.printIn("¿Cuanto fue la distancia del tiro " + tiro + " ?");
	 distancia = Integer.parseInt(input.nextLine());
	 if (distancia = 0) {
		 puntaje = puntaje + 500;
		 cantidadcentro ++;
		 else {
			 if(distancia <= 10) {
				 puntaje = puntaje + 250;
				 else {
					 if(puntaje >= 11 && puntaje <= 50) {
						 puntaje = puntaje + 100;
					 }
				 }
			 }
		 }
	 }
	 return puntaje;
	 return cantidadcentro;
}
	
}