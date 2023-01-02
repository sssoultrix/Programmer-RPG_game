package com.programmer.javaforyear.dangeos;

import com.programmer.javaforyear.Party;

public interface BasicDungeon {
    default boolean open(Party party) {
        return false;
    }

}
