/******************************************************************************

Faça um programa de conversão de moedas. O programa deverá apresentar uma tela de entrada com as seguintes opções:

< Conversão de moedas >

1 - Real para Dólar
2 - Dólar para Real
3 - Real para Euro
4 - Sair

Lembre que, você deve informar as opções para que a partir da opção escolhida, 
o programa deve pedir o número na base escolhida, lê-lo e apresentá-lo na base desejada.

O programa só irá se encerrar quando você digitar a opção 4.

*******************************************************************************/

//https://www.homeandlearn.co.uk/java/java_formatted_strings.html

import java.util.Scanner;

public class Switch3
{
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("< Conversão de moedas >");
		
    System.out.println("Digite o valor base a ser convertido: ");
    double valorBase = scan.nextDouble();
    
    System.out.println(" 1 - Real para Dólar \n 2 - Dólar para Real \n 3 - Real para Euro \n 4 - Sair");
    int opcaoEscolhida = scan.nextInt();
    
    double valorConvertido = 0;

	  do{
	    switch(opcaoEscolhida){
	      case 1: // real pra dolar
	        valorConvertido = valorBase / 5.55;
    	    System.out.printf("Valor em dolares é R$  R", valorConvertido);
	        break;
	        
	      case 2: // dolar pra real
	        valorConvertido = valorBase * 5.55;
    	    System.out.printf("Valor em reais é R$ %.2f", valorConvertido);
    	    break;
	        
	      case 3: // real pra euro
	        valorConvertido = valorBase / 6.43;
    	    System.out.printf("Valor em euros é R$ %.2f", valorConvertido);
    	    break;
	      
	      case 4: 
	        break;
	        
	     default:
	        System.out.println("Valor invalido!");
	        break;
	    }
	    
  		System.out.println("\n 1 - Real para Dólar \n 2 - Dólar para Real \n 3 - Real para Euro \n 4 - Sair");
  		opcaoEscolhida = scan.nextInt();
	    
	  } while(opcaoEscolhida != 4);
	}
}
