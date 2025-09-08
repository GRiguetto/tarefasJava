import java.util.Scanner;
public class Prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		//conts
		final double PREMIO = 780000;
		
		//vARIAVEIS
		double pontoC1, pontoC2, pontoC3, soma;
		
		System.out.print("Prog 15 - Premiação");
		
		System.out.print("\n\nDigite a pontuação do Canditado 1 : ");
		pontoC1 = reader.nextDouble();
		
		System.out.print("Digite a pontuação do Canditado 2 : ");
		pontoC2 = reader.nextDouble();
		
		System.out.print("Digite a pontuação do Canditado 3 : ");
		pontoC3 = reader.nextDouble();
		
		soma = pontoC1 + pontoC2 + pontoC3;
		
		System.out.println("------Premiação Final------");
		
		System.out.println("Candidato 1: " + pontoC1/soma * PREMIO);

		System.out.println("Candidato 2: " + pontoC2/soma * PREMIO);

		System.out.println("Candidato 3: " + pontoC3/soma * PREMIO);
	}

}
