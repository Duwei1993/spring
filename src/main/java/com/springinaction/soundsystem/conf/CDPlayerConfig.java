package com.springinaction.soundsystem.conf;

import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.MediaPlayer;
import com.springinaction.soundsystem.imp.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan 默认扫描配置类相同的包及其子包
//@ComponentScan(basePackages = {"com.springinaction.soundsystem","com.springinaction.knights"})
//@ComponentScan(basePackageClasses = {com.springinaction.soundsystem.CompactDisc.class})
public class CDPlayerConfig {
    @Bean(name = "sgtPeppers")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cDPlayer() {
        return new CDPlayer(new SgtPeppers());
    }

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }
}
