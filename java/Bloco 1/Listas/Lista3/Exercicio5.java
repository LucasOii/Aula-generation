/* 5. Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 * No final, mostre a soma dos n�meros digitados. (DO...WHILE) 		
 */

package ExerciciosLista3;

import java.util.Scanner;

public class Exercicio5
{

	public static void main( String [] args)
	{
		// TODO Auto-generated method stub
		
        Scanner leia =  new  Scanner (System.in);
		
		int numero, somaNumero = 0;
		
		System.out.println(" \n Entre com um n�mero: ");
		
		numero = leia.nextInt();
		
		do
		{
			somaNumero += numero;
			System.out.println("\n Entre com um n�mero: ");
			numero = leia.nextInt();
		}
		
		while (numero != 0);
		
		System.out.println("\n A somat�ria dos n�meros informados foi de: "+somaNumero);

	}

}
