public class Gerente extends Funcionario{
    private int quantidadeFuncionarios;
    private double bonus;
    
    public Gerente(String nome, double salario, String setor, int quantidadeFuncionarios, double bonus){
        super(nome, salario, setor);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.bonus = bonus;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public double getBonus(){
        return bonus;
    }

    public void apresentarGerente(){
        apresentar();
        System.out.println("Quantidade de Funcionários supervisionados: "+ quantidadeFuncionarios);
        System.out.println("Percentual de bônus: "+ bonus);
    }
}