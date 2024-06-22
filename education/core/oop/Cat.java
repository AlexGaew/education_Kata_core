package oop;

public class Cat extends Aninal {


    public void sayHello() {
        System.out.println("Мяу!");
    }

    @Override
    public void sayMau(int b) {
        super.sayMau(b);
    }

    @Override
    public String sayMau(double b) {
        return super.sayMau(b);
    }

    @Override
    public void sayMau() {
        super.sayMau();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
