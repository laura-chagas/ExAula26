package ExemploOverrideComEntrada;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(); //obj mamifero - superclasse
        Gato gato = new Gato();//obj gato - subclasse
        Golfinho golfinho = new Golfinho();//obj golfinho - subclasse

       mamifero.amamentar(0); //metodo amamentar - superclasse
       mamifero.comer(0); //metodo comer - superclasse
       mamifero.tipoPelo(); //metodo tipopelo - superclasse
        System.out.println("---------------");

       gato.amamentar(3); //metodo amamentar - gato - subclasse
       gato.comer(2); //metodo comer - gato - subclasse
       gato.tipoPelo(); // metodo tipoPelo - gato - subclasse
         System.out.println("---------------");

       golfinho.amamentar(2); //metodo amamentar - golfinho - subclasse
       golfinho.comer(4); //metodo comer - golfinho - subclasse
       golfinho.tipoPelo(); // metodo tipoPelo - golfinho - subclasse
    }
}
