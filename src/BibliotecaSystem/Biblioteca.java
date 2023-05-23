package BibliotecaSystem;

public class Biblioteca {
    private String nome;
    private int isbn;
    private String generoLivro;
    private String autorLivro;

    public void registrarLivro(int isbn){
        System.out.println("O livro foi registrado com o ISBN! " + "\nISBN: " + isbn );
    }
    public void registrarLivro(int isbn, String nome){
        System.out.println("O livro foi registrado com o ISBN e o Nome! " + "\nISBN: " + isbn + "\nNome: " + nome);
    }
    public void registrarLivro(int isbn, String nome, String generoLivro){
        System.out.println("O livro foi registrado o ISBN, o Nome e o Gênero" + "\nISBN: " + isbn + "\nNome: " + nome + "\nGênero: " + generoLivro);
    }
    public void registrarLivro(int isbn, String nome, String generoLivro, String autorLivro){
        System.out.println("O livro foi registrado com todos os atributos! " + "\nISBN: " + isbn + "\nNome: " + nome + "\nGênero: " + generoLivro + "\nAutor: " + autorLivro);
    }



}
