public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Point t1 = new Point(-10,14);
        Point t2 = new Point(4,-10);
        Point t3 = new Point(20,18);
        Triangle figure2 = new Triangle(t1,t2,t3);
        figure2.generateFigure(1);
        figure2.print();
    
        Screen newScreen = new Screen(60, 60, '.', '*', true);
        
        figure2.draw(newScreen);

    
    }
}