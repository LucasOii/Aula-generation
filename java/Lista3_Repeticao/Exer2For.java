/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica Repeti��o em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *
 *  2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
 
package Lista3_Repeticao;

import java.util.*;

public class Exer2For {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int i, num, par = 0, impar = 0;
		
		for(i = 1; i <= 10; x++){
			System.out.printf(" \nInsira um n�mero qualquer: ");
			num = leia.nextInt();
			if(num % 2 == 0){
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println(" \nA quantidade de n�meros pares � " +par+ " e de n�meros �mpares � " +impar+ ".");		
	}
}
