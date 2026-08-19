public class Tecnico extends Funcionario {
    private int horasExtras;
    private double valorHoraExtra;

    public Tecnico(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularBonus() {
        return horasExtras * valorHoraExtra;
    }
}