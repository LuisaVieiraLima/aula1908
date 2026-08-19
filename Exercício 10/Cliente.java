public class Cliente extends Pessoa {
    private double limiteCredito;

    public Cliente(String nome, int idade, double limiteCredito) {
        super(nome, idade);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void apresentarCliente() {
        apresentar();
        System.out.println("Limite de Crédito: R$ " + limiteCredito);
    }
}