package org.example.code_smell;

import org.example.code_smell.characters.DarthVader;
import org.example.code_smell.characters.ObiWanKenobi;
import org.example.code_smell.characters.SwCharacter;

public class DuplicatedCode {
    public static void main(String[] args) {
        printCharacters();
    }
    public void printCharacters_duplicatedCodeExample() {
        SwCharacter darthVader = new DarthVader();
        SwCharacter obiWan = new ObiWanKenobi();
        System.out.println("Name: " + darthVader.getName());
        System.out.println("LightSaber color: " +
                darthVader.getLightSaberColor());
        System.out.println("Birth place: " +
                darthVader.getBirthPlace());
        System.out.println("Name: " + obiWan.getName());
        System.out.println("LightSaber color: " +
                obiWan.getLightSaberColor());
        System.out.println("Birth place: " +
                obiWan.getBirthPlace());
    }

    public static void printCharacters() {
        printDetails(new DarthVader());
        printDetails(new ObiWanKenobi());
    }

    private static void printDetails(SwCharacter character) {
        System.out.println(" ---- CHARACTER DETAILS -----");
        System.out.println("Name: " + character.getName());
        System.out.println("LightSaber color: " + character.getLightSaberColor());
        System.out.println("Birth place: " + character.getBirthPlace());
        System.out.println();
    }
}
