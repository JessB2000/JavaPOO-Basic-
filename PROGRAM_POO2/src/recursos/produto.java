package recursos;


public class produto {

	public String name; 
	public double price; 
	public int quantidade; 
	
	public S

	public double valorEstoque () {
		return price*quantidade; 
	}
	
	public int addorremoveProdutos(int quantidade)
	{   
			if (quantidade>0) {
				this.quantidade+=quantidade; 
				 
				
			}
			if(quantidade<0) {
				this.quantidade-=quantidade; 
				
			}
			
			return quantidade; 
	}    
	
	
}
