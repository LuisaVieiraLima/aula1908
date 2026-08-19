public class Produto{
    
    //Atributos
    String nomeDoProduto;
    double preco;
    int quantidade;
    
    //Construtor
    public Produto(String nomeDoProduto, double preco, int quantidade){
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    //Getters
    public String getNomeDoProduto(){
        return nomeDoProduto;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    
    //Setters
    public void setNomeDoProduto(String nomeDoProduto){
        this.nomeDoProduto = nomeDoProduto;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    
    //Metodo
    public void exibirDados(){
        System.out.println("Nome do Produto: "+ nomeDoProduto);
        System.out.println("Preço: "+ preco);
        System.out.println("Quantidade: "+ quantidade);
    }
}