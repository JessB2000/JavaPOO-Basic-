package application;
import java.util.Locale;
import java.util.Scanner; 
import entities.triangle;

public class aplicaçao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner var = new Scanner (System.in); 
		
		triangle x, y;  // declara as variaveis da classe no programa
		
		x= new triangle(); // cria dois objetos triangulo 
		y= new triangle(); 
		
		System.out.printf("Entre com os dados do primeiro triangulo"); 
		
		x.a=var.nextDouble();
		x.b=var.nextDouble(); 
		x.c=var.nextDouble(); 
		
		double p1;
		p1=(x.a+x.b+x.c)/2;
	
		
		System.out.printf("Entre com os dados do primeiro triangulo");
		
		y.a= var.nextDouble();
		y.b= var.nextDouble();
		y.c= var.nextDouble();
		
		double p2; 
		p2=(y.a+y.b+y.c)/2; 
		
		
		double area1, area2; 
		
		area1= Math.sqrt(p1*(p1-x.a)*(p1-x.b)*(p1-x.c)); 
		area2= Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c)); 
		
		if (area1>area2) {
			System.out.printf("X");
		}
		else {
			System.out.printf("Y"); 
		}
		var.close(); 
		
	}

}
