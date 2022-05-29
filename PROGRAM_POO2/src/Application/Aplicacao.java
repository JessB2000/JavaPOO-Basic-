package Application;
import java.util.Locale;
import java.util.Scanner; 
import recursos.produto;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner var = new Scanner (System.in); 
        
		produto N;
		
		N = new produto(); 
		System.out.printf("Enter product data: "); 
		
		System.out.printf("Name:");
		
		N.name=var.nextLine();
		
		System.out.printf("Price:");
		
		N.price=var.nextDouble(); 
		
		System.out.printf("Quantity:");
		
		N.quantidade=var.nextInt(); 
		
		System.out.println("Product data: "+ N); // mostra todos os dados do produto 
		
		N.quantidade=var.nextInt(); 
		
		
		while (N.quantidade!=0) {
			int aux1=N.quantidade; 
			int aux2 =N.addorremoveProdutos(aux1); 
			System.out.println("Product data: "+ N);
		}
		
	}

}
