public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, int codigo, double preco, String dataValidade) {
        super(nome, codigo, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void apresentarAlimento() {
        apresentar();
        System.out.println("Data de Validade: " + dataValidade);
    }
}