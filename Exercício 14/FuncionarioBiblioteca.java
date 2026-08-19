public class FuncionarioBiblioteca extends Usuario {
    public FuncionarioBiblioteca(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 10;
    }
}