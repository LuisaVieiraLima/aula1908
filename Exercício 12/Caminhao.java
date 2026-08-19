public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, String modelo, double capacidadeCarga, int eixos) {
        super(placa, modelo, capacidadeCarga);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public double calcularFrete(double distancia) {
        double taxaEixo = eixos * 50.0;
        return (distancia * 8.50) + taxaEixo;
    }
}