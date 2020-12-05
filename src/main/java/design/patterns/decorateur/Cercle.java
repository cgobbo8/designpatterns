package design.patterns.decorateur;

public class Cercle implements Forme {
    @Override
    public void dessiner() {
        System.out.println("Dessiner un cercle");
    }
}
