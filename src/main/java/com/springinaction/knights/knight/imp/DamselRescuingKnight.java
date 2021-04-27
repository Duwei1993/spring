package com.springinaction.knights.knight.imp;

import com.springinaction.knights.knight.Knight;
import com.springinaction.knights.quest.imp.RescueQuest;

/**
 * @author DW
 * @version 1.0
 * @date 2021/4/27 11:19
 **/
public class DamselRescuingKnight implements Knight {
    private RescueQuest quest;
    public DamselRescuingKnight(){
        //紧密耦合
        this.quest = new RescueQuest();
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
