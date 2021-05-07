package com.springinaction.soundsystem.imp;

import com.springinaction.soundsystem.CompactDisc;
import org.springframework.stereotype.Component;

//@Component("lonelyHeartClub")
//@Named("lonelyHeartClub") 建议使用@Component
@Component("WhiteAlbum")
public class WhiteAlbum implements CompactDisc {
    private String title = "WhiteAlbum";
    private String artist = "The Beatles";

    @Override
    public void paly() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
