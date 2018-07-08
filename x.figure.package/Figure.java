import java.util.ArrayList;

public class Figure {
    // Members:
    protected ArrayList<Point> points;
    
    
    // Constructor:
    public Figure(){
        this.points= new ArrayList<Point>();
    }

    // Methods:

    public ArrayList<Point> getPoints(){
        return this.points;
    }
    public void print() {
        System.out.println("Figure points:");
        String output = new String();
        for(Point i : points){
            output += "(" + i.get_x() + ";" + i.get_y() + "),";
        }
        output = output.substring(0, output.length()-1);
        System.out.println(output);
    }

    public void draw(Screen screen, int step){
        this.generateFigure(step);
        screen.placePoints(this.points);
        screen.draw();
    }

    public void draw(Screen screen){
        this.draw(screen, 1);
    }

    public void generateFigure(int step){

    }

    public void generateFigure(){
        this.generateFigure(1);
    }

}
