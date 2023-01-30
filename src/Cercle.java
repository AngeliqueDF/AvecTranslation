public class Cercle implements AvecSurface, AvecTranslation {
    protected Point centre;
    protected double rayon;

    public Cercle(Point ctr, double r) {
        centre = ctr;
        rayon = r;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public void translation(double deplHor, double deplVer) {
        centre.translation(deplHor, deplVer);
    }

    @Override
    public void afficherPosition() {
        System.out.println("Position du centre du cercle : (" + this.centre.getX() + ", " + this.centre.getY() + ")");
    }
}