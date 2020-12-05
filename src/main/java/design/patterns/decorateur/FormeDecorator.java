package design.patterns.decorateur;

public abstract class FormeDecorator implements Forme {
    Forme formeDecorated;

    public FormeDecorator(Forme formeDecorated) {
        this.formeDecorated = formeDecorated;
    }

    public void dessiner() {
        formeDecorated.dessiner();
    }

}
