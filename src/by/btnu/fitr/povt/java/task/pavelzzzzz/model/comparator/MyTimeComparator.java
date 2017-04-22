package by.btnu.fitr.povt.java.task.pavelzzzzz.model.comparator;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Sound;

import java.util.Comparator;

/**
 * Created by pavel on 20/04/17.
 */
public class MyTimeComparator implements Comparator<Sound> {
    @Override
    public int compare(Sound el1, Sound el2) {
        return el1.getTime() - el2.getTime();
    }
}