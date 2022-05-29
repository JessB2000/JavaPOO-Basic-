package entities;

public class Funcionario {
	
public String nome;
public double salario; 
public double imposto; 

public double SalarioLiquido() {
	return salario - imposto; 
}

public void NovoSalario(double porcentagem) {
   
	double porcentagemT = (porcentagem/100)*salario; 
	
	salario+=porcentagemT; 
}

public String toString () {
	return nome + "," + String.format("%.2f", SalarioLiquido()); 
}
}
