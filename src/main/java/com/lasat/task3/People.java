package com.lasat.task3;

import lombok.SneakyThrows;

import java.util.Objects;

public class People {
    private String description;
    private boolean wantToPay;
    private int count;
    private String state;
    private String action;
    public String getDescription() {
            return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getWantToPay() {
        return wantToPay;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @SneakyThrows
    public People(String description, boolean wantToPay, int count) {
        if (count > 1 && (Objects.equals(description.toLowerCase(), "них") ||
                Objects.equals(description.toLowerCase(), "они") ||
                Objects.equals(description.toLowerCase(), "люди")))
            this.description = description;
        else throw new Exception("Количество людей должно быть больше");
        this.wantToPay = wantToPay;
        this.count = count;
    }

    @SneakyThrows
    @Override
    public String toString() {
        String state = this.state == null ? "" : this.state + " ";
        String wantToPay;
        if (!this.wantToPay) wantToPay = "";
        else if (description == "люди") wantToPay = "," + " которым хотелось бы за это заплатить";
        else throw new Exception("True в параметре wantToPay к указанному People.description установить невозможно");
        String action = this.action == null ? "" : " " + this.action;
        return state + description + wantToPay + action;
    }
}
