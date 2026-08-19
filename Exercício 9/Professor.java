public class Professor extends Pessoa {
    private String departamento;

    public Professor(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void apresentarProfessor() {
        apresentar();
        System.out.println("Departamento: " + departamento);
    }
}