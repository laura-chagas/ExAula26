package ICarrosSystem;

public class Renault extends Carro{

    public Renault(String marca, String cor, int ano, int portas, double valor, double velocidade){
        super("Renault", cor, ano, portas, valor, 0);

    }

    public void setVelocidade(){
        this.velocidade = velocidade;
    }
    @Override
    public void iniciarPartidaMotor(){

        System.out.println("Iniciando motor... Minha velocidade está em: " + velocidade + "km/h");

    }
    @Override
    public void frearCarro(){
        if (!(velocidade == 0)) {
            System.out.println("Freando... Minha velocidade está em " + (velocidade -= 5) + "km/h");
        }
        else {
            System.out.println("Carro parado!");
        }
    }
    public void acelerarCarro(){
        System.out.println("Acelerando... minha velocidade está em " + (velocidade += 10) + "km/h");
    }
}

