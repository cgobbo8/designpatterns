package design.patterns.decorateur;

public class App {

    public static void main(String[] args) {
        Forme cercle = new Cercle();
        Forme cercleRouge = new FormeRougeDecorator(new Cercle());
        Forme rectangleRouge = new FormeRougeDecorator(new Rectangle());
        Forme rectangleBoldAndRouge = new FormeRougeDecorator(new BoldDecorator(new Rectangle()));

        System.out.println("Cercle : " );
        cercle.dessiner();
        System.out.println();
        System.out.println("Cercle Rouge : " );
        cercleRouge.dessiner();
        System.out.println();
        System.out.println("Rectangle Rouge : ");
        rectangleRouge.dessiner();
        System.out.println();
        System.out.println("Rectangle Bold : ");
        rectangleBoldAndRouge.dessiner();

    }
}
