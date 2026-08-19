public class Desenvolvedor extends Funcionario {
    private String setor;

    public Desenvolvedor(String nome, int idade, double salario, String setor) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    
    public double calcularSalario() {
        return getSalario() * 1.5;
    }

    public void apresentarDesenvolvedor() {
        apresentar();
        System.out.println("Setor: " + setor);
        System.out.println("Salário Final (com bônus): " + calcularSalario());
    }
}