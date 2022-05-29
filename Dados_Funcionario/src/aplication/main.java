package aplication;

import java.util.Locale;
import java.util.Scanner; 
import entities.Funcionario;
public class main {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in); 
    
    
    Funcionario funcionario = new Funcionario(); 
    System.out.printf("Nome do funcionário: ");
    funcionario.nome = sc.nextLine();
    System.out.printf("Salario: ");
    funcionario.salario = sc.nextDouble(); 
    System.out.printf("Imposto: ");
    funcionario.imposto=sc.nextDouble();
    System.out.println("Funcionário: "+ funcionario); 
    System.out.println("Quanto vc quer aumentar o salário? ");
    double percentagem; 
    percentagem = sc.nextDouble(); 
    funcionario.NovoSalario(percentagem); 
    System.out.println("Salário Atualizado: " + funcionario); 
    sc.close();
    
	}

}
