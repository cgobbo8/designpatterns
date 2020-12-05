package design.patterns.factory;

public class Client {
    public static void main(String[] args) {
        ButtonFactory btnFactory = new ButtonFactory();

        Button buttonGoogle = btnFactory.getButton(ButtonType.ANDROID);
        buttonGoogle.afficher();
        System.out.println();

        Button buttonIOS = btnFactory.getButton(ButtonType.IOS);
        buttonIOS.afficher();
        System.out.println();

        Button buttonWindows = btnFactory.getButton(ButtonType.WINDOWS);
        buttonWindows.afficher();



    }
}
