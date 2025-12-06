package Lab10.BT1;

public class Car implements Icar {
    private String name;
    private String producer;
    private int year;
    private int seat;
    private float rootPrice;

    public Car() {
    }

    public Car(String name, String producer, int year, int seat, float rootPrice) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootPrice = rootPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float getRootPrice() {
        return rootPrice;
    }

    public void setRootPrice(float rootPrice) {
        this.rootPrice = rootPrice;
    }

    @Override
    public float calculateTax() {
        if (seat < 7) {
            return rootPrice * 0.6f;
        } else {
            return rootPrice * 0.7f;
        }
    }

    @Override
    public float calculatePrice() {
        return rootPrice + calculateTax();
    }

    @Override
    public void getInfo() {
        System.out.printf("%s car produced by %s in %d has %d seats with the total price is %.2f",
                name, producer, year, seat, calculatePrice());
    }
}
