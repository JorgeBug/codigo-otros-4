package com.generation;

//Se agregó la librería Scanner
import java.util.Scanner;

public class Codigo4 {
	
	//Se le agregó el main debido a que si el código principal no está dentro de un main, este no se ejecuta.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);//Se llama System.in
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		
		//Se corrige el mensaje del número de jugador 1 con el jugador 2
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		//Scanner s2 = new Scanner(); No es necesario hacer otra variable de entrada
		// sobre todo por que no se está utilizando.
		String j2 = s.nextLine();
		
		if (j1.equals(j2)) { //Se usa equals para comparar el contenido del String
			System.out.println("Empate");
		} else {
			
			int g = 2;
			
			switch(j1) {
			
			case "piedra": 
				if (j2.equals("tijeras")) { //Se usa equals para comparar el contenido del String
					g = 1;
				}
				break; //Les faltaba agregar el break;
				
			case "papel":
				if (j2.equals("piedra")){//Se usa equals para comparar el contenido del String
					g = 1;
				}//Le faltaba cerrar la llave
				break;//Les faltaba agregar el break;
				
			case "tijera":
				if (j2.equals("papel")) {//Se usa equals para comparar el contenido del String
					g = 1;
				}
				break;//Les faltaba agregar el break;
				
			default://Le faltaba un mensaje en caso de que uno de los dos jugadores no introdujecen los valores correspondientes
				System.out.println("Uno de los jugadores no introdujo las opciones correspondientes");
			}
			System.out.println("Gana el jugador " + g);
		}
	}

}