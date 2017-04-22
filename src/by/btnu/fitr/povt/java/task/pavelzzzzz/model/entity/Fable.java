package by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.myException.NotCorrectValuesMyException;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.util.CreatorDisk;

/**
 * Created by pavel on 19/04/17.
 */
public class Fable extends Audio {
    private String type;

    public Fable(int time, String type) throws NotCorrectValuesMyException {
        super(time);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Fable (");
        output.append("time = ");
        output.append(super.getTime());
        output.append(", type = ");
        output.append(type);
        output.append(" )");
        return output.toString();
    }
}
