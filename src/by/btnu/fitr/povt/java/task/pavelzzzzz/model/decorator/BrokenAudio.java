package by.btnu.fitr.povt.java.task.pavelzzzzz.model.decorator;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Sound;

/**
 * Created by pavel on 20/04/17.
 */
public class BrokenAudio implements Sound {

    private int damage;
    private Sound item;

    public BrokenAudio(Sound item, int damage) {
        this.damage = damage;
        this.item = item;
    }

    @Override
    public int getTime() {
        return (item.getTime() * (100 - damage) / 100);
    }

    @Override
    public String toString() {
        return item.toString() +
                " + damage = " + damage;
    }
}
