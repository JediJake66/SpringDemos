package com.genspark.RestfulPokemon.Controllers;

import com.genspark.RestfulPokemon.Entities.Pokemon;
import com.genspark.RestfulPokemon.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokeController {

    @Autowired
    private PokeService pokeService;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>My Pokemon Collection</H1></HTML>";
    }

    @GetMapping("/allpokemon")
    public List<Pokemon> getPokes(){
        return this.pokeService.getAllPokemon();
    }
    @GetMapping("/allpokemon/{pokeId}")
    public Pokemon getPoke(@PathVariable String pokeId){
        return this.pokeService.getPokeById(Integer.parseInt(pokeId));
    }
    @PostMapping("/allpokemon")
    public Pokemon addPoke(@RequestBody Pokemon poke){
        return this.pokeService.addPokemon(poke);
    }
    @PutMapping("/allpokemon")
    public Pokemon updatePoke(@RequestBody Pokemon poke){
        return this.pokeService.updatePoke(poke);
    }
    @DeleteMapping("/allpokemon/{pokeId}")
    public String deletePoke(@PathVariable String pokeId){
        return this.pokeService.deletePoke(Integer.parseInt(pokeId));
    }


}
