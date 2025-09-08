
import java.util.Scanner;

public class Prog12 {

	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Prog 12  - Converção de Temperatura");
		
	    
		double C, F;
		
		System.out.print("Informe os Graus em Fahrenheit: ");
		F = reader.nextDouble();
		
		C = (F - 32)/1.8;
		
		System.out.println("\n-----------------------------");
		System.out.println("Graus Celsius: " + C + "º");
		System.out.println("-----------------------------");
		
		/*if(C >= 30)
		{
			System.out.print("Se hidrate");
		}
		else if( C >= 20 && C < 30)
		{
			System.out.print("Temperatura boa");	
		}
		else 
		{
			System.out.print("Frio, gelado");
		}*/
		
		 int faixa = (C >= 30) ? 1 : (C >= 20) ? 2 : 3;

	        switch (faixa) {
	            case 1:
	                System.out.print("Se hidrate");
	                break;
	            case 2:
	                System.out.print("Temperatura boa");
	                break;
	            case 3:
	                System.out.print("Frio, gelado");
	                break;
	            default:
	                System.out.print("Temperatura inválida");
	                break;
	        }
	        reader.close();
			System.exit(0);

	}//Final main
}//Final public
