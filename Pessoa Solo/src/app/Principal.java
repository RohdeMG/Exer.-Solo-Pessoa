package app;

public class Principal {
    public static void main(String[] args) throws Exception {
       
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];


        p[0] = new Pessoa("Marcos",25,"M");
        p[1] = new Pessoa("Carcamana",47,"F");
        

        l[0] = new Livro("Vai que dá", "Bukouski", 300, p[0]);
        l[1] =new Livro("Tartaruga que morre", "José Caval", 100, p[1]);
        l[2] =new Livro("Lá vivan de gastro", "Carry Monset", 850, p[0]);
        
        l[2].abrir();
        l[2].folhear(620);
        l[2].avarcarPag();
        System.out.println(l[2].detalhes()); //retorna uma string pq é public String

        System.out.println("\n");
        l[1].abrir();
        l[1].folhear(100);
        l[1].avarcarPag();
        System.out.println(l[1].detalhes());
    }
}