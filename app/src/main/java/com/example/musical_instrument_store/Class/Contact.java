package com.example.musical_instrument_store.Class;

public class Contact {
    private String fullname;
    private String description;
    private int price;
    private float qty;
    private int imageId;

    public Contact(String fullname, String description, int price, float qty, int imageId) {
        this.fullname = fullname;
        this.description = description;
        this.price = price;
        this.qty = qty;
        this.imageId = imageId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
