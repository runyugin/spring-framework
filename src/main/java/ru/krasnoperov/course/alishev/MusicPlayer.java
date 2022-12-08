package ru.krasnoperov.course.alishev;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Играет " + music.getSong());
    }
}
