public class Main {
    public static void main(String[] args) {
        
        int screenWidth = 60;
        int screenHight = 60;
        
        System.out.println((new String(new char[screenWidth])).replace('\0', '-'));
        System.out.println("Hello World! I presents you drawing program:");
        System.out.println((new String(new char[screenWidth])).replace('\0', '-'));

        Screen screen = new Screen(60, 60, '.', '*', true);
        
        Triangle triangle = new Triangle(new Point(-14,14),new Point(-14,3),new Point(0,0));
        triangle.draw(screen);
        
        Circle circle = new Circle(new Point(-14,-12),10);
        circle.draw(screen);

        Quadrangle quadrangle = new Quadrangle(new Point(10,15),new Point(20,15),new Point(15,20),new Point(5,20));
        quadrangle.draw(screen);

        Rectangle rectangle = new Rectangle(20,6, new Point(-5, 15),Placement.rightupcorner);
        rectangle.draw(screen);

        Square square = new Square(10, new Point(15,-10), Placement.center);
        square.draw(screen);


    }
}