package design.patterns.abstractFactory;

public class MeubleFactory extends AbstractFactory {
    @Override
    Meuble getMeuble(MeubleType type) {
        switch (type) {
            case CHAISE: return new Chaise();
            case TABLE: return new Table();
            case ARMOIRE: return new Armoire();
        }
        return null;
    }
}
