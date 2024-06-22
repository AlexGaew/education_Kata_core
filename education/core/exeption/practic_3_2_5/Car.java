package exeption.practic_3_2_5;

public class Car  implements AutoCloseable{

    public void close () {
        System.out.println("Машина закрывается");
    }

    public void drive () {
        System.out.println("Машина поехала");
    }
}
