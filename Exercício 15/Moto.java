public class Moto extends Veiculo {
    public Moto(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    public double calcularLocacao(int dias) {
        double valorTotal = getValorDiaria() * dias;
        return valorTotal * 0.95;
    }
}