package BibliotecaSystem;

public class Main {
    public static void main(String[] args) {

        Biblioteca livro1 = new Biblioteca();
        Biblioteca livro2 = new Biblioteca();
        Biblioteca livro3 = new Biblioteca();
        Biblioteca livro4 = new Biblioteca();

        livro1.registrarLivro(123456);
        System.out.println("---------------------");
        livro2.registrarLivro(7891011, "A Revolução dos Bichos");
        System.out.println("---------------------");
        livro3.registrarLivro(654321, "Os Sete","Fantasia");
        System.out.println("---------------------");
        livro3.registrarLivro(654321, "A Culpa é das Estrelas","Romance");
        System.out.println("---------------------");
        livro3.registrarLivro(654321, "A Parte que falta","Aventura");
        System.out.println("---------------------");
        livro4.registrarLivro(859508, "O Hobbit", "Fantasia", "J.R.R. Tolkien");


    }
}
