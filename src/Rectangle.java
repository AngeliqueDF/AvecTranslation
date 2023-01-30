public class Rectangle implements AvecSurface, AvecTranslation {
    protected Point basGauche;
    protected double dimHor, dimVer;

    public Rectangle(Point bg, double dh, double dv) {
        basGauche = bg;
        dimHor = dh;
        dimVer = dv;
    }

    public double surface() {
        return dimHor * dimVer;
    }

    public void translation(double deplHor, double deplVer) {
        basGauche.translation(deplHor, deplVer);
    }

    @Override
    public void afficherPosition() {
        System.out.println("Position du bas gauche : (" + basGauche.getX() + ", " + basGauche.getY() + ")");
        System.out.println("Position du haut droit : (" + (basGauche.getX() + dimHor) + ", " + (basGauche.getY() + dimVer) + ")");
    }
}
