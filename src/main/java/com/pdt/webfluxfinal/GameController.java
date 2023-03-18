package com.pdt.webfluxfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    private GameService service;

    @PostMapping
    public Game createGame(@RequestBody Game game){
        service.save(game);
        return game;
    }

//    @GetMapping
//    public Flux<Game> getGames(){
//        return service.getGames();
//    }
}
