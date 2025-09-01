
import java.util.Scanner;

public class Prog01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		//Constantes
		final double MEDIA_APROVACAO = 6.0;
		
		//Variaveis
		double nota1, nota2, media;
		
		System.out.println("Prog 01 - Calculo de Media");
		
		System.out.println("\nDigite a nota 1:");
		nota1 = leitor.nextDouble();
		
		System.out.println("Digite a nota 2:");
		nota2 = leitor.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("\nMedia:" + media);
		
		if (media >= MEDIA_APROVACAO){
		    System.out.println("Parabens, Aprovado!");
			System.out.println("voce nao e burro");
		}
		else{
		    System.out.println("Reprovado, infelizmente voce nasceu burro");
			System.out.println("procure minha bilola");
		}// fim do if
		
		leitor.close();
		System.exit(0);
		
	} // fim_main
}// fim_prog01
