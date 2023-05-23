package ICarrosSystem;

public class Main {
    public static void main(String[] args) {
        //Carro carro1= new Carro();


       Renault Sandero = new Renault("", "Azul", 2003, 4, 40.000,0);
       Fiat Uno = new Fiat("", "Vermelho", 2010, 4,15.000,0);
       Hyundai City = new Hyundai("", "Prata",2019,4,85.000,0);

       Sandero.iniciarPartidaMotor();
       Uno.acelerarCarro();
       City.frearCarro();


    }

    }

