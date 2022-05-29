package entities;

public class aluno {
public String nome; 
public double nota1;
public double nota2;
public double nota3; 

public double NotaFinal() {
	return nota1+nota2+nota3; 
}

public double comparision () {
	double total = nota1+nota2+nota3;
	if ((total) < 60) {
		
		return 60-NotaFinal(); 
	}
	
	else {
		 
		return 0.0; 
	}
}
}
