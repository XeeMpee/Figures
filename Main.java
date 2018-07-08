public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");

        Screen screen = new Screen(60, 60, '.', '*', true);
        
        Triangle triangle = new Triangle(new Point(12,14),new Point(-14,3),new Point(0,0));
        triangle.draw(screen);

        Circle circle = new Circle(new Point(0,0),10);
        circle.draw(screen);
    
    }
}