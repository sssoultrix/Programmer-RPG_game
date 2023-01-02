package com.programmer.javaforyear.classes.characters;

import com.programmer.javaforyear.classes.AttackType;
import com.programmer.javaforyear.classes.CharacterClass;

public class Healer extends CharacterClass {
    public Healer (String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(75);
        this.setMaxManaPoints(150);
        this.setHealthPoints(75);
        this.setManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(3);
    }
}
