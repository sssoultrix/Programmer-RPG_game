package com.programmer.javaforyear.dangeos;

import com.programmer.javaforyear.Party;
import com.programmer.javaforyear.monsters.MonsterClass;

public class Dungeon implements BasicDungeon {
    private boolean isOpebed = false;
    private MonsterClass[] monsters;
    @Override
   public boolean open(Party party) {
        if(party.getPartyMembers().length < 3) {
            System.out.println("Not enough party members!");
            isOpebed = false;
        }
        else {
            System.out.println("Welcome, heroes!");
            isOpebed = true;
        }
        return isOpebed;
    }
}
