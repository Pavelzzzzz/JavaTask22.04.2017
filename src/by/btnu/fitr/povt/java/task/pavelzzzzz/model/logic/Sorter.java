package by.btnu.fitr.povt.java.task.pavelzzzzz.model.logic;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.basket.Disk;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.comparator.*;

import java.util.Collections;
import java.util.List;

/**
 * Created by pavel on 19/04/17.
 */
public class Sorter {

    public static void sotr(Disk disk){
        List list = disk.getList();
        Collections.sort(list, new MyTimeComparator());
        disk.setList(list);
    }
}
