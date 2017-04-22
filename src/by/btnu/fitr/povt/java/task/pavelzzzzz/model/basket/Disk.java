package by.btnu.fitr.povt.java.task.pavelzzzzz.model.basket;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.Sound;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pavel on 19/04/17.
 */
public class Disk implements Iterable<Sound>{

    private List<Sound> list;

    public Disk() {
        list = new LinkedList<Sound>();
    }

    public Disk(List list){
        this.list = list;
    }

    public void add(Sound element) {
        list.add(element);
    }

    public void delete(int ind) {
        list.remove(ind);
    }

    public Sound getElement(int ind) {
        return list.get(ind);
    }

    public List getList(){
        return list;
    }

    public void setList(List<Sound> list){
        this.list = list;
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            out.append("   ");
            out.append(list.get(i).toString());
            out.append("\n");
        }
        return out.toString();
    }

    @Override
    public Iterator<Sound> iterator() {
        return list.iterator();
    }

}
