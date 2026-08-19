public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    
    public void apresentarProfessor() {
        apresentar();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
    }
}