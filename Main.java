public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");

        Screen screen = new Screen(60, 60, '.', '*', true);
        
        Triangle triangle = new Triangle(new Point(12,14),new Point(-14,3),new Point(0,0));
        triangle.draw(screen);

        Circle circle = new Circle(new Point(-14,-12),10);
        circle.draw(screen);

        Quadrangle quadrangle = new Quadrangle(new Point(10,10),new Point(26,17),new Point(27,30),new Point(11,12));
        quadrangle.draw(screen);
    }
}