package ICarrosSystem;

public class Fiat extends Carro{
    public Fiat(String marca, String cor, int ano, int portas, double valor, double velocidade){
        super("Fiat", cor, ano, portas, valor, 3);

    }

    @Override
    public void iniciarPartidaMotor(){
        System.out.println("Iniciando motor... Minha velocidade está em: " + velocidade + "km/h");
    }
    @Override
    public void frearCarro(){
        if (!(velocidade <= 6)) {
            System.out.println("Freando... Minha velocidade está em " + (velocidade -= 6) + "km/h");
        }
        else {
            System.out.println("Carro parado!");
        }
    }
    @Override
    public void acelerarCarro(){
        System.out.println("Acelerando... minha velocidade está em " + (velocidade += 12) + "km/h");
    }


}
