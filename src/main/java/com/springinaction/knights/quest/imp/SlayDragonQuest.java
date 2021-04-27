package com.springinaction.knights.quest.imp;

import com.springinaction.knights.quest.Quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }
    @Override
    public void embark() {
        System.out.println("Embarking on quest to slay the dragon!");
    }
}
