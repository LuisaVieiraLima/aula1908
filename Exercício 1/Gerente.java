public class Gerente extends Funcionario{
    private String setor;
    private double salario;
    
    public Gerente(String nome, int idade, String CPF, String setor, double salario){
        super(nome, idade, CPF);
        this.setor = setor;
        this.salario = salario;
    }
    public String getSetor(){
        return setor;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }       
    public void apresentarGerente(){
        apresentar();
        System.out.println("Setor: "+ setor);
        System.out.println("Salário: "+ salario);
    }
}