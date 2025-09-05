import java.util.Scanner;

public class Prog14 {

	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    //Contantes
	    final double VALOR_HORA = 35.0, INSS = 0.08;
	    
	    //Variaveis
	    int qtdHora;  //inteiro
	    final double salarioBruto, desconto, salarioLiquido;
	    
	    System.out.println("-----------------------------");
	    System.out.println("Prog 14 - Calculo Salarial");
	    System.out.println("-----------------------------");
	    
	    System.out.print("inform a quantidade de horas trabalhadas:");
	    qtdHora = leitor.nextInt();
	    
	    salarioBruto = qtdHora * VALOR_HORA;
	    desconto = salarioBruto * INSS;
	    salarioLiquido = salarioBruto - desconto;
	    
	    System.out.println("-------------------------------");
	    System.out.println("-----------Holerith------------");
	    System.out.printf("\nSalario Bruto: R$ %.2f", salarioBruto);
	    System.out.printf("\nDesconto......: R$ %.2f", desconto);
	    System.out.printf("\nSalario Liquido: R$ %.2f", salarioLiquido);
	    System.out.printf("\n------------------------------");
	    
	   
	    leitor.close();
	    System.exit(0);
	   
	  

	}// fim do main

}// fim do programa

