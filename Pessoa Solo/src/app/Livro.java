package app;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "titulo=" + getTitulo() + "\n" + "autor=" + getAutor() + "\n" + "totPaginas=" + getTotPaginas() + "\n"
                + "pagAtual=" + pagAtual + "\n" + "aberto=" + aberto + "\n" + "leitor=" + leitor.getNome() + "\n"
                + "sexo=" + leitor.getSexo() + "\n" + "idade=" + leitor.getIdade();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) { // pessoa é da classe Pessoa
        this.leitor = leitor;
    }

    // AQUI QUE É IMPLEMENTADO OS MÉTODOS DA INTERFACE PUBLICAÇÃO
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {

        if (p > this.getTotPaginas()) {
            this.pagAtual = 0;
            System.out.println("Não pode folhear até essa página");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avarcarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}