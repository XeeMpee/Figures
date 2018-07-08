import java.lang.Math;

public class Circle extends Figure {
    Point centerPoint;
    double radius;

    public Circle(Point centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    @Override
    public void generateFigure(int step){
        for(int x=((int)(centerPoint.get_x() - this.radius)); x<=((int)(this.centerPoint.get_x()+this.radius)); x+=step){
            double delta;
            double a = (double)this.centerPoint.get_x();
            double b = (double)this.centerPoint.get_y();
            double r = this.radius;

            delta = (4*(b*b) - 4*(x*x - 2*a*x + a*a + b*b - r*r));
            if(delta < 0){
                break;
            }

            // Warning! 0.5 Coeffitient is breaking formula, but:
            // Only with that coeffitient circle looks like a cicle, not an egg...
            double y1 = (0.5)*(2*b-Math.sqrt(delta))/2;
            double y2 = (0.5)*(2*b+Math.sqrt(delta))/2;

            Point newPoint1 = new Point(x,(int)y1);
            Point newPoint2 = new Point(x,(int)y2);
            this.points.add(newPoint1);
            this.points.add(newPoint2);
        }
    }




}