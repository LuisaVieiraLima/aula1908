public class Estagiario extends Funcionario {
    private int horasCumpridas;

    public Estagiario(String nome, int idade, double salario, int horasCumpridas) {
        super(nome, idade, salario);
        this.horasCumpridas = horasCumpridas;
    }

    public int getHorasCumpridas() {
        return horasCumpridas;
    }

    public double calcularSalario() {
        return getSalario() + 200.00;
    }

    public void apresentarEstagiario() {
        apresentar();
        System.out.println("Horas Cumpridas: " + horasCumpridas);
        System.out.println("Salário Final (com auxílio): " + calcularSalario());
    }
}