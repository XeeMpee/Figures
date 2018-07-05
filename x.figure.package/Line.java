public class Line {
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
}