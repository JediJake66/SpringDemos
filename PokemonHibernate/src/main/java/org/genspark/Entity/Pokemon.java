package org.genspark.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pokemon")
public class Pokemon {

    @Id
    private String name;
    private String setName;
    private String rarity;
    private int quantity;

    public Pokemon() {
    }

    public Pokemon(String name, String setName, String rarity, int quantity) {
        this.name = name;
        this.setName = setName;
        this.rarity = rarity;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Pokemon Name: "+name+" Expansion Set: "+setName+" Rarity: "+rarity+" Quantity: "+quantity;
    }
}
