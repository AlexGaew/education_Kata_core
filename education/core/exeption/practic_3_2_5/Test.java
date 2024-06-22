package exeption.practic_3_2_5;

public class Test {
    public static void main(String[] args) {

        try (Car car = new Car()) {
            car.drive();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
