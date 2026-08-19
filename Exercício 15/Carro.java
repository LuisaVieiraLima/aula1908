public class Carro extends Veiculo {
    public Carro(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }


    public double calcularLocacao(int dias) {
        double valorTotal = getValorDiaria() * dias;
        if (dias > 7) {
            valorTotal *= 0.90;
        }
        return valorTotal;
    }
}