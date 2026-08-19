public class Analista extends Funcionario {
    private String especialidade;

    public Analista(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    
    public double calcularSalario() {
        return getSalario() * 1.15;
    }

    public void apresentarAnalista() {
        apresentar();
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário Final (com bônus): " + calcularSalario());
    }
}