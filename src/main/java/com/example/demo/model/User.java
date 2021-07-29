package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {


    @Id
        private String id;

        private String name;
        private String address;
        private String phone;
        private Produits produit;
        private boolean published;





    public User(String name, String address, String phone, Produits produit, boolean published) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.produit = produit;
        this.published = published;
    }

    public Produits getProduit() {   return produit;   }

    public void setProduit(Produits produit) {  this.produit = produit;    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", Name=" + name + ", Address=" + address + ", Phone="+ phone +",Produit ="+ produit +" published=" + published + "]";
    }
}


