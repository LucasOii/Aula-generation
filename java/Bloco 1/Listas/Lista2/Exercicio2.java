/* 2. Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

package ExerciciosLista2;

import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        Scanner leia = new Scanner (System.in);
		
		int n1,n2,n3;
		
		System.out.println("\n Entre com valor de n1: ");
		n1 = leia.nextInt();
		
		System.out.println("\n Entre com valor de n2: ");
		n2 = leia.nextInt();
		
		System.out.println("\n Entre com valor de n3: ");
		n3 = leia.nextInt();
		
		
		if (n1 <= n2 && n2 <= n3)
		{
			System.out.println(" Ordem crescente dos n�meros s�o n1:"+n1+", n2:"+n2+", n3:"+n3);
		}
		
		
		else if (n1 < n2 && n3 < n2)
		{
			System.out.println(" Ordem crescente dos n�meros s�o n1:"+n1+", n3:"+n3+", n2:"+n2);
		}
		
		else if (n2 < n3 && n3 < n1)
		{
			System.out.println(" Ordem crescente dos n�meros s�o n2:"+n2+", n3:"+n3+", n1:"+n1);
		}
		
		else if (n2 < n1 && n1 < n3)
		{
			System.out.println(" Ordem crescente dos n�meros s�o n2:"+n2+", n3:"+n1+", n3:"+n3);
		}
		
		else if (n3 < n2 && n2 < n1)
		{
			System.out.println(" Ordem crescente dos n�meros s�o n3:"+n3+", n2:"+n2+", n1:"+n1);
		}
		
		else if (n3 < n1 && n1 < n2)
		{
			System.out.println(" Ordem crescente dos n�meros s�o n3:"+n3+", n1:"+n1+", n2:"+n2);
		}
		
		else
		{
			System.out.println(" H� valores repetidos entre n1, n2 e n3:");//+n3+","+n1+","+n2);
		}
		
	}

}
