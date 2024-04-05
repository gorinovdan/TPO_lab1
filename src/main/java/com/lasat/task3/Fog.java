package com.lasat.task3;

import lombok.SneakyThrows;

public class Fog {
    private int transparency;
    private String description;
    private String state;
    public Fog(int transparency, String description, String state) {
        this.transparency = transparency;
        this.description = description;
        this.state = state;

    }

    @SneakyThrows
    public String isDark() {
        if (this.transparency < 50 && this.transparency > 0) {
            return "Темный";
        }
        else if (this.transparency < 100 && this.transparency >= 50) {
            return "Светлый";
        }
        else throw new Exception("Такой видимости в тумане быть не может");
    }

    @Override
    public String toString() {
        return isDark() + " " + description + " " + state;
    }
}
