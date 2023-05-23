package ExemploOverrideComEntrada;

public class Gato extends Mamifero {
    //subclasse
    @Override
    public void amamentar(int qtde){
        System.out.println("Os Gatos amamentam " + qtde + " vezes ao dia e: " + (qtde * 30) + " vezes por mês");
    }
    @Override
    public void comer(int qtde){
        System.out.println("Os Gatos comem " + (qtde) + " vezes ao dia e: " + (qtde * 30) + " vezes por mês");
    }

    @Override
    public void tipoPelo(){
        System.out.println("Os Gatos possuem pelos curtos ");
    }

}
