public class Funcionario{
    private String nome;
    private int idade;
    private String CPF;
    
    public Funcionario(String nome, int idade, String CPF){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCPF(){
        return CPF;
    }
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + CPF);
    }
    
}