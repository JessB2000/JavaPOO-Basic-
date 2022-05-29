package entities;

public class retangulo {
public double largura; 
public double altura;


public double area () {
	return largura*altura; 
}
public double perimetro(double largura, double altura) {
	double lados1=2*largura;
	double lados2=2*altura; 
	return lados1+lados2; 
	
}

public double diagonal (double largura, double altura) {
	double quadrado1=largura*largura; 
	double quadrado2=altura*altura; 
	double soma = quadrado1+quadrado2; 
	return Math.sqrt(soma); 
}
public String toString() {
	   return "Area: "+ String.format("%.2f", area()) + " Perimetro: "+ String.format("%.2f", perimetro (largura, altura))+ " Diagonal: "+ String.format("%.2f", diagonal(largura, altura)); 
}
}
