import java.util.Comparator;

/*
Point class is a class that represents Cartesion Point:
coords[0] = x
coords[1] = y
*/

public class Point {
    // Members:
    private int[] coords;

    // Constructors:
    public Point(){
        this.coords = new int[2];
    }
    
    public Point(int x, int y){
        this.coords = new int[2];
        this.coords[0] = x;
        this.coords[1] = y;

    }

    // Methods:
    public void setCoords(int x, int y){
        this.coords[0] = x;
        this.coords[1] = y;
    }

    public void set_x(int x){
        this.coords[0] = x;
    }

    public void set_y(int y){
        this.coords[1] = y;
    }

    public int[] getCoords(){
        return this.coords;
    }

    public int get_x(){
        return this.coords[0];
    }

    public int get_y(){
        return this.coords[1];
    }

    public void printPoint(){
        System.out.println("("+ this.coords[0] + "," + this.coords[1] + ")");
    }

}
