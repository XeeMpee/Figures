import java.util.ArrayList;

public class Screen {
    // Members:
    private int width;
    private int height;
    private char[][] Table;
    private char normalSign;
    private char drawedSign;
    boolean axises;

    // Constructor:
    Screen(int width, int height, char normalSign, char drawedSign, boolean axises){
        this.Table = new char[height][width];
        this.width = width;
        this.height = height;
        this.normalSign=normalSign;
        this.drawedSign=drawedSign;
        this.clear();

        if(axises = true){
            this.axises = true;
        } else {
            this.axises = false;
        }
    }

    Screen(int width, int height, char normalSign, char drawedSign){
        this(width,height,normalSign,drawedSign,true);
    }

    // Methods:
    private Point offsetPoint(Point p){
        int x = p.get_x();
        int y = p.get_y(); 
        int newX = (int)(x+0.5*this.width);
        int newY = (int)(0.5*this.height - y);
        Point newPoint = new Point(newX, newY);
        return newPoint;
    }

    public void draw() {
        for (char[] i : this.Table){
            for (char j : i){
                System.out.printf("%c",j);
            }
            System.out.println();
        }
    }

    public void placeAxises(){
        for(int i=0; i<this.width; i++){
            this.Table[(int)(0.5*height)][i] = '-';
        }

        for(int i=0; i<this.height; i++){
            this.Table[i][(int)(0.5*this.width)] = '|';
        }
    }

    public void clear(){
        for(int i=0; i<this.Table.length; i++){
            for(int j=0; j<this.Table[i].length; j++){
                this.Table[i][j] = this.normalSign;
            }
        }
        
        if(this.axises = true){
            this.placeAxises();
        }
    }

    public void placePoints(ArrayList<Point> pointArray){
        for(Point i : pointArray){
            Point tmpPoint = offsetPoint(i);
            this.Table[tmpPoint.get_y()][tmpPoint.get_x()] = this.drawedSign;
        }
    }

    public void testDraw(){
        this.Table[10][10] = '*';
    }
}