package com.springinaction.soundsystem.imp;

import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Named("lonelyHeartClub") 建议使用@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void paly() {
        cd.paly();
    }
}
