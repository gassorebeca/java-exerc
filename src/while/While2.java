/******************************************************************************

Escreva um programa para encontrar todos os números pares entre 1 e 100.

*******************************************************************************/
public class While2
{
	public static void main(String[] args) {
	  int number = 0;
	  
	  while(number <= 100){
	    if(number % 2 == 0) System.out.println(number);
	    
	    number ++;
	  }
	}
}


