package SubClasses;

public class Preguica extends Animal{

	public Preguica(String nome, String idade, String som, String altura, String correr, String subirArvore)
	{
		super(nome, idade, som, altura, correr, subirArvore);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n Nome da Pregui�a: "+ getNome() + "\n Idade da Pregui�a: "+ getIdade()
		+ "\n Som da Pregui�a: "+ getSom() + "\n Altura da Pregui�a: " + getAltura() + "\n A��o da Pregui�a: "
				+ getSubirArvore());
	}

}
