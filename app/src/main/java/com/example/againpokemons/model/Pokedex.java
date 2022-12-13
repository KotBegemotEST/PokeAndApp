package com.example.againpokemons.model;


public class Pokedex
{
    public List<Pokemon> pokemon;


    public Pokedex(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}