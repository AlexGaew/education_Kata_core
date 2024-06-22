package Input_Output;


abstract class testAbstract {
    protected int x;
    protected int y;

    public testAbstract(int x, int y) {
        this.x = x; // обращаемся к полю x текущего объекта и присваиваем ему значение параметра x
        this.y = y; // обращаемся к полю y текущего объекта и присваиваем ему значение параметра y
    }

    public abstract void draw(); // абстрактный метод, который должен быть реализован в подклассах
}

class Circle extends testAbstract {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y); // вызываем конструктор родительского класса Shape для инициализации полей x и y
        this.radius = radius; // обращаемся к полю radius текущего объекта и присваиваем ему значение параметра radius
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с центром в точке (" + x + ", " + y + ") и радиусом " + radius);
    }
}


