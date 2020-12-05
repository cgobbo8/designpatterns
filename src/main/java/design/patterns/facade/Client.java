package design.patterns.facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println(facade.getTempMoyenne());
        System.out.println(facade.showNbPersonnes());

        facade.activateClim1();
    }
}
