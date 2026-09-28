package lab.java;

public class Phone {

    String model;
    int storageGB;
    double price;

    Phone(String model, int storageGB, double price) {
        this.model = model;
        this.storageGB = storageGB;
        this.price = price;
    }

    void show() {
        System.out.println("Model: " + model + "\n" + "Storage: " + storageGB + "\n" + "Price: " + price);
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("ROG 11", 256, 85000);
        p1.show();
    }
}
