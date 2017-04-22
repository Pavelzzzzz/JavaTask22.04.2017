package by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.myException.NotCorrectValuesMyException;

public class Song extends Audio {

    private String genre;

    public Song(int time, String genre) throws NotCorrectValuesMyException {
        super(time);
        setGenre(genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Song (");
        output.append("time = ");
        output.append(super.getTime());
        output.append(", genre = ");
        output.append(genre);
        output.append(" )");
        return output.toString();
    }
}
