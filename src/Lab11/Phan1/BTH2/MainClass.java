package Lab11.Phan1.BTH1.BTH2;

public class MainClass {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4};
        Character[] charArr = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        printArray(intArr);
        System.out.println("Array doubleArray contains:");
        printArray(doubleArr);
        System.out.println("Array characterArray contains:");
        printArray(charArr);
    }
}
