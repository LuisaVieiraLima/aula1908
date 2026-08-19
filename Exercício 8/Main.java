public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Dr. Roberto", 45, 5500.0, "Banco de Dados");
        Analista analista = new Analista("Juliana", 30, 4500.0, "Eletrônica");
        Estagiario estagiario = new Estagiario("Carlos", 40, 1500.0, 120);

        System.out.println("====== Desenvolvedor ======");
        desenvolvedor.apresentarDesenvolvedor();

        System.out.println("\n====== Analista ======");
        analista.apresentarAnalista();

        System.out.println("\n====== Estagiario ======");
        estagiario.apresentarEstagiario();
    }
}