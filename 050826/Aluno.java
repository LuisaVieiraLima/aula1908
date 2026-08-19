public class Aluno{
    
    //Aributos
    String nome;
    int idade;
    String curso;
    
    //Construtor
    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    //Getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCurso(){
        return curso;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    
    //Metodo
    public void apresentar(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Curso: "+ curso);
    }
}