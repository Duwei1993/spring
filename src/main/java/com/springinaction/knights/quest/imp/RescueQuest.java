package com.springinaction.knights.quest.imp;

import com.springinaction.knights.quest.Quest;

public class RescueQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("RescueQuest.embark()");
    }
}
