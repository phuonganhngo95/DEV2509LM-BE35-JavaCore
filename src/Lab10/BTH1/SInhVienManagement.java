package Lab10.BTH1;

import java.util.Arrays;

public class SInhVienManagement {
    String[] arr;

    public SInhVienManagement() {
        arr = new String[0];
    }

    private void moRong() {
        int size = arr.length + 1;
        String[] temp = Arrays.copyOf(arr, size);
        arr = new String[size];
        System.arraycopy(temp, 0, arr, 0, size);
    }

    public void themSinhVien(String name, int pos) {
        try {
            arr[pos-1] = name;
        } catch (ArrayIndexOutOfBoundsException e) {
            moRong();
            arr[arr.length-1] = name;
        }
    }

    public void hienThi() {
        for (int i = 0; i < arr.length; i++) {
            String arr1 = arr[i];
            System.out.println(arr1);
        }
    }
}
