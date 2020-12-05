package design.patterns.factory;

public class ButtonFactory {
    public Button getButton(ButtonType type) {
        switch (type) {
            case ANDROID:
                return new ButtonGoogle();
            case WINDOWS:
                return new ButtonWindows();
            case IOS:
                return new ButtonIOS();
        }
        return null;
    }
}
