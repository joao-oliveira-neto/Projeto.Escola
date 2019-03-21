package escola;

public class CalculaMediaDoAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Luana";
		aluno1.nota1 = 7.5;
		aluno1.nota2 = 6.2;
		
		double media = aluno1.calculaMedia();
		System.out.println("Media: " + media);

	}

}
