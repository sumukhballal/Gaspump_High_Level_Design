package Datastore;

public class Datastore2 extends Datastore {

    float temp_a; // Temporary Value of Regular Gas
    float temp_b; // Temporary Value of Diesel Gas
    float temp_c; // Temporary Value of Super Gas
    String temp_p; // Temporary Value of Debit Pin
    String pin; // Store Pin for Debit Card
    float price; // Price of gas chosen
    int G;    // Total Gallons Filled
    String gasType;    // Current GAS Type String
    float total;    // Total Dollars to Pay for Gas
    float Rprice;   // Actual Price of Regular Gas
    float Dprice;    // Actual Price of Diesel Gas
    float Sprice;     // Actual Price of Super Gas
    int w;       // Cash or not cash flag – Never Set


    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public float getTemp_a() {
        return temp_a;
    }

    public String getGasType() {
        return gasType;
    }

    public void setTemp_a(float temp_a) {
        this.temp_a = temp_a;
    }

    public float getTemp_b() {
        return temp_b;
    }

    public void setTemp_b(float temp_b) {
        this.temp_b = temp_b;
    }

    public String getTemp_p() {
        return temp_p;
    }

    public void setTemp_p(String temp_p) {
        this.temp_p = temp_p;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getRprice() {
        return Rprice;
    }

    public void setRprice(float rprice) {
        Rprice = rprice;
    }

    public float getDprice() {
        return Dprice;
    }

    public void setDprice(float dprice) {
        Dprice = dprice;
    }

    public float getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;
    }

    public float getSprice() {
        return Sprice;
    }

    public void setSprice(float sprice) {
        Sprice = sprice;
    }
}
