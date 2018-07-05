public class Line {
    private double a;
    private double b;

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