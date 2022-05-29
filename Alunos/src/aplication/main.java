package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.aluno;
public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		aluno Aluno = new aluno(); 
		System.out.printf("Digite o nome do aluno: %n");
		Aluno.nome=sc.nextLine(); 
		System.out.printf("Digite as 03 notas: %n"); 
		System.out.printf("Nota 01: "); 
		Aluno.nota1=sc.nextDouble();
		System.out.printf("Nota 02: "); 
		Aluno.nota2=sc.nextDouble();
		System.out.printf("Nota 03: "); 
		Aluno.nota3=sc.nextDouble();
		
		System.out.printf("Nota final: %.2f ", Aluno.NotaFinal());
		
		if (Aluno.NotaFinal()<60.0) {
			System.out.printf("Reprovado %n"); 
			System.out.printf("Faltam %.2f pontos para ser aprovado", Aluno.comparision()); 
		}
		
		else {
			System.out.printf("Aprovado"); 
		}
	}

}
