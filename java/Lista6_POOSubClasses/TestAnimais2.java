/** Referencia: Generation Brasil- BootCamp- Bloco 1- L�gica POOSubClasses em JAVA
 *  Autor: Lucas Oi- 01/2022..
 *
 * 1) Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
 * (observe a tabela), utilize os seus conhecimentos e distribua as caracter�sticas de forma que
 * tudo o que for comum a todos os animais fique na classe Animal:
 *
 * ---VERS�O 2---
 * class TestAnimais2.
 */

package Lista6_POOSubClasses;

public class TestAnimais2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro c = new Cachorro("Billy", 1, "auau", true);
		Cavalo cv = new Cavalo("P� de Pano", 6, "irrirronh�rro", true);
		Preguica p = new Preguica("Dori", 2, "*bocejo*", true);
		
		c.imprimir();
		cv.imprimir();
		p.imprimir();
	}

}
