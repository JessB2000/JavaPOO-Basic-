package entities;

public class triangle {
public double a; 
public double b; 
public double c; 

public double perimetro() {
	double aux1;
	aux1=(a+b+c)/2; 
	
	return aux1; 
}

public double area(double calculado) {
	double aux2; 
	
	aux2=Math.sqrt(calculado*(calculado-a)*(calculado-b)*(calculado-c)); 
	
	return aux2; 
}

}
