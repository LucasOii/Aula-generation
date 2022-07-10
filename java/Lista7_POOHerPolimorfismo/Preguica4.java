/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica POOHeran�a e Polimorfismo em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *
 *  2) Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior
 *  e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente 
 *  do tipo de animal.
 *
 *  ---VERS�O 2---
 *  class Preguica4.
 */

package Lista7_POOHerPolimorfismo;

public class Preguica4 extends Animal4 {

	public Preguica4(String nome, int idade) {
		super(nome, idade);
	}
	
	public void cadastro() {
		System.out.println("\n--------------CADASTRO--------------\n");
		System.out.println("A pregui�a se chama "+this.getNome()+".");
		System.out.println("E tem "+this.getIdade()+" anos.");
		System.out.println("\n-------------------------------------");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nA pregui�a "+this.getNome()+" est� tranquila...");
		System.out.println("Apenas emito som se estiver em amea�a...*bocejo*");
	}

	@Override
	public void locomover() {
		System.out.println("\nA pregui�a "+this.getNome()+" se locomove...");
		System.out.println("Beeeeeeeeem devagar...");
	}
	
	public void subir() {
		System.out.println("\nA pregui�a sobe em �rvores...");
	}

}
