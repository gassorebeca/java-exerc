// Escreva um programa que receba três números e retorne eles em ordem crescente.

import java.util.*;

public class OrdemCrescente{
  
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
		System.out.println("Adicione o primeiro numero:");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Adicione o segundo numeoro:");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Adicione o terceiro numero:");
		int terceiroNumero = scan.nextInt();
		
		if(primeiroNumero != segundoNumero && segundoNumero != terceiroNumero && terceiroNumero != primeiroNumero){
  		// menor numero
		  if(primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero){
  		  System.out.println(primeiroNumero);
  		}else if(segundoNumero < primeiroNumero && segundoNumero < terceiroNumero){
  		  System.out.println(segundoNumero);
  		} else {
  		  System.out.println(terceiroNumero);
  		}
		} else {
		  System.out.println("Adicione três números diferentes!");
		}

    scan.close();
	}
}


