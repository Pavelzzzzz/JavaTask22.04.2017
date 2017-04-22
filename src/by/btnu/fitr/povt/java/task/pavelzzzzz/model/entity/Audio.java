package by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.myException.NotCorrectValuesMyException;

/**
 * Created by pavel on 19/04/17.
 */

public abstract class Audio implements Sound {
    private int time;

    public Audio(int time) throws NotCorrectValuesMyException {
        this.setTime(time);
    }

    @Override
    public int getTime() {
        return time;
    }

    public void setTime(int time) throws NotCorrectValuesMyException {
        if (time < 0){
            throw new NotCorrectValuesMyException("Audio, time = " + time);
        }
        this.time = time;
    }
}
