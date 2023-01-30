public class Deplacement {
    AvecTranslation objet;

    Deplacement(AvecTranslation objet) {
        this.objet = objet;
    }

    public static void main(String[] args) {
        Point centreCercle = new Point(2.2, 2.1);
        Cercle c = new Cercle(centreCercle, 3.0);
        Point p = new Point(4.2, 9.6);
        Point sommet1 = new Point(3.2, 1.0);
        Point sommet2 = new Point(3.3, 6);
        Point sommet3 = new Point(7.1, 4.5);
        Triangle t = new Triangle(sommet1, sommet2, sommet3);
        Point bg = new Point(4.8, 3.3);
        Rectangle r = new Rectangle(bg, 7.7, 9.1);
        AvecTranslation[] tab = {c, p, t, r};
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j <= 2; j++) {
                Deplacement d = new Deplacement(tab[i]);
                d.top(2.2, 2.1);
            }
        }
    }

    public void top(double deplHor, double deplVer) {
        objet.translation(deplHor, deplVer);
        objet.afficherPosition();
    }
}
