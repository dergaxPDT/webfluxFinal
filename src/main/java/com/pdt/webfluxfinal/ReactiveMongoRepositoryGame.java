package com.pdt.webfluxfinal;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

interface ReactiveMongoRepositoryGame extends ReactiveMongoRepository<Game, String> {
}
