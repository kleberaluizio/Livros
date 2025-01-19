package org.example.code_smell.characters;

public class DarthVader extends SwCharacter {

    public DarthVader() {
        super( "Darth Vader");
    }

    @Override
    public String getBirthPlace() {
        return "Joinville Intergalactic Hospital";
    }

    @Override
    public String getLightSaberColor() {
        return "BLUE";
    }
}
