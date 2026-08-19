public class Main
{
	public static void main(String[] args) {
		Aluno aluno =  new Aluno("Marta", 18, "Desenvolvimento de Sistemas");
		Professor professor = new Professor("Carlos", 35, "Banco de Dados");
		
		System.out.println("=============Aluno==============");
		aluno.apresentarAluno();
		System.out.println();
		System.out.println("=============Professor==============");
		professor.apresentarProfessor();
		
	}
}





