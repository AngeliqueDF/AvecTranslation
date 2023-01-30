public class Point implements AvecTranslation {
    protected double x, y;

    public Point(double xi, double yi) {
        x = xi;
        y = yi;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p2) {
        return Math.sqrt((this.x - p2.x) * (this.x - p2.x) +
                (this.y - p2.y) * (this.y - p2.y));
    }

    public void translation(double deplHor, double deplVer) {
        x = x + deplHor;
        y = y + deplHor;
    }

    @Override
    public void afficherPosition() {
        System.out.println("Position : (" + this.getX() + ", " + this.getY() + ")");
    }


}