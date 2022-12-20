package Retrofit;

import com.example.againpokemons.model.Pokedex;
import io.reactivex.Observable;


import retrofit2.http.GET;

public interface IPokeDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
