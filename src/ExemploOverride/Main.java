package ExemploOverride;

public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(); //obj mamifero - superclasse
        Gato gato = new Gato();//obj gato - subclasse
        Golfinho golfinho = new Golfinho();//obj golfinho - subclasse

       mamifero.amamentar(); //metodo amamentar - superclasse
       mamifero.comer(); //metodo comer - superclasse
       mamifero.tipoPelo(); //metodo tipopelo - superclasse
        System.out.println("---------------");

       gato.amamentar(); //metodo amamentar - gato - subclasse
       gato.comer(); //metodo comer - gato - subclasse
       gato.tipoPelo(); // metodo tipoPelo - gato - subclasse
       System.out.println("---------------");

       golfinho.amamentar(); //metodo amamentar - golfinho - subclasse
       golfinho.comer(); //metodo comer - golfinho - subclasse
       golfinho.tipoPelo(); // metodo tipoPelo - golfinho - subclasse
    }
}
