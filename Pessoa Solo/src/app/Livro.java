package app;


public class Livro {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;


    public void detalhes(){

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

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return this.leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir(){
    
    }

    @Override
    public void fechar(){
    
    }
    @Override
    public void folhear(){
    
    }
    @Override
    public void avarcarPag(){
    
    }
    @Override
    public void voltarPag(){
    
    }

}