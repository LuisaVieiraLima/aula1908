public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void emprestar(Pessoa pessoa) {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso para " + pessoa.getNome() + ".");
        } else {
            System.out.println("O livro '" + titulo + "' não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já consta como disponível na biblioteca.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Ano: " + ano + " | Disponível: " + (disponibilidade ? "Sim" : "Não"));
    }
}