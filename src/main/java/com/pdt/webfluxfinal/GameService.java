package com.pdt.webfluxfinal;

import reactor.core.publisher.Flux;

public class GameService {
    private ReactiveMongoRepositoryGame repository;

    public void save(Game game) {
        repository.save(game);
    }

    public Flux<Game> getGames(){
        return repository.findAll();
    }
}
