package ICarrosSystem;

public class Hyundai extends Carro{
    public Hyundai(String marca, String cor, int ano, int portas, double valor, double velocidade) {
        super("Hyundai", cor, ano, portas, valor, 5);
    }
    @Override
    public void iniciarPartidaMotor(){
        System.out.println("Iniciando motor... Minha velocidade está em: " + velocidade + "km/h");
    }

    @Override
    public void frearCarro(){
        if (!(velocidade <= 2)) {
            System.out.println("Freando... Minha velocidade está em " + (velocidade -= 2) + "km/h");
        }
        else {
            System.out.println("Carro parado!");
        }
    }
    @Override
    public void acelerarCarro(){
        System.out.println("Acelerando... minha velocidade está em " + (velocidade += 15) + "km/h");
    }

}
