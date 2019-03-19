package escola;

public class CriarAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.matricula = 123456;
		a1.nome = "Lucas";
		a1.idade = 23;
		
		Aluno a2 = new Aluno();
		a2.matricula = 654321;
		a2.nome = "Juliana";
		a2.idade = 22;
		
		System.out.println("Primeiro aluno:");
		System.out.println("Matrícula: " + a1.matricula);
		System.out.println("Nome: " + a1.nome);
		System.out.println("Idade: " + a1.idade);
		
		System.out.println();
		
		System.out.println("Segundo aluno:");
		System.out.println("Matrícula: " + a2.matricula);
		System.out.println("Nome: " + a2.nome);
		System.out.println("Idade: " + a2.idade);
	}

}
