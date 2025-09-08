import java.util.Scanner;
public class Prog8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		final double PESO1 = 0.5, PESO2= 0.3, PESO3= 0.2; 
		
		double nota1,nota2,nota3, media;
		
		System.out.print("Digite Noata 1 : ");
		nota1 = reader.nextDouble();
		
		System.out.print("Digite Noata 2 : ");
		nota2 = reader.nextDouble();
		
		System.out.print("Digite Noata 3 : ");
		nota3 = reader.nextDouble();
		
		media = nota1 * PESO1 + nota2 * PESO2 + nota3 *PESO3;
		
		System.out.print("Média Ponderada : " + media);
		
		if( media >= 6.0) {
			System.out.print("Parabens voce passou");
		}
		else if( media >=4) {
		System.out.print("Voce esta de exame");
		}
		else{
			System.out.print("Voce Reprvou MACACO");
		}
		reader.close();
		System.exit(0);
	}

}
