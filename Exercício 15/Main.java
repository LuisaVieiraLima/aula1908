public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234", "Sedan Compacto", 120.0);
        Veiculo moto = new Moto("MTO-5555", "Scooter 125", 60.0);
        Veiculo suv = new SUV("XYZ-9876", "SUV Premium", 250.0, 40.0);

        int dias = 10;

        System.out.println("====== CÁLCULO DE LOCAÇÃO (" + dias + " DIAS) ======");
        
        carro.apresentarVeiculo();
        System.out.println("Total: R$ " + carro.calcularLocacao(dias));

        System.out.println("\n-----------------------------------\n");

        moto.apresentarVeiculo();
        System.out.println("Total: R$ " + moto.calcularLocacao(dias));

        System.out.println("\n-----------------------------------\n");

        suv.apresentarVeiculo();
        System.out.println("Total: R$ " + suv.calcularLocacao(dias));
    }
}