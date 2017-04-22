package by.btnu.fitr.povt.java.task.pavelzzzzz.model.util;

import by.btnu.fitr.povt.java.task.pavelzzzzz.model.basket.Disk;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.entity.*;
import by.btnu.fitr.povt.java.task.pavelzzzzz.model.myException.NotCorrectValuesMyException;

import java.util.Random;

public class CreatorDisk {

    public enum typeOfFable{
        StoriesAboutAnimals,
        Magic,
        Social}

    public enum genreOfSong{
        Blues,
        Rap,
        Rock,
        Folk
    }

    private static Audio createAudio (AudioType audioType, Random rand){
        try {
            Audio audio = null;
            switch (audioType) {
                case Song:
                    audio = new Song(rand.nextInt(9) + 1,
                            genreOfSong.values()[rand.nextInt(3)].toString());
                    break;
                case Ambient:
                    audio = new Ambient(rand.nextInt(9) +1 ,
                            rand.nextInt(99) +1);
                    break;
                case Fable:
                    audio = new Fable(rand.nextInt(9) +1,
                            typeOfFable.values()[rand.nextInt(3)].toString());
                    break;
            }
            return audio;
        }
        catch (NotCorrectValuesMyException ex) {
            return null;
        }
    }

    public static Disk createDisk(AudioType audioType, int audioCount, Random rand){
            Disk disk = new Disk();
            for (int i = 0; i < audioCount; i++){
                switch (audioType){

                    case Audio: disk.add(createAudio(
                            AudioType.values()[rand.nextInt(3)+1], rand));
                    break;

                    case Song: disk.add(createAudio(
                            AudioType.Song, rand));
                    break;

                    case Ambient: disk.add(createAudio(
                            AudioType.Ambient, rand));
                    break;

                    case Fable: disk.add(createAudio(
                            AudioType.Fable, rand));
                    break;
                }
            }
            return disk;
    }
}
