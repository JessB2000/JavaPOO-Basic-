package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Controller;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Controller controller;
		
		System.out.printf("Entre com o número da conta: %n");
		
		int number = sc.nextInt(); 
		
		System.out.printf("Entre com o seu nome: %n");
		
		String name = sc.nextLine();
		
		System.out.printf("Gostaria de fazer um depósito?");
		
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.printf("Entre com o valor inicial da sua conta: %n");
			double valorA = sc.nextDouble(); 
			
			controller = new Controller (number, name, valorA); 
		}
		
		else {
			controller = new Controller(number, name); 
		}
		
		System.out.println();
		System.out.println("Dados da conta: %n");
		System.out.println(controller);
		
		System.out.println();
		System.out.printf("Entre com um valor de depósito: %n");
		double depositoT = sc.nextDouble();
		controller.deposita(depositoT);
		System.out.printf("Conta Atualizada: %n");
		System.out.println(controller);
		
		System.out.println();
		System.out.printf("Entre com valor para retirar: %n ");
		double retirar = sc.nextDouble();
		controller.retira(retirar);
		System.out.printf("Conta atualizada: %n");
		System.out.println(controller);
		
		sc.close();
	}

}
