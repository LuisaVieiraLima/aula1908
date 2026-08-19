public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String data, String descricao, String chavePix) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    
    public void processarPagamento() {
        System.out.println("Processando PIX...");
        System.out.println("Descrição: " + getDescricao() + " | Data: " + getData());
        System.out.println("Chave PIX: " + chavePix);
        System.out.println("Pagamento de R$ " + getValor() + " aprovado instantaneamente via PIX!");
    }
}