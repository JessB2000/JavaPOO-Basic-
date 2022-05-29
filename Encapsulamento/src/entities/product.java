package entities;

public class product {

	private String name; 
	private double price; 
	private int quantity; 
	
	public product (String name, double price, int quantity) {
		this.name = name; 
		this.price = price;
		this.quantity = quantity; 
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName (String name) {
		this.name = name; 
	}
	

	public double getPrice() {
		return price; 
	}
	
	public void setPrice (double price) {
		this.price = price; 
	}
	
	public int getQuantity() {
		return quantity; 
	}
	
	public double TotalValueInStock() {
		return price*quantity; 
	}
	
	public void AddProducts(int quantity) {
		quantity += quantity; // O this faz uma referencia ao objeto
	
	}
   public void SubProducts (int quantity) {
	   quantity-=quantity; 
   }
   public String toString() {
	   return name+" , $ " + price + ", " + quantity + " unidades, "+ "Total: $"+ String.format("%.2f", TotalValueInStock()); 
   }
}
