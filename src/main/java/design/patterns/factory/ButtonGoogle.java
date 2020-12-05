package design.patterns.factory;

public class ButtonGoogle implements Button {
    @Override
    public void shadow() {
        System.out.println("Material design shadow");
    }

    @Override
    public void size() {
        System.out.println("Medium Size");
    }

    @Override
    public void color() {
        System.out.println("Color Red");
    }

    @Override
    public void hover() {
        System.out.println("Material effect on hover");
    }

    @Override
    public void afficher() {
        System.out.println("Button Google");
        shadow();
        size();
        color();
        hover();
    }

}
