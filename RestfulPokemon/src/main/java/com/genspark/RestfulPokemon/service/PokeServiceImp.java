package com.genspark.RestfulPokemon.service;

import com.genspark.RestfulPokemon.DAO.PokemonDAO;
import com.genspark.RestfulPokemon.Entities.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokeServiceImp implements PokeService {

    @Autowired
    private PokemonDAO dao;


    @Override
    public List<Pokemon> getAllPokemon() {
        return this.dao.findAll();
    }

    @Override
    public Pokemon getPokeById(int pokeId) {
        Optional <Pokemon> poke = this.dao.findById(pokeId);
        Pokemon p = null;
        if(poke.isPresent()){
            p=poke.get();
        }else{
            throw new RuntimeException("Pokemon not found for name "+pokeId);
        }
        return p;
    }

    @Override
    public Pokemon addPokemon(Pokemon poke) {
        return this.dao.save(poke);
    }

    @Override
    public Pokemon updatePoke(Pokemon poke) {
        return this.dao.save(poke);
    }

    @Override
    public String deletePoke(int name) {
        this.dao.deleteById(name);
        return "Pokemon was successfully deleted.";
    }
}
