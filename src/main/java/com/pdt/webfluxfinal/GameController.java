package com.pdt.webfluxfinal;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController("/api/game")
//@Tag(name = "Game")
public class GameController {

    private GameService service;

    @PostMapping
    public void createGame( Game game){
        service.save(game);
    }

    @GetMapping
    public Flux<Game> getGames(){
        return service.getGames();
    }
}
