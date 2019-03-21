package escola;

public class Aluno {
	int matricula;
	String nome;
	int idade;
	double nota1;
	double nota2;
	
	public void exibeDados() {
		System.out.println("Dados do aluno:");
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Nota1: " + nota1);
		System.out.println("Nota2: " + nota2);
		System.out.println();
	}

	public double calculaMedia() {
		return (nota1 + nota2)/2;
	}
}
