package design.patterns.factory;

public class ButtonWindows implements Button {
    @Override
    public void shadow() {
        System.out.println("No shadow");
    }

    @Override
    public void size() {
        System.out.println("Big");
    }

    @Override
    public void color() {
        System.out.println("Color Grey");
    }

    @Override
    public void hover() {
        System.out.println("No hover");
    }

    @Override
    public void afficher() {
        System.out.println("Button Windows");
        shadow();
        size();
        color();
        hover();
    }
}
