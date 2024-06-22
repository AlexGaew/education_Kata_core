package oop;

public class LazyStudent extends Student {

    public LazyStudent() {
        super("");
    }

    @Override
    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }
}
