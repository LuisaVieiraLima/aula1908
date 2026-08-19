public class Main {
    public static void main(String[] args) {
        Usuario aluno = new Aluno("Gabriel Santos", "ALU123");
        Usuario professor = new Professor("Dra. Renata", "PROF456");

        System.out.println("====== TESTE DE EMPRÉSTIMOS (ALUNO - LIMITE: 3) ======");
        aluno.realizarEmprestimo("Estrutura de Dados");
        aluno.realizarEmprestimo("Java Efetivo");
        aluno.realizarEmprestimo("Arquitetura Limpa");
        aluno.realizarEmprestimo("Engenharia de Software");

        System.out.println("\n====== TESTE DE DEVOLUÇÃO ======");
        aluno.devolverLivro("Java Efetivo");
        aluno.realizarEmprestimo("Engenharia de Software");

        System.out.println("\n====== TESTE DE EMPRÉSTIMOS (PROFESSOR - LIMITE: 5) ======");
        professor.realizarEmprestimo("Inteligência Artificial");
        professor.realizarEmprestimo("Redes de Computadores");
    }
}