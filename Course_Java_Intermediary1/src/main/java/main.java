// Testar o 7 bit do sistema 
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		int mask = 0b01000000; 
		int number = sc.NextInt(); 
		
		if ((number & mask)==0) {
			
			System.out.printf("The 7th bit is false"); 
		}
		else {
			System.out.printf("The 7th bit is true"); 
		}
sc.close();

	}
}
