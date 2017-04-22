package by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.myException.NotCorrectValuesMyException;

/**
 * Created by pavel on 19/04/17.
 */
public class Ambient extends Audio {
    private int pleasure;

    public Ambient(int time, int pleasure) throws NotCorrectValuesMyException {
        super(time);
        setPleasure(pleasure);
    }

    public int getPleasure() {
        return pleasure;
    }

    public void setPleasure(int pleasure) throws NotCorrectValuesMyException {
        if (!(pleasure > -100 && pleasure < 100)){
            throw new NotCorrectValuesMyException("Ambient, pleasure = " + pleasure);
        }
        this.pleasure = pleasure;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Ambient (");
        output.append("time = ");
        output.append(super.getTime());
        output.append(", pleasure = ");
        output.append(pleasure);
        output.append(" )");
        return output.toString();
    }
}
