import java.util.ArrayList;

public class Figure {
    // Members:
    protected ArrayList<Point> points;
    
    
    // Constructor:
    public Figure(){
        this.points= new ArrayList<Point>();
    }

    // Methods:
    public void draw() {
        System.out.println("Drawing figure");
    }

}
