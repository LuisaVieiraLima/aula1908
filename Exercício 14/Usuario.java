public abstract class Usuario {
    private String nome;
    private String matricula;
    private int livrosEmprestados;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.livrosEmprestados = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public abstract int getLimiteEmprestimos();

    public boolean verificarLimiteEmprestimos() {
        return livrosEmprestados < getLimiteEmprestimos();
    }

    public void realizarEmprestimo(String tituloLivro) {
        if (verificarLimiteEmprestimos()) {
            livrosEmprestados++;
            System.out.println("Empréstimo do livro '" + tituloLivro + "' realizado para " + nome + ".");
            System.out.println("Livros retirados: " + livrosEmprestados + "/" + getLimiteEmprestimos());
        } else {
            System.out.println("Empréstimo recusado para " + nome + ": Limite máximo de " + getLimiteEmprestimos() + " livros atingido!");
        }
    }

    public void devolverLivro(String tituloLivro) {
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
            System.out.println("Livro '" + tituloLivro + "' devolvido por " + nome + ".");
            System.out.println("Livros pendentes: " + livrosEmprestados + "/" + getLimiteEmprestimos());
        } else {
            System.out.println(nome + " não possui livros pendentes para devolução.");
        }
    }
}