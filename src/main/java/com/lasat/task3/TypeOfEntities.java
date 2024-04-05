package com.lasat.task3;

public enum TypeOfEntities {
    CREATURES ("существ"),
    AIR ("Воздух");

    private String title;
    TypeOfEntities(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
