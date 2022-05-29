//test the function "Split" with java 
public class main {

	public static void main(String[] args) {
		String myWord = "Paulo Mariana Larissa"; 
		String[] vetor = myWord.split(" "); 
		
		System.out.printf("%s %n", vetor[0] );
		System.out.printf("%s %n", vetor[1]);
		System.out.printf("%s %n", vetor[2]); 

	}

}
