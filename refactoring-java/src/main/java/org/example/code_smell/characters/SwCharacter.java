package org.example.code_smell.characters;

public class SwCharacter {
    private final String name;
    private String lightSaberColor;
    private String birthPlace;

    protected SwCharacter (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLightSaberColor() {
        return lightSaberColor;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
}

