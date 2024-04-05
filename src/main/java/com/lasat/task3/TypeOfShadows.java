package com.lasat.task3;

public enum TypeOfShadows {
    DARKNESS ("темнота"),
    NIGHT ("ночь"),
    GLOOM ("мрак"),
    SHADOWS ("тени"),
    MIST ("мгле");

    private String title;

    TypeOfShadows(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
