package by.btnu.fitr.povt.java.task.pavelzzzzz.controller;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.basket.Disk;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.AudioType;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.logic.CounterByIterator;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.logic.CounterByType;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.logic.Sorter;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.util.Breaker;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.util.CreatorDisk;
import by.btnu.fitr.povt.java.task.pavelzzzzz.view.Printer;
import by.btnu.fitr.povt.java.task.pavelzzzzz.view.Scan;

import java.util.Random;

public class Controller {

    public static void main(String[] args) {
    	Random rand = new Random();
    	Printer.print("Enter disk count ");
        int count = Scan.scanningInt();
        for (int i = 0; i < count; i++){
                Printer.print("\n Disk ");
                Printer.print(i + 1 + ":  ");
                AudioType audioType = AudioType.values()[rand.nextInt(3)];
                Printer.print(audioType.toString());
                Disk disk = CreatorDisk.createDisk(audioType,
                        rand.nextInt(6) + 3, rand);
//                Sorter.sotr(disk);
                if (audioType == AudioType.Audio){
                    Printer.print("\n\t\tSong: " + CounterByType.countType(disk, AudioType.Song));
                    Printer.print("  Ambient: " + CounterByType.countType(disk, AudioType.Ambient));
                    Printer.print("  Fable: " + CounterByType.countType(disk, AudioType.Fable));
                }
                Breaker.breakDisk(disk, rand.nextInt(disk.getSize()), rand);
                Sorter.sotr(disk);
                Printer.print("\n");
                Printer.print(disk + "");
                Printer.print("Total:   ");
                Printer.print("Time: " + CounterByIterator.calculationTime(disk.iterator()));
                Printer.print("\n");
        }
    }
}
