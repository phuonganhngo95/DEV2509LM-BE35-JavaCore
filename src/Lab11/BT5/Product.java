package Lab11.BT5;

public class Product {
    private String proId;
    private String proName;
    private String producer;
    private int yearMaking;
    private float price;

    public Product(String proId, String proName, String producer, int yearMaking, float price) {
        this.proId = proId;
        this.proName = proName;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + proId +
                "Tên: " + proName +
                "Nhà SX: " + producer +
                "Năm SX: " + yearMaking +
                "Giá: " + String.format("%.2f", price) + " VND";
    }
}
