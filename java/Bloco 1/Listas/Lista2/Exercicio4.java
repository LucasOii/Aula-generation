/* 4. Fa�a um programa em que permita a entrada de um n�mero e exiba se este n�mero � par ou �mpar. Se for par exiba 
 * tamb�m a raiz quadrada do mesmo; Se for �mpar exiba o n�mero elevado ao quadrado. 
 */

package ExerciciosLista2;

import java.util.Scanner;

public class Exercicio4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int numero;
		double resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com um numero: ");
		
		numero = leia.nextInt();
		
		if(numero % 2 ==0)
		{
			resultado = Math.sqrt(numero);
		}
		
		else
		{
			resultado = Math.pow(numero,2);
		}
		
		System.out.printf("\n Resultado �: %.2f", resultado);
	}
}
