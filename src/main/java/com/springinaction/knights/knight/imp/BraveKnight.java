package com.springinaction.knights.knight.imp;

import com.springinaction.knights.knight.Knight;
import com.springinaction.knights.minstrel.Minstrel;
import com.springinaction.knights.quest.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
