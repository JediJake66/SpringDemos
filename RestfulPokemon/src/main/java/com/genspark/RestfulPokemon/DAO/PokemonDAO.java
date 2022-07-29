package com.genspark.RestfulPokemon.DAO;

import com.genspark.RestfulPokemon.Entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PokemonDAO extends JpaRepository<Pokemon, Integer> {

    }
