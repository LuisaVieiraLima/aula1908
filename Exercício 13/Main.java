public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos Andrade", 8000.00, 2500.00);
        Funcionario vendedor = new Vendedor("Beatriz Lima", 2500.00, 50000.00, 5.0);
        Funcionario tecnico = new Tecnico("Diego Rocha", 3500.00, 15, 45.00);

        System.out.println("====== DEMONSTRATIVO DE PAGAMENTO ======\n");
        
        gerente.exibirDemonstrativo();
        System.out.println("\n-----------------------------------\n");

        vendedor.exibirDemonstrativo();
        System.out.println("\n-----------------------------------\n");

        tecnico.exibirDemonstrativo();
    }
}