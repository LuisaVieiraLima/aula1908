public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos Andrade", 20, "Análise e Desenvolvimento de Sistemas", 8.5, 7.0);
        Professor professor = new Professor("Ana Maria", 42, "Programação Orientada a Objetos", 6500.00);

        System.out.println("====== DADOS DO ALUNO ======");
        aluno.apresentarAluno();

        System.out.println("\n====== DADOS DO PROFESSOR ======");
        professor.apresentarProfessor();
    }
}