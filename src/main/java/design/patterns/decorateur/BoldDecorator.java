package design.patterns.decorateur;

public class BoldDecorator extends FormeDecorator {

    public BoldDecorator(Forme formeDecorated) {
        super(formeDecorated);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("La bordure est épaisse");
    }
}
