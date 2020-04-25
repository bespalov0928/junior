package ru.job4j.oop;

/**
 * class Jukebox CD-чейндежр
 * @author Bespalov
 */
public class Jukebox {

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
    }

    /**
     * проигрывает песню
     * @param position номер трека
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

}
