package Datastore;

public class Datastore1 extends Datastore {

    /*  Datastore 1 Class */

    private int temp_c; // Temporary Cash Value
    private int cash; // Store Cash Value
    private int total; // Total Dollars to Pay for Gas
    private int L; // Total Litres Filled
    private int price; // Price of gas Set
    private int temp_a; // Temp value of Gas
    private int w;  // Cash or not cash flag

    /* Getters and Setters */
    public int getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(int temp_c) {
        this.temp_c = temp_c;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTemp_a() {
        return temp_a;
    }

    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
}
