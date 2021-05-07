package com.springinaction.soundsystem;

import com.springinaction.soundsystem.conf.CDPlayerConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTestBaseJava {
    @Rule
    //public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    public final SystemOutRule log = new SystemOutRule().enableLog();
    @Qualifier("randomBeatlesCD")
    @Autowired()
    private CompactDisc cd;
    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
        cd.paly();
    }
    @Test
    public void play(){
        player.paly();
        assertEquals("Playing Sgt.Peppers's Lonely Hearts Club Bandby The Beatles\r\n",log.getLog());
    }
}
