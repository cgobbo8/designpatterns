package design.patterns.facade;

public class Facade {
    Thermometre t1 ;
    Thermometre t2 ;

    CompteurPersonnes cptPers ;

    Clim clim1 ;
    Clim clim2 ;

    public Facade() {
        t1 = new Thermometre1();
        t2 = new Thermometre2();

        cptPers = new CompteurPersonnes();

        clim1 = new Clim();
        clim2 = new Clim();
    }

    public int getTempMoyenne() {
        return (t1.getTemperature() + t2.getTemperature())/2;
    }

    public void activateClim1() {
        clim1.active();
    }

    public void activateClim2() {
        clim2.active();
    }

    public void desactivateClim1() {
        clim1.desactive();
    }

    public void desactivateClim2() {
        clim2.desactive();
    }

    public int showNbPersonnes() {
        return cptPers.getPersonnes();
    }
}
