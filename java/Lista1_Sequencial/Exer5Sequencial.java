/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica Sequencial em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *  
 *  5) Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
 *  Considerar que a m�dia � ponderada e que o peso das notas �: 2, 3 e 5, respectivamente.
 */

package Lista1_Sequencial;

import java.util.Scanner;

public class Exer5Sequencial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, mediaPond;
		
		System.out.println(" \nInforme a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println(" \nInforme a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println(" \nInforme a nota 3: ");
		nota3 = leia.nextFloat();
		
		mediaPond = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		System.out.println(" \nSua nota m�dia �: " +mediaPond);
	}
}
