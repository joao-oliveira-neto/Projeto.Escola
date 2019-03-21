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
		
		a1.exibeDados();
		a2.exibeDados();
	}

}
