import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner var = new Scanner (System.in); 
		
		int A = var.nextInt(); 
		
		int B = var.nextInt(); 
		
		int C = var.nextInt(); 
		
		
		
		if (A>B && A>C) {
			
		  System.out.printf("%d",A); 
		  
		}
		else if (B>A && B>C) {
			System.out.printf("%d", B); 
		}
		
		else {
			System.out.printf("%d", C); 
		}
		var.close(); 

	}

}
