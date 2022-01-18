package models;

public class Farmer {
    private String name;
    private String location;
    private String number;
    private String produce;
    private String email;
    private int priceOfProduce;

    public Farmer(String name, String location, String number, String produce, int priceOfProduce) {
        this.name = name;
        this.location = location;
        this.number = number;
        this.produce = produce;
        this.email = "No email available";
        this.priceOfProduce = priceOfProduce;
    }

    public Farmer(String name, String location, String number, String produce, String email, int priceOfProduce) {
        this.name = name;
        this.location = location;
        this.number = number;
        this.produce = produce;
        this.email = email;
        this.priceOfProduce = priceOfProduce;
    }

    pub
}
