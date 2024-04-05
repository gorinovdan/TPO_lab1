package com.lasat.task3;

public class Entities {
    private int numberOfEntities;
    private TypeOfEntities typeOfEntities;
    private String action;
    private String description;

    public Entities(TypeOfEntities typeOfEntities) {
        this.typeOfEntities = typeOfEntities;
    }

    public void setNumberOfEntities(int numberOfEntities) {
        this.numberOfEntities = numberOfEntities;
    }

    public int getNumberOfEntities() {
        return numberOfEntities;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String description = this.description == null ? "" : this.description + " ";
        String action = this.action == null ? "" : " " + this.action;
        return description + typeOfEntities.getTitle() + action;
    }
}
