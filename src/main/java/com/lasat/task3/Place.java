package com.lasat.task3;

public class Place {
    private String description;
    private String state;
    private Shadows shadows;
    private String action;
    public Place(String description) {
        this.description = description;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setShadows(Shadows shadows) {
        this.shadows = shadows;
    }

    public Shadows getShadows() {
        return shadows;
    }

    public String getDescription() {
        return description;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        String shadows;
        if (this.shadows == null) shadows = "";
        else if (this.action == null) shadows = this.shadows.toString();
        else shadows = action + " " + this.shadows;
        String state = this.state == null ? "" : this.state + " ";
        return description + state + shadows;
    }
}
