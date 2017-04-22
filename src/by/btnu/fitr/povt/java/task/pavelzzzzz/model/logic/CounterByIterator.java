package by.btnu.fitr.povt.java.task.pavelzzzzz.model.logic;


import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Audio;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Song;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Sound;

import java.util.Iterator;

public class CounterByIterator {

    public static int calculationTime(Iterator<Sound> iterator){
        int time = 0;
        while(iterator.hasNext()) {
            time += iterator.next().getTime();
        }
        return time;
    }
}
