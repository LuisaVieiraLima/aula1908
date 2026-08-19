public class Coordenador extends Pessoa{
    private String cursoResponsavel;
    
    public Coordenador(String nome, int idade, String cursoResponsavel){
        super(nome, idade);
        this.cursoResponsavel = cursoResponsavel;
        
        }
        public String getCursoResponsavel(){
            return cursoResponsavel;
        }
        
        public void apresentarCoordenador(){
            apresentar();
            System.out.println("Curso Responsável " +cursoResponsavel);
    }
}