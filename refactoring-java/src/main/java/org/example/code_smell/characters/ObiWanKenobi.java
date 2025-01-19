package org.example.code_smell.characters;

public class ObiWanKenobi extends SwCharacter {

    public ObiWanKenobi() {
        super( "ObiWanKenobi");
    }

    @Override
    public String getBirthPlace() {
        return "Blumenau Intergalactic Hospital";
    }

    @Override
    public String getLightSaberColor() {
        return "RED";
    }
}
