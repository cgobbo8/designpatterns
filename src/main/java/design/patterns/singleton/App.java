package design.patterns.singleton;

public class App {
    public static void main(String[] args) {

        //Impossible de créer un SingleObject avec son constructeur

        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();
    }
}
