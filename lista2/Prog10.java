package lista2;
import java.util.Scanner;

public class Prog10 {

	public static void main(String[] args) {
		// Constantes
		 final int LIMITE1 = 15, LIMITE2 = 20;
		 final double PRECO1= 2.37, PRECO2 = 3.42, PRECO3 = 5.0;
		 final double ICMS = 0.25, PIS = 0.0077, COFINS = 0.0356 , DescontoProf = 0.1;
		 final String senha = "123";
		 
		 //VARIAVEIS
		 int consumo;
		 double VALOR_GAS, VALOR_ICMS, VALOR_PIS, VALOR_COFINS, CONTA;
		 String resposta, respostaSenha;
		 
		 Scanner reader = new Scanner(System.in);
		 
		 System.out.println("******Programa 10 - lista 02 **********");
		 System.out.println("\nCálculo da conta de Gás");
		 System.out.println("\nDIGITE O VALOR DA CONTA DE GAS : ");
		
		consumo = reader.nextInt();
		
		 System.out.println("Voce é professor (S/N) ");
		 resposta = reader.next();
		 
		  if (resposta != "S");
			  System.out.print("Qual a senha de Professor :");
			  respostaSenha = reader.next();
			  
			  if (respostaSenha != senha)
				  System.out.print("Resposta errada")
				  
				  else {}
		  
		 
		 
		 System.out.println("Digite a senha de professor");
		 
		 
		
		if(consumo <=LIMITE1) {
			VALOR_GAS = consumo * PRECO1;
		}else if (consumo <=LIMITE2){
			VALOR_GAS = consumo * PRECO2;
		}
		else {
			VALOR_GAS = consumo * PRECO3;
		}
		
		VALOR_ICMS = VALOR_GAS * ICMS;
		VALOR_PIS = VALOR_GAS * PIS;
		VALOR_COFINS = VALOR_GAS * COFINS;
		CONTA = VALOR_GAS + VALOR_ICMS + VALOR_PIS + VALOR_COFINS;
		System.out.println("\n\n-------------- CONTA------------");
		System.out.println("Valor do gás : " + VALOR_GAS);
		System.out.println("Valor do ICMS : " + VALOR_ICMS);
		System.out.println("Valor do PIS : " + VALOR_PIS);
		System.out.println("Valor do gás : " + VALOR_COFINS);
		System.out.println("Valor da Conta : " + CONTA);
		System.out.println("--------------------------");
	}

}
