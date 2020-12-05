package design.patterns.factory;

public class ButtonIOS implements Button {
    @Override
    public void shadow() {
        System.out.println("No shadow");
    }

    @Override
    public void size() {
        System.out.println("Small size");
    }

    @Override
    public void color() {
        System.out.println("Color White");
    }

    @Override
    public void hover() {
        System.out.println("No hover");
    }

    @Override
    public void afficher() {
        System.out.println("Button IOS");
        shadow();
        size();
        color();
        hover();
    }


}
