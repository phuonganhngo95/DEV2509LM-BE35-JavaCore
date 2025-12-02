package Lab08.BTH2;

public class SoHoKhau {
    private int soNhanKhau;
    private HoKhau[] arr;

    public SoHoKhau() {}

    public SoHoKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        arr = new HoKhau[soNhanKhau];
    }

    public void nhapDuLieu() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new HoKhau();
            arr[i].nhapThongTin();
        }
    }

    public void hienThiDuLieu() {
        for (int i = 0; i < arr.length; i++) {
            HoKhau tv = arr[i];
            tv.hienThiTT();
        }
    }

    public boolean timNguoiTrongHoKhau(String tenCanTim, int soHoKhau) {
        if (arr == null) return false;

        boolean timThay = false;
        for (HoKhau hk : arr) {
            if (hk != null && hk.getHoVaTen().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Tìm thấy: " + hk.getHoVaTen());
                timThay = true;
            }
        }
        return timThay;
    }
}
