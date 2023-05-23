package ExemploOverride;

public class Golfinho extends Mamifero{
//subclasse
    @Override
    public void amamentar(){
        System.out.println("Os Golfinhos amamentam " + (6) + " vezes ao dia e: " + (6 * 30) + " vezes por mês");
    }
    @Override
    public void comer(){
        System.out.println("Os Golfinhos comem " +  (5) + " vezes ao dia e: " + (5 * 30) + " vezes por mês");
    }
    @Override
    public void tipoPelo(){
        System.out.println("Os Golfinhos não possuem pelo");
    }
}
