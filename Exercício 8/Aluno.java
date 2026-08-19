public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private double notaFinal;

    // Construtor
    public Aluno(int matricula, String nome, String curso, double notaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    // Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Método
    public void verificarSituacao() {
        if (notaFinal >= 7.0) {
            System.out.println("Aprovado");
        } else if (notaFinal >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
