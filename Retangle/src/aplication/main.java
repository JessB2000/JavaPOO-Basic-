package aplication;

import java.util.Locale;
import java.util.Scanner; 
import entities.retangulo;
public class main {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in); 
    
    retangulo Retangulo = new retangulo(); 
	System.out.printf("Entre com a largura do retangulo: ");
	Retangulo.largura = sc.nextDouble(); 
	System.out.printf("Entre com a altura do retangulo: "); 
	Retangulo.altura= sc.nextDouble(); 
    System.out.println(Retangulo); 
	sc.close();	
	}

}
