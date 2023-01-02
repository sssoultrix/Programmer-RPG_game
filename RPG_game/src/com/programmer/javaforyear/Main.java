package com.programmer.javaforyear;

import com.programmer.javaforyear.classes.characters.Archer;
import com.programmer.javaforyear.classes.characters.Healer;
import com.programmer.javaforyear.classes.characters.Mage;
import com.programmer.javaforyear.classes.characters.Warrior;
import com.programmer.javaforyear.dangeos.Dungeon;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gandalf"), new Warrior("Aragorn"), new Archer("Legolas"), new Healer("Radogast"));
        party.info();
        Dungeon dungeon = new Dungeon();
       if (party.enterDungeon(dungeon)) {
            party.setDungeon(dungeon);
            party.runDungeon();
       } else System.out.println("GAME OVER!");
    }

}