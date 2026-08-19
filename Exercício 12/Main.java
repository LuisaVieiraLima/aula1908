public class Main {
    public static void main(String[] args) {
        double distanciaKm = 120.0;

        Veiculo caminhao = new Caminhao("ABC-1234", "Volvo FH 540", 25000.0, 3);
        Veiculo van = new Van("DEF-5678", "Mercedes-Benz Sprinter", 1500.0, true);
        Veiculo moto = new Motocicleta("GHI-9012", "Honda CG 160", 30.0, 160);

        System.out.println("====== CÁLCULO DE FRETE (Distância: " + distanciaKm + " km) ======\n");

        caminhao.apresentarVeiculo();
        System.out.println("Valor do Frete: R$ " + caminhao.calcularFrete(distanciaKm));

        System.out.println("\n-----------------------------------\n");

        van.apresentarVeiculo();
        System.out.println("Valor do Frete: R$ " + van.calcularFrete(distanciaKm));

        System.out.println("\n-----------------------------------\n");

        moto.apresentarVeiculo();
        System.out.println("Valor do Frete: R$ " + moto.calcularFrete(distanciaKm));
    }
}