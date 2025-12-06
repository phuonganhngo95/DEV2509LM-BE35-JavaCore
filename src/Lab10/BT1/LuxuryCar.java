package Lab10.BT1;

public class LuxuryCar extends Car {
    private float specialRate;

    public LuxuryCar() {
    }

    public LuxuryCar(String name, String producer, int year, int seat, float rootPrice, float specialRate) {
        super(name, producer, year, seat, rootPrice);
        this.specialRate = specialRate;
    }

    public float getSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(float specialRate) {
        this.specialRate = specialRate;
    }

    @Override
    public float calculatePrice() {
        return getRootPrice() + calculateTax() + getRootPrice()*specialRate;
    }
    public float calculatePrice(float transportCost) {
        return getRootPrice() + calculateTax() + getRootPrice()*specialRate + transportCost;
    }
}
