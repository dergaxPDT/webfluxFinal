package com.pdt.webfluxfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
//@Tag(name = "game service", description = "the game API")
@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
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
