public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double calcularBonus() {
        return totalVendas * (comissao / 100);
    }
}