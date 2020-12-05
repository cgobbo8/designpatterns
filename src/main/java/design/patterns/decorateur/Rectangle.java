package design.patterns.decorateur;

public class Rectangle implements Forme {
    @Override
    public void dessiner() {
        System.out.println("Dessiner un rectangle");
    }
}
