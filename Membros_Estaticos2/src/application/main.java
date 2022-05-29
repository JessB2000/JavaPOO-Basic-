package application;

import java.util.Locale;
import java.util.Scanner; 
import entities.Calculator;
public class main {
	
public static final double PI = 3.14159;

public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in); 

Calculator calculator = new Calculator(); 
System.out.printf("Entre com o raio: "); 
calculator.raio = sc.nextDouble(); 
double c = calculator.circunferencia(raio); 
double v = calculator.volume(raio); 
System.out.printf("Circunferencia: %.2f %n", c);
System.out.printf("Volume: %n", v); 
System.out.printf("Valor de pi: %.2f", calculator.PI); 
sc.close();
	}

}