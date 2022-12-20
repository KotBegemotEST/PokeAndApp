package com.example.againpokemons.model;
import java.util.List;
public class Pokemon {
    private int id;
    private String num;
    private String name;
    private String img;
    private List<String> type;
    private String height ;
    private String weight ;
    private String candy;
    private int candy_count ;
    private String egg ;
    private double spawn_chance ;
    private double avg_spawns;
    private String spawn_time ;
    private List<Double> multipliers;
    private List<String> weaknesses;
    private List<NextEvolution> next_evolution;
    private List<PrevEvolution> prev_evolution;


    public Pokemon(int id, String num, String name, String img, List<String> type, String height, String weight, String candy, int candy_count, String egg, double spawn_chance, double avg_spawns, String spawn_time, List<Double> multipliers, List<String> weaknesses, List<NextEvolution> next_evolution, List<PrevEvolution> prev_evolution) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.img = img;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.candy = candy;
        this.candy_count = candy_count;
        this.egg = egg;
        this.spawn_chance = spawn_chance;
        this.avg_spawns = avg_spawns;
        this.spawn_time = spawn_time;
        this.multipliers = multipliers;
        this.weaknesses = weaknesses;
        this.next_evolution = next_evolution;
        this.prev_evolution = prev_evolution;
    }
}
