package com.programmer.javaforyear.classes.characters;

import com.programmer.javaforyear.classes.AttackType;
import com.programmer.javaforyear.classes.CharacterClass;

public class Mage extends CharacterClass {
    public Mage (String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(50);
        this.setMaxManaPoints(150);
        this.setHealthPoints(50);
        this.setManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(12);
    }
}
