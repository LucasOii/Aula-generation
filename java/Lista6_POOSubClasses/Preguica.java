/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica POOSubClasses em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *
 * 1) Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
 * (observe a tabela), utilize os seus conhecimentos e distribua as caracter�sticas de forma que
 * tudo o que for comum a todos os animais fique na classe Animal:
 *
 * class Preguica.
 */

package Lista6_POOSubClasses;

public class Preguica extends Animal{

	public Preguica(String nome, String idade, String som, String altura, String correr, String subirArvore) {
		super(nome, idade, som, altura, correr, subirArvore);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirInfo() {
		System.out.println("\n Nome da Pregui�a: "+ getNome() + "\n Idade da Pregui�a: "+ getIdade()
		+ "\n Som da Pregui�a: "+ getSom() + "\n Altura da Pregui�a: " + getAltura() + "\n A��o da Pregui�a: "
				+ getSubirArvore());
	}
}
