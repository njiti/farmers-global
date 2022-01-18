package models;

import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public int getPriceOfProduce() {
        return priceOfProduce;
    }

    public String getNumber() {
        return number;
    }

    public String getProduce() {
        return produce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return priceOfProduce == farmer.priceOfProduce && name.equals(farmer.name) && location.equals(farmer.location) && number.equals(farmer.number) && produce.equals(farmer.produce) && email.equals(farmer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, number, produce, email, priceOfProduce);
    }

}
