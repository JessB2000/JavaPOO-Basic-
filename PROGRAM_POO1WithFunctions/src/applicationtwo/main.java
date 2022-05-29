package applicationtwo;
import java.util.Locale;
import java.util.Scanner; 
import entities.triangle;

public class main {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner var = new Scanner (System.in); 
		
		triangle x,y; 
		
		x=new triangle();
		y=new triangle(); 
		
		
		System.out.printf("Digite os lados do triangulo: "); 
		
	    x.a=var.nextDouble();
	    x.b=var.nextDouble();
	    x.c=var.nextDouble(); 
	    
	    
	    System.out.printf("Digite os lados do triangulo: "); 
	    
	    y.a=var.nextDouble();
	    y.b=var.nextDouble();
	    y.c=var.nextDouble(); 
		
	    
	    double perimetro1= x.perimetro(); 
	    double perimetro2= y.perimetro(); 
	    double area1= x.area(perimetro1); 
	    double area2= y.area(perimetro2); 
	    
	    String maior1 = "X"; 
	    String maior2 = "Y"; 
	    String maior; 
	    if (area1>area2) {
	    	maior=maior1; 
	    }
	    else {
	    	maior=maior2; 
	    }
	    
	    showResult(maior); 
	    
		var.close(); 
	}


	public static void showResult (String comparacao) {
		System.out.printf("A maior área é do %s", comparacao); 
	}; 

		
	}
		