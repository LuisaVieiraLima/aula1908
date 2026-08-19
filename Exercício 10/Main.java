public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mariana Costa", 28, 3500.00);
        Funcionario funcionario = new Funcionario("Fernando Souza", 35, "Gerente de Vendas", 5200.00);

        System.out.println("====== DADOS DO CLIENTE ======");
        cliente.apresentarCliente();

        System.out.println("\n====== DADOS DO FUNCIONÁRIO ======");
        funcionario.apresentarFuncionario();
    }
}