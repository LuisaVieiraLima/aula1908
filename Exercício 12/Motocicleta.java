public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String placa, String modelo, double capacidadeCarga, int cilindradas) {
        super(placa, modelo, capacidadeCarga);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public double calcularFrete(double distancia) {
        return distancia * 1.80;
    }
}