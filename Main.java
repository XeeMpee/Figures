public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");

        Screen screen = new Screen(60, 60, '.', '*', true);
        
        Triangle triangle = new Triangle(new Point(-14,14),new Point(-14,3),new Point(0,0));
        triangle.draw(screen);

        Circle circle = new Circle(new Point(-14,-12),10);
        circle.draw(screen);

        Quadrangle quadrangle = new Quadrangle(new Point(10,15),new Point(20,15),new Point(15,20),new Point(5,20));
        quadrangle.draw(screen);

        Rectangle rectangle = new Rectangle(12,6,new Point(-40, 20),Placement.leftdowncorner);
    }
}