package by.btnu.fitr.povt.java.task.pavelzzzzz.model.util;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.basket.Disk;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.decorator.BrokenAudio;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Sound;

import java.util.Random;

/**
 * Created by pavel on 20/04/17.
 */
public class Breaker {

    public static void breakDisk(Disk disk, int countBreak, Random rand){
        Sound sound;
        int indEl;
        for(int i = 0; i < countBreak; i++){
            indEl = rand.nextInt(disk.getSize());
            sound = disk.getElement(indEl);
            disk.delete(indEl);
            disk.add(new BrokenAudio(sound, rand.nextInt(100)));
        }
    }

}
