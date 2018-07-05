public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Point t1 = new Point(3,4);
        Point t2 = new Point(10,15);
        Point t3 = new Point(24,18);
        Triangle figure2 = new Triangle(t1,t2,t3);
        figure2.generateFigure(1);
        figure2.print();
    }
}