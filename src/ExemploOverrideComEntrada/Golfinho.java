package ExemploOverrideComEntrada;

public class Golfinho extends Mamifero {
//subclasse
    @Override
    public void amamentar(int qtde){
        System.out.println("Os Golfinhos amamentam " + (qtde) + " vezes ao dia e: " + (qtde * 30) + " vezes por mês");
    }
    @Override
    public void comer(int qtde){
        System.out.println("Os Golfinhos comem " +  (qtde) + " vezes ao dia e: " + (qtde * 30) + " vezes por mês");
    }
    @Override
    public void tipoPelo(){
        System.out.println("Os Golfinhos não possuem pelo");
    }
}
