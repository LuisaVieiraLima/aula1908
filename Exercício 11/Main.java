public class Main {
    public static void main(String[] args) {
        Pagamento pix = new PagamentoPix(150.00, "19/08/2026", "Compra de Livro", "joao@email.com");
        Pagamento cartao = new PagamentoCartao(1200.00, "19/08/2026", "Notebook", "1234567890123456", 4);
        Pagamento boleto = new PagamentoBoleto(350.50, "19/08/2026", "Curso Online", "34191.79001 01043.510047 91020.150008 5 90000000035050");

        System.out.println("====== PROCESSANDO PAGAMENTOS ======\n");
        
        pix.processarPagamento();
        System.out.println("\n-----------------------------------\n");
        
        cartao.processarPagamento();
        System.out.println("\n-----------------------------------\n");
        
        boleto.processarPagamento();
    }
}