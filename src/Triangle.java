public class Triangle implements AvecSurface, AvecTranslation {
    protected Point p1, p2, p3;

    public Triangle(Point p1i, Point p2i, Point p3i) {
        p1 = p1i;
        p2 = p2i;
        p3 = p3i;
    }

    public double surface() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        double demiper = (a + b + c) / 2;
        return Math.sqrt(demiper * (demiper - a) * (demiper - b) * (demiper - c));
    }

    public void translation(double deplHor, double deplVer) {
        p1.translation(deplHor, deplVer);
        p2.translation(deplHor, deplVer);
        p3.translation(deplHor, deplVer);
    }

    @Override
    public void afficherPosition() {
        String res = "Position des sommets du triangle : \n";
        Point[] p = {p1, p2, p3};
        for (int i = 0; i < p.length; i++) {
            res += "\t- (" + p[i].getX() + ", " + p[i].getY() + ")\n";
        }
        System.out.println(res);
    }
}
