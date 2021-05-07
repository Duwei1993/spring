package com.springinaction.soundsystem.imp;

import com.springinaction.soundsystem.CompactDisc;
import org.springframework.stereotype.Component;

//@Component("lonelyHeartClub")
//@Named("lonelyHeartClub") 建议使用@Component
@Component("HardDaysNight")
public class HardDaysNight implements CompactDisc {
    private String title = "HardDaysNight";
    private String artist = "The Beatles";

    @Override
    public void paly() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
