package app;


public interface Publicacao {


    //Métodos abstratos da minha interface, que serão programados dentro de Livro
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p); //parametro para saber até qual página folhear
    public abstract void avarcarPag();
    public abstract void voltarPag();
}