package com.genspark.RestfulPokemon.Entities;

import javax.persistence.*;

@Entity
@Table(name="Pokemon_Collection")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pokeId;
    private String name;
    private String setName;
    private String rarity;
    private String quantity;

    public Pokemon(){

    }
    public Pokemon(String name, String setName,String rarity,String quantity){
        this.name=name;
        this.setName=setName;
        this.rarity=rarity;
        this.quantity=quantity;
    }

    public int getPokeId() {
        return pokeId;
    }

    public void setPokeId(int pokeId) {
        this.pokeId = pokeId;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Pokemon Name: "+name+" Expansion Set: "+setName+" Rarity: "+rarity+" Quantity: "+quantity;
    }
}
