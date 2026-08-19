public class Caminhao extends Veiculo{
    private int carga;
    
    public Caminhao(String marca, String modelo, int ano, int carga){
        super(marca, modelo, ano);
        this.carga = carga;
    }
    
    public int getCarga(){
        return carga;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void apresentarCaminhao(){
        apresentar();
        System.out.println("Capacidade de carga (em toneladas): " +carga);
    }
  }