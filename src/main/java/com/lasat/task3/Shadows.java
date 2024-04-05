package com.lasat.task3;

public class Shadows {
    private TypeOfShadows typeOfShadows;
    private String description;

    public Shadows(TypeOfShadows typeOfShadows) {
        this.typeOfShadows = typeOfShadows;
    }

    public TypeOfShadows getTypeOfShadows() {
        return typeOfShadows;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypeOfShadows(TypeOfShadows typeOfShadows) {
        this.typeOfShadows = typeOfShadows;
    }

    @Override
    public String toString() {
        if (description != null) return description + " " + typeOfShadows.getTitle();
        else return typeOfShadows.getTitle();
    }
}
