/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica Condicional em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *  4. Fa�a um programa em que permita a entrada de um n�mero e exiba se este n�mero � par ou �mpar. Se for par exiba 
 *  tamb�m a raiz quadrada do mesmo; Se for �mpar exiba o n�mero elevado ao quadrado. 
 */

package Lista2_Condicional;

import java.util.Scanner;

public class Exer4Condicional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		double resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println(" \nEntre com um numero: ");
		
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
		}		
		else {
			resultado = Math.pow(numero, 2);
		}		
		System.out.printf(" \nResultado �: %.2f", resultado);
	}
}
