public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String data, String descricao, String numeroCartao, int parcelas) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void processarPagamento() {
        double valorParcela = getValor() / parcelas;
        System.out.println("Processando Cartão de Crédito...");
        System.out.println("Descrição: " + getDescricao() + " | Data: " + getData());
        System.out.println("Cartão: final " + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Pagamento de R$ " + getValor() + " aprovado em " + parcelas + "x de R$ " + valorParcela);
    }
}