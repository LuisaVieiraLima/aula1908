public class Aluno extends Pessoa {
    private String curso;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, String curso, double nota1, double nota2) {
        super(nome, idade);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public void apresentarAluno() {
        apresentar();
        System.out.println("Curso: " + curso);
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
    }
}