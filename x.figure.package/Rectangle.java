public class Rectangle extends Quadrangle{
    
    Rectangle(){
        super();
    }

    Rectangle(int a, int b, Point placementPoint, Placement placement){
        switch(placement){
            case leftdowncorner:
            this.A = placementPoint;
            this.B = new Point(placementPoint.get_x() + a, placementPoint.get_y());
            this.C = new Point(placementPoint.get_x() + a, placementPoint.get_y() + b);
            this.D = new Point(placementPoint.get_x(), placementPoint.get_y() + b);
            break;
            
            case rightdowncorner:
            this.A = new Point(placementPoint.get_x() - a, placementPoint.get_y());
            this.B = placementPoint;
            this.C = new Point(placementPoint.get_x(), placementPoint.get_y() + b);
            this.D = new Point(placementPoint.get_x() - a, placementPoint.get_y() + b);
            break;

            case rightupcorner:
            this.A = new Point(placementPoint.get_x() - a, placementPoint.get_y() - b);
            this.B = new Point(placementPoint.get_x(), placementPoint.get_y() - b);
            this.C = placementPoint;
            this.D = new Point(placementPoint.get_x() - a, placementPoint.get_y());
            break;

            case leftupcroner:
            this.A = new Point(placementPoint.get_x(), placementPoint.get_y() - b);
            this.B = new Point(placementPoint.get_x() + a, placementPoint.get_y() - b);
            this.C = new Point(placementPoint.get_x() + a, placementPoint.get_y());
            this.D = placementPoint;
            break;

            case center:
            this.A = new Point((int)(placementPoint.get_x() - 0.5*a), ((int)(placementPoint.get_y() - 0.5*b)));
            this.B = new Point((int)(placementPoint.get_x() + 0.5*a), ((int)(placementPoint.get_y() - 0.5*b)));
            this.C = new Point((int)(placementPoint.get_x() + 0.5*a), ((int)(placementPoint.get_y() + 0.5*b)));
            this.D = new Point((int)(placementPoint.get_x() - 0.5*a), ((int)(placementPoint.get_y() + 0.5*b)));
            break;
        }
    }

}