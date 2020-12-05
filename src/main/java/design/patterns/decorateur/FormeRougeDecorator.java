package design.patterns.decorateur;

public class FormeRougeDecorator extends FormeDecorator {
    public FormeRougeDecorator(Forme formeDecorated) {
        super(formeDecorated);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        setBordureRouge(formeDecorated);
    }

    private void setBordureRouge(Forme formeDecorated) {
        System.out.println("La bordure est rouge");
    }
}
