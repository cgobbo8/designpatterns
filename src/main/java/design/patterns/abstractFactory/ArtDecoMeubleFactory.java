package design.patterns.abstractFactory;

public class ArtDecoMeubleFactory extends AbstractFactory {
    @Override
    Meuble getMeuble(MeubleType type) {
        switch (type) {
            case CHAISE: return new ArtDecoChaise();
            case TABLE: return new ArtDecoTable();
            case ARMOIRE: return new ArtDecoArmoire();
        }
        return null;
    }
}
