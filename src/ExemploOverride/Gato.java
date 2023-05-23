package ExemploOverride;

public class Gato extends Mamifero{
    //subclasse
    @Override
    public void amamentar(){
        System.out.println("Os Gatos amamentam " + (3) + " vezes ao dia e: " + (3 * 30) + " vezes por mês");
    }
    @Override
    public void comer(){
        System.out.println("Os Gatos comem " + (4) + " vezes ao dia e: " + (4 * 30) + " vezes por mês");
    }

    @Override
    public void tipoPelo(){
        System.out.println("Os Gatos possuem pelos curtos. ");
    }

}
