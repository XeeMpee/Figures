import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.management.RuntimeErrorException;


public class Triangle extends Figure {
    
    // Members:
    private Point A;
    private Point B;
    private Point C;
    
    // Constructors:
    public Triangle(Point A, Point B, Point C){
        super();
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Triangle(int[] A, int[] B, int[] C, int[] D){
        super();
        if(A.length != 2 || B.length != 2 || C.length != 2){
            Error e = new Error("Points is an one dimension table with two records: [x,y]!");
            throw new RuntimeErrorException(e);
        } else {
            Point pointA = new Point(A[0], A[1]);
            Point pointB = new Point(B[0], B[1]);
            Point pointC = new Point(C[0], C[1]);
            this.A = pointA;
            this.B = pointB;
            this.C = pointC;
        }
    }

    // Methods:
    @Override
    public void generateFigure(int step){
        // Line AB
        // Line BC
        // Line CA

        Line line1 = null;
        Line line2 = null;
        Line line3 = null;

        // Creating lines delineating a triangle:
        if(this.B.get_x() == this.A.get_x()){
            for(int i=Math.min(B.get_y(), A.get_y()); i<= Math.max(B.get_y(), A.get_y()); i+=step){
                this.points.add(new Point(this.A.get_x(), i));
            }
        } else {
            double a1 = (double)(this.B.get_y() - this.A.get_y()) / (this.B.get_x() - this.A.get_x());
            double b1 = this.A.get_y() - a1*A.get_x();
            line1 = new Line(a1, b1);
        }

        if(this.C.get_x() == this.B.get_x()){
            for(int i=Math.min(C.get_y(), B.get_y()); i<= Math.max(C.get_y(), B.get_y()); i+=step){
                this.points.add(new Point(this.C.get_x(), i));
            }
        } else {
        double a2 = (double)(this.C.get_y() - this.B.get_y()) / (this.C.get_x() - this.B.get_x());
        double b2 = this.B.get_y() - a2*B.get_x();
        line2 = new Line(a2, b2);
        }

        if(this.A.get_x() == this.C.get_x()){
            for(int i=Math.min(A.get_y(), C.get_y()); i<= Math.max(A.get_y(), C.get_y()); i+=step){
                this.points.add(new Point(this.A.get_x(), i));
            }
        } else {
        double a3 = (double)(this.A.get_y() - this.C.get_y()) / (this.A.get_x() - this.C.get_x());
        double b3 = this.A.get_y() - a3*A.get_x();
        line3 = new Line(a3, b3);
        }

        // Generating points laying on lines delineating a triangle and
        // Connecting points laying on lines:
        if(line1 != null){
            line1.generateLine(A.get_x(), B.get_x(), step);
            this.points.addAll(line1.getPoints());
        }
        
        if(line2 != null){
            line2.generateLine(B.get_x(), C.get_x(), step);
            this.points.addAll(line2.getPoints());
        }

        if(line3 != null){
            line3.generateLine(A.get_x(), C.get_x(), step);
            this.points.addAll(line3.getPoints());
        }

      


    }

}
