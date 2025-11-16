package Lab05.BTH1;

public class ConvertTemperature {
    private float temperNum;

    private float convertC2F() {
        return (float) (temperNum*1.8 + 32);
    }

    private float convertF2C() {
        return (float) ((temperNum-32) / 1.8);
    }

    public void convert(float nhietDo, boolean isToC) {
        this.temperNum = nhietDo;
        if (isToC) {
            System.out.println("Nhiệt độ " + nhietDo + "C " + convertC2F() + "F");
        } else {
            System.out.println("Nhiệt độ " + nhietDo + "F " + convertF2C() + "C");
        }
    }
}
