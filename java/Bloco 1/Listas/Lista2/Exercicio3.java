/* 3. Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
 * [10-14]- infantil;
 * [15-17]- juvenuil;
 * [18-25]- adulto.
 */

package ExerciciosLista2;

import java.util.Scanner;

public class Exercicio3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("\n Digite a sua idade:");
		idade = leia.nextInt();
		
		if (idade>= 10 && idade <15)
		{
			System.out.println("\n A sua categoria � a infantil!! ");
		}
		
		else if (idade >= 15 && idade < 18)
		{
			System.out.println("\n A sua categoria � a juvenil!! ");
		}
		
		else if (idade >= 18 && idade < 26)
		{
			System.out.println("\n A sua categoria � a adulto!! ");
		}
		
		else
		{
			System.out.println("\n Voc� n�o se enquadra nas categorias citadas acima!!");
		}
	}
}
