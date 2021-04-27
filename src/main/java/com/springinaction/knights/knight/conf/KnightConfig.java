package com.springinaction.knights.knight.conf;

import com.springinaction.knights.knight.Knight;
import com.springinaction.knights.knight.imp.BraveKnight;
import com.springinaction.knights.quest.Quest;
import com.springinaction.knights.quest.imp.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
