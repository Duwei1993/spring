package com.springinaction.knights.minstrel;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la , the knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee, The brave knight did embark on a quest!");
    }
}
