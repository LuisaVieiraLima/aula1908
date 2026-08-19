public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Gabriel", 21, "20230198");
        Professor professor = new Professor("Dra. Helena", 45, "Computação");

        Livro livro1 = new Livro("Java: Como Programar", "Deitel", 2017);
        Livro livro2 = new Livro("Código Limpo", "Robert C. Martin", 2009);

        System.out.println("====== CADASTRO DE PESSOAS ======");
        aluno.apresentarAluno();
        System.out.println();
        professor.apresentarProfessor();

        System.out.println("\n====== OPERAÇÕES DE EMPRÉSTIMO ======");
        livro1.exibirInformacoes();
        livro1.emprestar(aluno);
        livro1.exibirInformacoes();

        System.out.println();
        livro1.emprestar(professor);

        System.out.println("\n====== OPERAÇÕES DE DEVOLUÇÃO ======");
        livro1.devolver();
        livro1.exibirInformacoes();
    }
}