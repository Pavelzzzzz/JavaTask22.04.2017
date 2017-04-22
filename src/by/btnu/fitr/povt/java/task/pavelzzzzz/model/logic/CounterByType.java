package by.btnu.fitr.povt.java.task.pavelzzzzz.model.logic;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.basket.Disk;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.*;

/**
 * Created by pavel on 20/04/17.
 */
public class CounterByType {

    public static int countType(Disk disk, AudioType audioType){
        int countType = 0;
        for(Sound el: disk){
            switch (audioType){
                case Song:
                    if (el instanceof Song){
                        countType++;
                    }
                    break;
                case Ambient:
                    if (el instanceof Ambient){
                        countType++;
                    }
                    break;
                case Fable:
                    if (el instanceof Fable){
                        countType++;
                    }
                    break;
            }
        }
        return countType;
    }
}
