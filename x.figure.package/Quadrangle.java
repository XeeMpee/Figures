public class Quadrangle extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Quadrangle(Point A, Point B, Point C, Point D){
        super();
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Quadrangle(int[] A, int[] B, int[] C, int[] D){
        super();
        if(A.length != 2 || B.length != 2 || C.length !=2 || D.length != 2){
            Error e = new Error("Table which represents Point should be 2 units lengh! -> [x,y]");
            throw new RuntimeException(e);
        }

        Point pA = new Point(A[0], A[1]); 
        Point pB = new Point(B[0], B[1]); 
        Point pC = new Point(C[0], C[1]); 
        Point pD = new Point(D[0], D[1]);
        
        this.A = pA;
        this.B = pB;
        this.C = pC;
        this.D = pD;
    }

    @Override
    public void generateFigure(int step){
        
        // Creating lines delineating a triangle:
        double a1 = (double)(this.A.get_y() - this.B.get_y()) / (this.A.get_x() - this.B.get_x());
        double b1 = this.A.get_y() - a1*A.get_x();
        Line line1 = new Line(a1, b1);

        double a2 = (double)(this.B.get_y() - this.C.get_y()) / (this.B.get_x() - this.C.get_x());
        double b2 = this.B.get_y() - a2*B.get_x();
        Line line2 = new Line(a2, b2);

        double a3 = (double)(this.C.get_y() - this.D.get_y()) / (this.C.get_x() - this.D.get_x());
        double b3 = this.C.get_y() - a3*C.get_x();
        Line line3 = new Line(a3, b3);

        double a4 = (double)(this.D.get_y() - this.A.get_y()) / (this.D.get_x() - this.A.get_x());
        double b4 = this.D.get_y() - a4*D.get_x();
        Line line4 = new Line(a4, b4);

        // Generating points laying on lines delineating a triangle:
        line1.generateLine(A.get_x(), B.get_x(), step);
        line2.generateLine(B.get_x(), C.get_x(), step);
        line3.generateLine(A.get_x(), C.get_x(), step);
        
        // Connecting points laying on lines:
        this.points.addAll(line1.getPoints());
        this.points.addAll(line2.getPoints());
        this.points.addAll(line3.getPoints());
    }


}