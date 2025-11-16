package Lab05.BTH2;

public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;

    public int shareCode = 0;

    /**
     * @param width chiều rộng
     * @param height chiều dài
     * @return void
     * @see: Diện tích hình chữ nhật - vuông
     */
    public void tinhDienTich(float width, float height) {
        System.out.println("Diện tích: " + (width*height));
    }

    /**
     * @param radius Bán kính hình tròn
     * @return void
     * @see: Diện tích hình chữ nhật - vuông
     */
    public void tinhDienTich(float radius) {
        System.out.println("Diện tích: " + Math.pow(radius, 2)*3.14);
    }

    /**
     * @param: height chiều cao tam giác
     * @param bottom chiều dài cạnh đáy
     * @return void
     * @see: Diện tích hình chữ nhật - vuông
     */
    public void tinhDienTich(float height, double bottom) {
        System.out.println("Diện tích: " + (0.5*bottom*height));
    }

    /**
     * @param width chiều rộng
     * @param height chiều dài
     * @return void
     * @see: Chu vi hình chữ nhật - vuông
     */
    public void tinhChuVi(float width, float height) {
        System.out.println("Chu vi: " + ((width+height)*2));
    }

    /**
     * @param radius Bán kính
     * @see: Chu vi hình tròn
     */
    public void tinhChuVi(float radius) {
        System.out.println("Chu vi " + (radius*2*3.14));
    }

    /**
     * @param edge1 Cạnh thứ 1
     * @param edge2 Cạnh thứ 2
     * @param edge3 Cạnh thứ 3
     * @see: Chu vi hình tam giác
     */
    public void tinhChuVi(float edge1, float edge2, float edge3) {
        System.out.println("Chu vi: " + (edge1+edge2+edge3));
    }
}
