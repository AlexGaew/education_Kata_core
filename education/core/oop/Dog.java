package oop;

public class Dog extends Aninal {

    public void sayHello(){
        System.out.println("Гав!");
    }

    public void catchCat (Cat cat){
        System.out.println("Кошка поймана");
        sayHello();
        cat.sayHello();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
