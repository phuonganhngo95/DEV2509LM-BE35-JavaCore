package Lab11.Phan1.BTH1.BTH3;

public class AdvancedComparion<T extends Comparable<T>> {
    public void maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(b) > 0) {
            max = c;
        }
        System.out.println("Maximum is " + max);
    }

    public static void main(String[] args) {
        AdvancedComparion<Integer> comInt = new AdvancedComparion<>();
        AdvancedComparion<Float> comFloat = new AdvancedComparion<>();
        AdvancedComparion<String> compString = new AdvancedComparion<>();

        comInt.maximum(9, 3, 6);
        comFloat.maximum(8.5f, 9.3f, 2.6f);
        compString.maximum("Việt Nam", "Trung Quốc", "Hoa Kỳ");
    }
}
