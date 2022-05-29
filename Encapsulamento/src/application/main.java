package application;

import java.util.Locale;
import java.util.Scanner;
import entities.product;

public class main {

	public main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Entre com os dados do produto: %n");
		System.out.printf("Nome: ");
		String name = sc.nextLine();
		System.out.printf("Preço:");
		double price = sc.nextDouble();
		System.out.printf("Quantidade: ");
		int quantity = sc.nextInt();
		product Product = new product(name, price, quantity);
		System.out.println(Product);
		System.out.printf("Entre com a quantidade de produtos para adicionar: ");
		int quantidade = sc.nextInt();
		Product.AddProducts(quantidade);
		System.out.println("Dados atualizados: " + Product);
		System.out.printf("Entre com a quantidade de produtos para remover: ");
		int quantidade2 = sc.nextInt();
		Product.SubProducts(quantidade2);
		System.out.println("Dados atualizados: " + Product);
		sc.close();
	}

}
