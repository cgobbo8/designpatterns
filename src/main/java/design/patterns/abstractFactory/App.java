package design.patterns.abstractFactory;

public class App {
    public static void main(String[] args) {
        AbstractFactory artdecoFactory = FactoryProducer.getFactory(ArtType.ART_DECO);
        AbstractFactory meubleFactory = FactoryProducer.getFactory(ArtType.CLASSIC);

        Meuble chaiseArtDeco = artdecoFactory.getMeuble(MeubleType.CHAISE);
        Meuble chaiseClassique = meubleFactory.getMeuble(MeubleType.CHAISE);

        chaiseArtDeco.design();
        System.out.println();
        chaiseClassique.design();

        Meuble tableArtDeco = artdecoFactory.getMeuble(MeubleType.TABLE);
        System.out.println();
        tableArtDeco.design();

    }
}
