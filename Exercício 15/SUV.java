public class SUV extends Veiculo {
    private double taxaSeguroObrigatorio;

    public SUV(String placa, String modelo, double valorDiaria, double taxaSeguroObrigatorio) {
        super(placa, modelo, valorDiaria);
        this.taxaSeguroObrigatorio = taxaSeguroObrigatorio;
    }

    public double calcularLocacao(int dias) {
        return (getValorDiaria() * dias) + (taxaSeguroObrigatorio * dias);
    }
}