package entities;

public class product {

	public String name; 
	public double price; 
	public int quantity; 
	
	public double TotalValueInStock() {
		return price*quantity; 
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity; // O this faz uma referencia ao objeto
	
	}
   public void SubProducts (int quantity) {
	   this.quantity-=quantity; 
   }
   public String toString() {
	   return name+" , $ " + price + ", " + quantity + " unidades, "+ "Total: $"+ String.format("%.2f", TotalValueInStock()); 
   }
}
