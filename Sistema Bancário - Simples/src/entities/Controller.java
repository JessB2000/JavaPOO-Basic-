package entities;

public class Controller {
 private int number;
 private String name; 
 private double valor1; 
 
 public Controller (int number, String name, double valorA) {
	 this.number = number; 
	 this.name = name;
	 deposita(valorA); 
 }
 public Controller (int number, String name) {
	 this.number = number; 
	 this.name = name; 
 }
 
 public int getNumber() {
		return number; 
	}
	
 public String getName() {
	 return name; 
 }
 public void setName (String name) {
		this.name = name; 
	}
 public double getValor1() {
	 return valor1; 
 }

 public void deposita (double valorI) { 
	 valor1+=valorI;
 }
 public void retira (double valorI) {
	 valor1-=valorI +  5.00;
 }
 
 public String toString() {
	 return "Conta " + number + ", Nome: " + name + ", Deposito Inicial: "+ String.format("%.2f", valor1); 
 }
}
