import java.util.Scanner; 

public class main {

	public static void main(String[] args) {
		
		Scanner var = new Scanner (System.in); 
		
		int num1, num2, num3;
	
		
		num1=var.nextInt();
		num2=var.nextInt(); 
		num3=var.nextInt(); 
		
		int maior = big(num1,num2,num3);
		
		showResult(maior); 
		
		var.close(); 
	}
	
	public static int big (int x, int y, int z) {
		int aux; 
		if (x>y && x>z) {
			 aux = x; 
		}
		
		else if (y>x && y>z) {
			aux = y; 
		}
		else {
			 aux = z; 
		}
		
		return  aux; 
	}
	
	public static void showResult (int valor) {
		
		System.out.printf("O maior : %d", valor, null); 
		
	}

}
