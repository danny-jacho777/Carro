package negocio;

public class MainCarro {
    static void main() { //"psvm" y tab para crear el main automaticamente

        Carro c1 = new Carro();

    c1.setVelocidad(100);
    c1.setPotencia(5);

    System.out.println("La pontencia del carro es "+c1.getPotencia()+" y la velocidad es "+c1.getVelocidad());

    }
}
