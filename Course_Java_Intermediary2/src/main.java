//testing functions with Strings
public class main {

	public static void main(String[] args) {
		String original = "abcde FGHI ABC abc DEFG   "; 
		
		String nova = original.toLowerCase(); // transforma tudo pra minusculo
		
		String nova2 = original.toUpperCase(); // transforma tudo pra maiúsculo 
		
		String nova3 = original.trim(); // elimina espaços em branco no final 
		
		String nova4 = original.substring(3); //exibe tudo a partir do caractere 3
		
		String nova5 = original.substring (3,8); // exibe caracteres entre 3 e 8
		
		String nova6 = original.replace('a','v'); // substitui a por z
        
	    String nova7 = original.replace("abc", "xy"); //substitui abc por xy
	    
	    int i = original.indexOf("bc"); // primeira ocorrencia do abc
	    
	    int j = original.lastIndexOf("bc"); //ultima ocorrencia do abc 
	    
	   // String nova10= 
		
		System.out.printf("%s %n", original); 
		System.out.printf("%s %n", nova);
		System.out.printf("%s %n ", nova2);
		System.out.printf("%s %n ", nova3); 
        System.out.printf("%s %n",nova4); 
        System.out.printf("%s %n", nova5); 
        System.out.printf("%s %n", nova6); 
        System.out.printf("%s %n", nova7); 
        System.out.printf("%s %n", i); 
        System.out.printf("%s %n", j);
	}

}
