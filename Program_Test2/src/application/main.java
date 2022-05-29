package application;
import java.util.Locale;
import java.util.Scanner;
import entities.product; 
public class main {

	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner (System.in); 
     
     product Product = new product();
     System.out.printf("Entre com os dados do produto: %n"); 
     System.out.printf("Nome: "); 
     Product.name = sc.nextLine();
     System.out.printf("Preço:"); 
     Product.price = sc.nextDouble(); 
     System.out.printf("Quantidade: "); 
     Product.quantity = sc.nextInt(); 
     System.out.println(Product); 
     System.out.printf("Entre com a quantidade de produtos para adicionar: "); 
     int quantidade = sc.nextInt(); 
     Product.AddProducts(quantidade); 
     System.out.println("Dados atualizados: "+ Product); 
     System.out.printf("Entre com a quantidade de produtos para remover: "); 
     int quantidade2 = sc.nextInt();
     Product.SubProducts(quantidade2); 
     System.out.println("Dados atualizados: "+ Product); 
     sc.close(); 
	}

}
