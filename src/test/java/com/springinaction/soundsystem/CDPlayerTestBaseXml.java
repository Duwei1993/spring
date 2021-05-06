package com.springinaction.soundsystem;

import com.springinaction.soundsystem.imp.SgtPeppers;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CDPlayerTestBaseXml {
    public static void main(String[] args) {
        //使用spring注入
        //加载spring上下文 基于xml配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/soundsystem/resource/appcontext.xml");
        //获取SgtPeppers bean
        CompactDisc SgtPeppers = context.getBean(SgtPeppers.class);
        CompactDisc SgtPeppers1 = (CompactDisc) context.getBean("lonelyHeartClub");
        //使用SgtPeppers
        SgtPeppers.paly();
        SgtPeppers1.paly();
        //关闭上下文
        context.close();
    }
}
