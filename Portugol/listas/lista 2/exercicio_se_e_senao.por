programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)
		
		media=(nota1+nota2+nota3)/3

		escreva("\nSua média é: ",mat.arredondar(media,1))

		se(media>=7.0 e media<=10.0)
		{
			escreva("\nAlune Aprovado!! ")
		}
		senao se(media>=5.0 e media<7.0)
		{
			escreva("\nAlune de exame!! ")
		}
		senao se (media>=0.0 e media<5.0)
		{
			escreva("\nAlune Reprovade!! ")
		}
		senao
		{
			escreva("\nMédia fora do intervalo permitido!! ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */