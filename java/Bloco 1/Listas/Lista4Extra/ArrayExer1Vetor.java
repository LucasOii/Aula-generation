/* 1. Fa�a um programa que possua um vetor denominado A, que armazene 6 n�meros inteiros.
 *   O programa deve executar os seguintes passos:
 *   a) Atribuir os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
 *   b) Armazenar em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre
 *  na tela esta soma.
 *   c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
 *   d) Mostre na tela cada valor do vetor A, em um cada linha. 
 */

package Familia41;

import java.util.Scanner;

public class ArrayExer1Vetor
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [] A = {1, 0, 5, -2, -5, 7};
		int soma = 0;
		
		// A[0]= 1, A[1]= 0, A[2]= 5, A[3]= -2, A[4]= -5 e A[5]= 7
		soma = A[0] + A[1] + A[5];
		
		System.out.println("\n Digite um novo valor para A[4]");
		A[4] = leia.nextInt();
		
		System.out.println("\n A soma dos valores das pois��es do vetor A[0],[1] e [5] � de:"+soma);
		System.out.println("\n O valor do vetor na pois��o A[0] � de:"+A[0]);
		System.out.println("\n O valor do vetor na pois��o A[1] � de:"+A[1]);
		System.out.println("\n O valor do vetor na pois��o A[2] � de:"+A[2]);
		System.out.println("\n O valor do vetor na pois��o A[3] � de:"+A[3]);
		System.out.println("\n O valor do vetor na pois��o A[4] � de:"+A[4]);
		System.out.println("\n O valor do vetor na pois��o A[5] � de:"+A[5]);
		
		
	}
}
