import java.util.Locale;
import java.util.Scanner; 
public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner var = new Scanner (System.in); 
		
		double lado11, lado21, lado31, lado12, lado22, lado32; 
		
		double perimetro1, area1;
		double perimetro2, area2; 
		
		System.out.printf("Entre com as medidas do primeiro triangulo: %n"); 
		lado11=var.nextDouble(); 
		lado21=var.nextDouble();
		lado31=var.nextDouble();
		
		System.out.printf("Entre com as medidas do segundo triangulo: %n"); 
		lado12=var.nextDouble(); 
		lado22=var.nextDouble(); 
		lado32=var.nextDouble(); 
		
		perimetro1= (lado11+lado21+lado31)/2; 
		perimetro2= (lado12+lado22+lado32)/2; 
		
		area1= Math.sqrt(perimetro1*(perimetro1-lado11)*(perimetro1-lado21)*(perimetro1-lado31)); 
		area2= Math.sqrt(perimetro2*(perimetro2-lado12)*(perimetro2-lado22)*(perimetro2-lado32)); 
		
		System.out.printf("Area primeiro triangulo %.4f", area1); 
		System.out.printf("Area segundo triangulo %.4f", area2); 
		
		if (area1>area2) {
			System.out.printf("Area maior: %.4f", area1);
			
		}
		else {
			System.out.printf("Area maior: %4f", area2); 
		}
		
		
		var.close(); 
		

	}

}
