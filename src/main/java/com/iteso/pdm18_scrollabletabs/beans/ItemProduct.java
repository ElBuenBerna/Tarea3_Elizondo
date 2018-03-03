package com.iteso.pdm18_scrollabletabs.beans;


public class ItemProduct {
    private int image;
    private String title;
    private String store;
    private String phone;
    private String location;
    private String description;

    public ItemProduct(){
        this.image = 0;
        this.title = "";
        this.store = "";
        this.phone = "";
        this.location = "";
        this.description = "";
    }

    public ItemProduct(String title, String store, String phone, String location, String description, int image) {
        this.title = title;
        this.store = store;
        this.phone = phone;
        this.location = location;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", store='" + store + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
