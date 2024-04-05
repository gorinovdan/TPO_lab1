package com.lasat.task3;

import lombok.SneakyThrows;

public class Sounds {
    private int volume;
    private String description;
    private Object source;

    @SneakyThrows
    public Sounds(int volume, String description) {
        if (volume < 10) throw new Exception("Звуков нет или они слишком тихие");
        else this.volume = volume;
        this.description = description;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public String getDescription() {
        return description;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        String source = this.source == null ? "" : " " + this.source;
        return description + source;
    }
}
