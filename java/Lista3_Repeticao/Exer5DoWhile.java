/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica Repeti��o em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *
 *  5. Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados. (DO...WHILE) 		
 */

package Lista3_Repeticao;

import java.util.Scanner;

public class Exer5DoWhile {
	public static void main( String [] args) {
		// TODO Auto-generated method stub
		
        Scanner leia =  new  Scanner (System.in);
		
		int numero, somaNumero = 0;
		
		System.out.println(" \nEntre com um n�mero: ");
		
		numero = leia.nextInt();		
		do {
			somaNumero += numero;
			System.out.println(" \nEntre com um n�mero: ");
			numero = leia.nextInt();
		}		
		while (numero != 0);		
		System.out.println(" \nA somat�ria dos n�meros informados foi de: " +somaNumero);
	}
}
