public class Gerente extends Funcionario {
    private double participacaoLucros;

    public Gerente(String nome, double salarioBase, double participacaoLucros) {
        super(nome, salarioBase);
        this.participacaoLucros = participacaoLucros;
    }

    public double calcularBonus() {
        return (getSalarioBase() * 0.20) + participacaoLucros;
    }
}