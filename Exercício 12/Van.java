public class Van extends Veiculo {
    private boolean refrigerada;

    public Van(String placa, String modelo, double capacidadeCarga, boolean refrigerada) {
        super(placa, modelo, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public double calcularFrete(double distancia) {
        double taxaRefrigeracao = refrigerada ? 50.0 : 0.0;
        return (distancia * 4.00) + 30.0 + taxaRefrigeracao;
    }
}