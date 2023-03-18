package com.pdt.webfluxfinal;

public class Game {
    String name;

    public Game(){

    }
    public Game(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
