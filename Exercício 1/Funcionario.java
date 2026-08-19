public class Funcionario{
    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    
    public Funcionario(String nome, int idade, String cargo, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getSalario(){
        return salario;
    }
    public String getCargo(){
        return cargo;
    }
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Cargpo: "+ cargo);
    }
    
}
    