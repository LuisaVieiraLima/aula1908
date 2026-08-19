public class Livro{
    
    //Aributos
    String nomeLivro;
    String autor;
    int paginas;
    
    //Construtor
    public Livro(String nomeLivro, String autor, int paginas){
        this.nomeLivro = nomeLivro; 
        this.autor = autor;
        this.paginas = paginas;
    }
    
    //Getters
    public String getNomeLivro(){
        return nomeLivro;
    }
    public  String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    
    //Setters
    public void setNomeLivro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
}