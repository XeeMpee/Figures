public class Line extends Figure{
    // Members:
    private double a;
    private double b;

    // Cosntructors:
    public Line(double a, double b){
        this.setACoeffitient(a);
        this.setBCoeffitient(b);
    }

    // Methods:
    public void setACoeffitient(double a){
        this.a=a;
    }

    public void setBCoeffitient(double b){
        this.b=b;
    }

    public void setCoeffitients(double a, double b){
        this.setACoeffitient(a);
        this.setBCoeffitient(b);
    }

    public double getInterpolatedPoint(double x){
        return (double) this.a * x + this.b;
    }

    public void generateLine(int x1, int x2, int step){
        for(int i=x1; i<x2; i+=step){
            Point newPoint = new Point((int)i, (int)(a*i+b));
            this.points.add(newPoint);
        }
    }
}