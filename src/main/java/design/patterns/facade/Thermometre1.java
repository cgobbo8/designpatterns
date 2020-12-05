package design.patterns.facade;

public class Thermometre1 implements Thermometre {
    @Override
    public int getTemperature() {
        return (int) (Math.random() * 30);
    }
}
