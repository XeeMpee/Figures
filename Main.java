public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Figure figure1 = new Figure();
        figure1.draw();

        Point t1 = new Point(3,4);
        Point t2 = new Point(1,5);
        Point t3 = new Point(5,6);
        Triangle figure2 = new Triangle(t1,t2,t3);
        figure2.generateFigure();
    }
}