package design.patterns.facade;

public class Thermometre2 implements Thermometre {
    @Override
    public int getTemperature() {
        return (int) (Math.random() * 20);
    }
}
