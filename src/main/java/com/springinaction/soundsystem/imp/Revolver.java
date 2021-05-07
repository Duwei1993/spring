package com.springinaction.soundsystem.imp;

import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Named("lonelyHeartClub") 建议使用@Component
public class Revolver implements CompactDisc {
    private String title = "Revolver";
    private String artist = "The Beatles";

    @Override
    public void paly() {
        System.out.println("Playing " + title + "by " + artist);
    }

}
