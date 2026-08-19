public class Funcionario{
    
    //Aributos
    String nomeDoFuncionario;
    String cargo;
    double salarioDoFuncionario;
    
    //Construtor
    public Funcionario(String nomeDoFuncionario, String cargo, double salarioDoFuncionario){
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.cargo = cargo;
        this.salarioDoFuncionario = salarioDoFuncionario;
    }
    
    //Getters
    public String getNomeDoFuncionario(){
        return nomeDoFuncionario;
    }
    public String getCargo(){
        return cargo;
    }
    public double getsalarioDoFuncionario(){
        return salarioDoFuncionario;
    }
    
    //Setters
    public void setNomeDoFuncionario(String nomeDoFuncionario){
        this.nomeDoFuncionario = nomeDoFuncionario;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setSalarioDoFuncionario (double salarioDoFuncionario){
        this.salarioDoFuncionario = salarioDoFuncionario;
    }
    
    
    //Metodo
    public void apresentar(){
        System.out.println("Nome do Funcionario: "+ nomeDoFuncionario);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Salario: "+ salarioDoFuncionario);
    }
}