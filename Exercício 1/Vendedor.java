public class Vendedor extends Funcionario{
    private int comissao;
    
    public Vendedor(String nome, int idade, String CPF, int comissao){
    super(nome, idade, CPF);
    this.comissao = comissao;
    }
    public int getComissao(){
        return comissao;
    }
    public void apresentarVendedor(){
        apresentar();
        System.out.println("Comissão: "+ comissao);
    }
}