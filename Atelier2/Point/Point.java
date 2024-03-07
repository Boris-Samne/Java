package Point;

public class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void deplacer(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void afficher(){
        System.out.println("Coordonnées: ("+ this.x + "," + this.y+")" );
    }

    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }


    public double rho(){
        return this.distance();
    }

    public double theta(){
        return Math.atan2(this.y, this.x);
    }

    public void homothetie(double k){
        this.x = k*this.x;
        this.y = k*this.y;
    }

    public void rotation(double angle){
        this.x = this.x*Math.cos(angle)-this.y*Math.sin(angle);
        this.y = this.x*Math.sin(angle)+this.y*Math.cos(angle);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


}