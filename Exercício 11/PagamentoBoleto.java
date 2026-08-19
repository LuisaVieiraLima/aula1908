public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String data, String descricao, String codigoBarras) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void processarPagamento() {
        System.out.println("Gerando Boleto Bancário...");
        System.out.println("Descrição: " + getDescricao() + " | Data: " + getData());
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Boleto no valor de R$ " + getValor() + " gerado. Aguardando compensação bancária (1 a 3 dias úteis).");
    }
}