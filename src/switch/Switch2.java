/******************************************************************************

Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. 
Faça um programa que calcule o valor total a ser pago por uma pessoa. 
O programa deverá ler o valor total da compra efetuada e um código que identifique se o
comprador é um cliente comum (1), funcionário (2) ou vip (3).

*******************************************************************************/
import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
		System.out.println("Digite o valor total da compra:");
		double valorTotal = scan.nextDouble();
		
		System.out.println("Digite seu condigo de identificação:");
		System.out.println(" 1. Cliente comum \n 2. Funcionário  \n 3. Cliente vip");
		int codIndentifica = scan.nextInt();
		
		int descontoFuncionario = 10;
		int descontoVip = 5;
		double valorComDesconto = 0;
		boolean identificado = false;
		
		switch(codIndentifica){
		  case 1:
		    valorComDesconto = valorTotal;
		    identificado = true;
		    break;
		  case 2:
		    valorComDesconto = valorTotal - (valorTotal*descontoFuncionario)/100;
		    identificado = true;
		    break;
		  case 3:
		    valorComDesconto = valorTotal - (valorTotal*descontoVip)/100;
		    identificado = true;
		    break;
		  default:
	  		System.out.println("Codigo de identificação invalido!");
        break;
		}
		
		if (identificado) 
		  System.out.println("Valor total a ser pago: R$" + valorComDesconto);
	}
}


