public class Moto extends Veiculo{
    private String tipoPartida;
    
    public Moto(String marca, String modelo, int ano, String tipoPartida){
        super(marca, modelo, ano);
        this.tipoPartida = tipoPartida;
    }
    
    public String getTipoDePartida(){
        return tipoPartida;
    }
    public void apresentarMoto(){
        apresentar();
        System.out.println("Tipo de Partida: " +tipoPartida);
    }
  }