package design.patterns.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(ArtType type) {
        switch (type) {
            case CLASSIC: return new MeubleFactory();
            case ART_DECO: return new ArtDecoMeubleFactory();
        }
        return null;
    }
}
