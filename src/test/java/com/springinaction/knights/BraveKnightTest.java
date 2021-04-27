package com.springinaction.knights;

import com.springinaction.knights.knight.Knight;
import com.springinaction.knights.knight.imp.BraveKnight;
import com.springinaction.knights.quest.imp.RescueQuest;
import com.springinaction.knights.quest.imp.SlayDragonQuest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BraveKnightTest {
    public static void main(String[] args) {
        BraveKnight braveKnight = new BraveKnight(new RescueQuest());
        braveKnight.embarkOnQuest();
        braveKnight = new BraveKnight(new SlayDragonQuest(System.out));
        braveKnight.embarkOnQuest();
        //使用spring注入
        //加载spring上下文 基于xml配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        //获取knight bean
        Knight knight = context.getBean(Knight.class);
        //使用knight
        knight.embarkOnQuest();
        //关闭上下文
        context.close();

    }
}
