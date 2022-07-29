package com.genspark.RestfulPokemon.service;

import com.genspark.RestfulPokemon.Entities.Pokemon;

import java.util.List;

public interface PokeService {

    List<Pokemon> getAllPokemon();
    Pokemon getPokeById(int pokeId);
    Pokemon addPokemon(Pokemon poke);
    Pokemon updatePoke(Pokemon poke);
    String deletePoke(int pokeId);
}
