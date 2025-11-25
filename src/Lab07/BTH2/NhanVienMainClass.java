package Lab07.BTH2;

public class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien[] arr = new NhanVien[3];
        arr[0] = new NhanVien();
        arr[0].name = "Ngoc Trinh";
        arr[0].cnt++;

        arr[1] = new NhanVien();
        arr[1].name = "Ba Tung";
        arr[1].cnt++;

        arr[2] = new NhanVien();
        arr[2].name = "Kieu Max";
        arr[2].cnt++;

        for (int i = 0; i < arr.length; i++) {
            NhanVien nv = arr[i];
            System.out.println(nv.name + " cnt= " + nv.cnt);
        }
    }
}
