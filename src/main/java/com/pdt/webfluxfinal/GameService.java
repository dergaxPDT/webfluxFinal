package com.pdt.webfluxfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GameService {
    @Autowired
    private ReactiveMongoRepositoryGame repository;

    public void save(Game game) {
        repository.save(game);
    }

    public Flux<Game> getGames(){
        return repository.findAll();
    }
}
