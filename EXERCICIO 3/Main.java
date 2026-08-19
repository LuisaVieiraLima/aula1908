
public class Main
{
	public static void main(String[] args) {
	
	Livro livro1 = new Livro("Diários de uma Apotecária", "Natsu Hyūga",  297);
    
	livro1.setPaginas(200);
	
	System.out.println("Nome do livro: "+ livro1.getNomeLivro());
	System.out.println("Autot: "+ livro1.getAutor());
	System.out.println("Número de páginas: "+ livro1.getPaginas());
	
	}
}
