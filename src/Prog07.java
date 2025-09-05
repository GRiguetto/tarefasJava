import java.util.Scanner;

public class Prog07 {

	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    //Constante
	    final double PI = 3.1415;
	    
	    //Variaveis
	    double raio, geratriz, area;
	
	    System.out.println("-------------------------------------------------------------------------------------");
	    System.out.println("Prog07 - Area de um Cone");
	    System.out.println("-------------------------------------------------------------------------------------");
	    
	    System.out.print("\nDigite o raio: ");
	    raio = leitor.nextDouble();
	    
	    System.out.println("\nDigite a geratriz: ");
	    geratriz = leitor.nextDouble();
	    
	    area = PI * raio * (raio + geratriz);
	    area = Math.PI * raio * (raio + geratriz);
	    
	    System.out.println("Area: " + area);
	    System.out.printf("Area: %.2f", area);
	    
	    leitor.close();
	    System.exit(0);
	   
	  

	}// fim do main

}

